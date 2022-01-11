import java.io.*;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;




public class NaverPriceApp {

	public static void main(String[] args) throws Exception {
//		java NaverPriceApp �ƺ����� 2000000 3000000
		
		// ����ڰ� ��Ģ�� ���� �ƺ����� 2000000 3�鸸��
//		    �̶����� �־�����, maxPrice���� 3�鸸���� Integer�� ��ȯ�� �Ұ�
		// ���� Exception�� �߻���Ų��
		
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]);
//		int maxprice = Integer.parseInt(args[2]);
		
		// 1. �����ڰ� ó���ϴ� ���	
		// try {} catch() {} finally {}
		
		String goodsName = "";
		int minPrice = 0,  maxPrice = 0;
		
		try {
		goodsName = args[0];
		minPrice = Integer.parseInt(args[1]);
		maxPrice = Integer.parseInt(args[2]);
	} 	catch(NumberFormatException ne) {
		// try �����߿� NumberFormatException�� �߻��� ��� ����
		System.out.println("���� > java NaverPriceApp ��ǰ�� �ּҰ��� �ִ밡��");
		System.out.println("ex > java NaverPriceApp �����е� 10000 20000");
//		return;
	}   catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("3���־�");
//		return;
		
	}	catch(Exception ex) {
		System.out.println("����ü �������ž�");
//		return;
		
	}   finally {
		System.out.println("��ħ��");
		
	}
				
		//https://search.shopping.naver.com/search/all?maxPrice=50000&minPrice=10000&productSet=total&query=�����е�&sort=price_asc
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL, maxPrice, minPrice, goodsName );
		
		//String URL = "http://ko.wikipedia";
		System.out.println(URL);
		
		
		//  1. java.net ��Ű�� ����ϱ�
//		String html = getHtmlByJsoup(URL);
//		System.out.prinln(html);
		
		getHtmlByJsoup(URL);
		
		
		
		String html = getHtml(URL);
		System.out.println(html);
	
	}
	
	//  JSoup ��  html parse
	 	private static void getHtmlByJsoup(String pUrl) { //throws Exception {
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		Elements files = html.select(".list_basis");
		
	}
	
	
	
	// URL�� ������ , ����, html������ ������ �´�
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		HttpURLConnection conn;   // �� ���� Ŭ����
		BufferedReader rd;        // ���δ��� input Ŭ����
		String line;				// ���δ����� ���� string �� �ӽ�����
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
	
		
		
		
		
		
		
		//String.format(URL, args)      // String Ŭ������  static �޼ҵ�
			
		
		
//		String name = "������";
//		String home = "��";
//		String dong = "���굿";
//		
//		System.out.println(name +"��" + home + "��" + dong + "�Դϴ�");
//		
//		String format = "%s�� %s�� %s�Դϴ�";    // %s : ���ڿ�, /  %d : ����
//		format = String.format(format,  name, home, dong );
//		System.out.println(format);
		
	
	}
