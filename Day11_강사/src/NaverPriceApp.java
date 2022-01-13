import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


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
		
		Elements files = html.select(".list_basis");
		
		System.out.println(files.size());
		
		for( int i = 0; i < files.size(); i ++) {
			System.out.println(files.get(i).text());
		}
		
	}
	
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
