// 비트연산
public class BitExample {

	public static void main(String[] args) {
		
		//-2진수 출력
		int a = 10, b = 11;
		System.out.println( Integer.toBinaryString(a) );
		System.out.println( Integer.toBinaryString(b) );
		
		//---
		System.out.println("a | b=" + (a|b));
		System.out.println("a & b=" + (a&b));
		System.out.println("a ^ b="+ (a^b));
		
		
		// 
		System.out.println(Integer.toBinaryString(-1));
		
		
		
		// Shift 연산
		// >>, <<, >>>
		//char x = 10;   // -> 00001010 ( 8bits )
		               // -> 00000010
		// char y = a >> 2;  --> 00001010 (10) 뒤를지우고 왼쪽앞에 0을붙임
		//System.out.println("x >> 2 = " +(x>>2));
		
		//우측 Shift
		byte x = -10;
		System.out.println("-10 >> 5= "+ Integer.toBinaryString(x >> 5));
		
		
		//좌측 Shift
	    System.out.println("-10 << 5= "+ Integer.toBinaryString(x << 5));
        //뒤를 0으로 채운다

	    byte z = 1;
	    System.out.println("1 << 7="+ (z << 7));
	    
	    // 연산은 integer 로 계산한다
	    // 1111111 -1 -> 1로시작하면 음수 , 0으로 시작하면 정수
	    
	    
	    
	}
}
