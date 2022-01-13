import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;


public class NaverPriceApp {
  
	public static void main(String args[]) throws Exception {
		//java NaverPriceApp 맥북프로 2000000 30000000
		
		//-- 사용자가 규칙을 어기고 맥북프로 2000000 3백만원 
		//-- 이란 값을 넣었을때, maxPrice에는 3백만원은 Integer로 변환이 불가
		//-- 따라서 Exception 을 발생시킨다. 
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]); 
//		int maxPrice = Integer.parseInt(args[2]);
//		
		// 1. 개발자가 처리하는 방식 
		// try {} catch() {} finally {} 
		
		String goodsName = "" ; 
		int minPrice = 0, maxPrice = 0; 
		
		try {
			goodsName = args[0];
			minPrice = Integer.parseInt(args[1]);
			maxPrice = Integer.parseInt(args[2]);
		} catch(NumberFormatException ne) {
			//-- try 구문중에 NumberFormatException이 발생할 경우 실행 
			System.out.println("사용법 > java NaverPriceApp 상품명 최소가격 최대가격 ");
			System.out.println("ex > java NaverPriceApp 아이패드 10000 20000 "); 
			//return;
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("3개넣어 이세끼야.");
			//return;
		} catch(Exception ex) {
			System.out.println("도대체 뭘 넣은거야?");
			//return;
		} finally {
			System.out.println("마침내...");
		}
		
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc"; 
		URL = String.format(URL, maxPrice, minPrice, goodsName ); 
		System.out.println(URL);
		
		//-- 1. java.net 패키지 사용하기 
		//String html = getHtmlByJsoup(URL);
		//System.out.println(html);
		getHtmlByJsoup(URL);
		
	}
	
	//-- JSoup 로 HTML Parse 
	private static void getHtmlByJsoup(String pUrl) throws Exception {
		
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		Elements files = html.select(".list_basis > div > div");
		
		System.out.println(".list+basis의길이" + files.size());
		
		//List<Element>
		for( Element item : files ) {
			
			System.out.println(item.text());
			String goodsName = item.select(".basicList_link__1MaTN");
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select("basicList_link__1MaTN").attr("href");
			System.out.println(goodsName + " " + price);
			System.out.println(link);
		}
		
		
//		for( int i = 0; i < files.size(); i ++) {
//			System.out.println(files.get(i).text());
//		}
//		
//		//--- 컬렉션
//		//--- 가변 배열 / 배열같은 모양의 집합을 사용할때 편하게 사용할 수 있다
//		
//		//1. 맵
//		//arr[0] = "이종석"
//		//arr[1] = "45"
//		//"name" = "이종석"
//		//"age" = "45"
//		
//		Map<String, String> map = new HsahMap<String<String, String>();
//		Map<String, String> map2 = new HsahMap<String<String, String>();
//		Map<String, String> map3 = new HsahMap<String<String, String>();
//		
//		// 값을 넣는다
//		map.put("name", "이종석");
//		map.put("age, "45");"
//				
//				map2.put("name", "이종석2");
//		map2.put("age, "55");"
//				
//				map3.put("name", "이종석3");
//		map3.put("age, "65");"
//				
//	    // 값을 꺼낸다
//		System.out.println(map.get("name"));
//		
//		// List
//		// 가변배열
//		
//		List<Map> list = new ArrayList<Map>();
//		list.add(map);
//		list.add(map2);
//		list.add(map3);
//		
//		System.out.println(list.size());
//		
//	//	<> list.get(0);
//		((Map.get(0)).get("name"); //꺼내오기예제
//		list.get(1);
//		list.get(2);
//		
//		System.out.println(list.size());
//		
//		
//		for( int i = 0; i < list.size(); i++)	{
//			
//			// 제너릭(List<Map>) : 난 Map 객체만 받겠어
//			System.out.println("이름:" + list.get(i).get("name");
//			
//			// 제너릭(List<Map>)이 아닐때는 형변환이 필요
//			System.out.println("이름:"
//								+ ((map)list.get(i).get("name")
//								+ ", 나이 : "
//								+ ((map)list.get(i).get("age")
//		}
//		
//		// List 컬렉션의 "향상된 For문"
//		
//		for(Map item : list) {
//			System.out.println("이름 :" + item.get("name") 
//					         + ", 나이 : " + item.get("age"));
//			
			
		}
		
		
	
	
	
	pricate static void writeTxtFile(String FileName, Elements list	) {
		
		File file = new File(fileName);
		BufferedWriter writer = null;
		
		writer = new BufferedWriter(new FileWriter(file));
		
		
	}
	//-- java.net package
	//-- URL을 가지고, 접속, HTML파일을 가지고 온다 
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		
		HttpURLConnection conn;  //-- 웹 연결 클래스 
		BufferedReader rd;       //-- 라인단위 Input 클래스
		String line;             //-- 라인단위로 읽을 String을 임시 저장
		
		URL url = new URL(pUrl);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		while((line = rd.readLine()) != null) {
			result += line + "\n"; // result = result + line + "\n"
		}
		
		rd.close(); 
		return result;
	
	}
	
	
}
