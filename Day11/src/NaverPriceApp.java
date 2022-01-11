import java.io.*;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;




public class NaverPriceApp {

	public static void main(String[] args) throws Exception {
//		java NaverPriceApp 맥북프로 2000000 3000000
		
		// 사용자가 규칙을 어기고 맥북프로 2000000 3백만원
//		    이란값을 넣었을때, maxPrice에는 3백만원은 Integer로 변환이 불가
		// 따라서 Exception을 발생시킨다
		
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]);
//		int maxprice = Integer.parseInt(args[2]);
		
		// 1. 개발자가 처리하는 방식	
		// try {} catch() {} finally {}
		
		String goodsName = "";
		int minPrice = 0,  maxPrice = 0;
		
		try {
		goodsName = args[0];
		minPrice = Integer.parseInt(args[1]);
		maxPrice = Integer.parseInt(args[2]);
	} 	catch(NumberFormatException ne) {
		// try 구문중에 NumberFormatException이 발생할 경우 실행
		System.out.println("사용법 > java NaverPriceApp 상품명 최소가격 최대가격");
		System.out.println("ex > java NaverPriceApp 아이패드 10000 20000");
//		return;
	}   catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("3개넣어");
//		return;
		
	}	catch(Exception ex) {
		System.out.println("도대체 뭘넣은거야");
//		return;
		
	}   finally {
		System.out.println("마침내");
		
	}
				
		//https://search.shopping.naver.com/search/all?maxPrice=50000&minPrice=10000&productSet=total&query=아이패드&sort=price_asc
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL, maxPrice, minPrice, goodsName );
		
		//String URL = "http://ko.wikipedia";
		System.out.println(URL);
		
		
		//  1. java.net 패키지 사용하기
//		String html = getHtmlByJsoup(URL);
//		System.out.prinln(html);
		
		getHtmlByJsoup(URL);
		
		
		
		String html = getHtml(URL);
		System.out.println(html);
	
	}
	
	//  JSoup 로  html parse
	 	private static void getHtmlByJsoup(String pUrl) { //throws Exception {
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		Elements files = html.select(".list_basis");
		
	}
	
	
	
	// URL을 가지고 , 접속, html파일을 가지고 온다
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		HttpURLConnection conn;   // 웹 연결 클래스
		BufferedReader rd;        // 라인단위 input 클래스
		String line;				// 라인단위로 읽을 string 을 임시저장
		URL url = new URL(pUrl);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		while((line = rd.readLine()) != null) {
			result += line + "\n";   // result = result + line + "\n"
		}
		
		rd.close();
		
		
		return result;
		
	
	}
	
		
		
		
		
		
		
		//String.format(URL, args)      // String 클래스의  static 메소드
			
		
		
//		String name = "이종석";
//		String home = "집";
//		String dong = "독산동";
//		
//		System.out.println(name +"의" + home + "은" + dong + "입니다");
//		
//		String format = "%s의 %s은 %s입니다";    // %s : 문자열, /  %d : 숫자
//		format = String.format(format,  name, home, dong );
//		System.out.println(format);
		
	
	}
