
public class TypeCastingExample {

	public static void main(String [] args) {
		// ������ ������Ÿ��
		// ����� ����ȯ  
		int a = 10; // 4 bytes
		short b = (short)a;  // 2 bytes  (������Ÿ��)
		
		// ������ ����ȯ (�����Ÿ� ū�ſ�)
		short c = 100;  // 2bytes
		int d = c;  // 4 bytes
		
		//byte x = 128;  // 1 bytes -128~127 ���� ���

		// example 
		int a1 = 128;
		byte x1 = (byte)a1;
		
		System.out.println(x1);  // ������ �� (-128)
		
		//int z = 3f;
		//double zx = 3l;
		
		double xa = 3.6441;
	    int xb = (int)xa;
	    System.out.println(xb);
	    
	    
	    int ya = 10;
	    double yb = ya;
	    System.out.println(yb);
	    
	}
}
