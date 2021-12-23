
public class mathExample {

	//산술연산
	public static void main(String args[]) {
	  
		// +,-,*,/,%
		int a = 10;
		int b = 20;
		
		// 변수 사용시 a(4bytes) + b(4bytes)= 8바이트 (이게 효율적)
		System.out.println(a+b+a+b+b);  //덧셈 
		// 토탈 사용 바이트는 4 * 5 = 20바이트
		System.out.println(10+20+10+20+20);
		
		System.out.println(a-b); // 뺄셈 = -10
		
		System.out.println(a*b); // 곱셈 = 200
		
		System.out.println("a/b="+(a/b));
		// 나눗셈 ( 0.5지만 -> 기본정수형은 int 이기 떄문에 0을 추력한다
		
		int c = 15;
		
		System.out.println("c % b ="+(c % b));
		
		
		
		
		
		
	}
}
