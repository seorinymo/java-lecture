// ��Ʈ����
public class BitExample {

	public static void main(String[] args) {
		
		//-2���� ���
		int a = 10, b = 11;
		System.out.println( Integer.toBinaryString(a) );
		System.out.println( Integer.toBinaryString(b) );
		
		//---
		System.out.println("a | b=" + (a|b));
		System.out.println("a & b=" + (a&b));
		System.out.println("a ^ b="+ (a^b));
		
		
		// 
		System.out.println(Integer.toBinaryString(-1));
		
		
		
		// Shift ����
		// >>, <<, >>>
		//char x = 10;   // -> 00001010 ( 8bits )
		               // -> 00000010
		// char y = a >> 2;  --> 00001010 (10) �ڸ������ ���ʾտ� 0������
		//System.out.println("x >> 2 = " +(x>>2));
		
		//���� Shift
		byte x = -10;
		System.out.println("-10 >> 5= "+ Integer.toBinaryString(x >> 5));
		
		
		//���� Shift
	    System.out.println("-10 << 5= "+ Integer.toBinaryString(x << 5));
        //�ڸ� 0���� ä���

	    byte z = 1;
	    System.out.println("1 << 7="+ (z << 7));
	    
	    // ������ integer �� ����Ѵ�
	    // 1111111 -1 -> 1�ν����ϸ� ���� , 0���� �����ϸ� ����
	    
	    
	    
	}
}
