//������
public class LogicalExamlpe {

	public static void main(String[] args) {
		
		// AND, OR, XOR, NOT
		
		// 1. AND ����
		// &, && -> true & true, true && true
		// ���� ��� '��'�̾�� ������� ���̴�
		// && : ������ Ʋ���� ���� Ʋ����false �Ѿ��
		// &&�� false && true�� ������ ������, false�� ���� ���� ���� ������ �� �ʿ�����Ƿ� �н�
		
			
		int a = 10, b = 15;
		boolean result = (a!=b) && (a < b);
		System.out.println(result && false);
		
		int c = 10, d = 10;
		//System.out.println((c++ == d ++)&& (c>d));
		//System.out.println((c>d) &&(c++ ==++d));
		//System.out.println("c="+c+","+"d="+d);
		
		
		System.out.println((c>d) &(c++ ==++d));
		System.out.println("c="+c+","+"d="+d);
		
		// & �� ���� �ٺ���. false & true 
		
		//---------
		
		// 2. OR ����
		// |,||
		// ���� �ϳ��� true�� ������ true
		
		int x = 100, y = 200;
		
		System.out.println(x!=y ||(x++ == y++));
		System.out.println("x="+ x + "," +"y="+ y);
		
		//---------
		
		
		// 3. XOR ����
		// ^
		// ������ �޶�� true / ������ ������ false
		// true ^ true = ? (false)
		// true ^ false = ? (true)
		// false ^ false = ? (false)
		
		
		//---------
		
		// 4. NOT
		// !true == false
		// !falser == true
		// a != b
		
		
		
		
		
		
		
		
	}
	
	
}
