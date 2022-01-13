import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;


public class NaverPriceApp {
  
	public static void main(String args[]) throws Exception {
		//java NaverPriceApp �ƺ����� 2000000 30000000
		
		//-- ����ڰ� ��Ģ�� ���� �ƺ����� 2000000 3�鸸�� 
		//-- �̶� ���� �־�����, maxPrice���� 3�鸸���� Integer�� ��ȯ�� �Ұ�
		//-- ���� Exception �� �߻���Ų��. 
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]); 
//		int maxPrice = Integer.parseInt(args[2]);
//		
		// 1. �����ڰ� ó���ϴ� ��� 
		// try {} catch() {} finally {} 
		
		String goodsName = "" ; 
		int minPrice = 0, maxPrice = 0; 
		
		try {
			goodsName = args[0];
			minPrice = Integer.parseInt(args[1]);
			maxPrice = Integer.parseInt(args[2]);
		} catch(NumberFormatException ne) {
			//-- try �����߿� NumberFormatException�� �߻��� ��� ���� 
			System.out.println("���� > java NaverPriceApp ��ǰ�� �ּҰ��� �ִ밡�� ");
			System.out.println("ex > java NaverPriceApp �����е� 10000 20000 "); 
			//return;
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("3���־� �̼�����.");
			//return;
		} catch(Exception ex) {
			System.out.println("����ü �� �����ž�?");
			//return;
		} finally {
			System.out.println("��ħ��...");
		}
		
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc"; 
		URL = String.format(URL, maxPrice, minPrice, goodsName ); 
		System.out.println(URL);
		
		//-- 1. java.net ��Ű�� ����ϱ� 
		//String html = getHtmlByJsoup(URL);
		//System.out.println(html);
		getHtmlByJsoup(URL);
		
	}
	
	//-- JSoup �� HTML Parse 
	private static void getHtmlByJsoup(String pUrl) throws Exception {
		
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		//Elements files = html.select(".list_basis");
		Elements files = html.select(".list_basis > div > div");
		writeTxtFile("d:\\price.txt", files);
		writeExcelFile("d:\\price.csv", files);
		
		
		//System.out.println(".list_basis�� ����" + files.size());
		
		// List<Element>
//		for( Element item : files ) {
//			
//			String goodsName = item.select(".basicList_link__1MaTN").text();
//			String price = item.select(".price_num__2WUXn").text(); 
//			String link = item.select(".basicList_link__1MaTN").attr("href");
//			
//			System.out.println(goodsName + "  " + price);
//			System.out.println(link);
//		}
		
//		for( int i = 0; i < files.size(); i ++) {
//			System.out.println(files.get(i).text());
//		}
		
//		//--- �÷���
//		//--- ���� �迭 / �迭���� ����� ������ ����Ҷ� ���ϰ� ����� �� �ִ�.
//		
//		//1. �� 
//		//arr[0] = "������"
//		//arr[1] = "45"
//		//"name" = "������"
//		//"age" = "45" 
//		Map<String, String> map = new HashMap<String, String>(); 
//		Map<String, String> map2 = new HashMap<String, String>(); 
//		Map<String, String> map3 = new HashMap<String, String>(); 
//		
//		//-- ���� �ִ´�.
//		map.put("name", "������");
//		map.put("age", "45");
//
//		map2.put("name", "������2");
//		map2.put("age", "55");
//
//		map3.put("name", "������3");
//		map3.put("age", "65");
//		
//		//-- ���� ������.
//		//out.println(map.get("name"));
//		
//		
//		// List
//		// �����迭 
//		
//		List<Map> list = new ArrayList<Map>();
//		list.add(map);
//		list.add(map2);
//		list.add(map3);
//		
//		((Map)list.get(0)).get("name"); //-- �������� ���� 
//		list.get(1);
//		list.get(2);
//		
//		System.out.println(list.size());
//		
//		
//		for( int i = 0; i < list.size(); i ++) {
//			
//			//-- ���ʸ�(List<Map> : �� Map ��ü�� �ްھ�) 
//			System.out.println("�̸� :" + list.get(i).get("name"));
//			
//			//-- ���ʸ�(List<Map>)�� �ƴҶ��� ����ȯ�� �ʿ� 
//			System.out.println("�̸� : " 
//							   + ((Map)list.get(i)).get("name") 
//							   + ", ���� : "
//							   + ((Map)list.get(i)).get("age")); 
//		}
//		
//		
//		//-- List �÷����� "���� For��" 
//		// foreach
//		for(Map item : list) {
//			System.out.println("�̸� : " + item.get("name") 
//							 + ",���� : " + item.get("age"));
//		}
		
		// Quiz for������ ���� ���ǵ� list�� �Ʒ��� ���� ����ϴ� ���α׷��� ������.
		//�̸� : ������, ���� : 45 
		//�̸� : ������2, ���� : 55 
		//�̸� : ������3, ���� : 65 
		
		
		
		
	}
	

	private static void writeExcelFile(String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); // file = d:\price.csv
		BufferedWriter writer = null; 
		String lineFormat = "%d,%s,%s,%s\r\n"; 
		String result = "����,��ǰ��,����,��ũ\r\n";
		int i = 1; 
		
		for( Element item : list ) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text().replace(",", ""); 
			String link = item.select(".basicList_link__1MaTN").attr("href");
			result += String.format(lineFormat, i++, goodsName, price, link);
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch(IOException ie) {
			
		} finally {
			if(writer != null) writer.close();
		}
		
	}
	
	private static void writeTxtFile(String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); // file = d:\price.txt
		BufferedWriter writer = null; 
		String lineFormat = "%s %s link:%s\r\n"; 
		String result = "";
		
		for( Element item : list ) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text(); 
			String link = item.select(".basicList_link__1MaTN").attr("href");
			result += String.format(lineFormat, goodsName, price, link);
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch(IOException ie) {
			
		} finally {
			if(writer != null) writer.close();
		}
		
	}
	
	//-- java.net package
	//-- URL�� ������, ����, HTML������ ������ �´� 
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		
		HttpURLConnection conn;  //-- �� ���� Ŭ���� 
		BufferedReader rd;       //-- ���δ��� Input Ŭ����
		String line;             //-- ���δ����� ���� String�� �ӽ� ����
		
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
