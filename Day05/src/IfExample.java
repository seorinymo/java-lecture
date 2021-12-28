
//-- 조건문 IF 
public class IfExample {
	
	public static void main(String[] args) {
		
		// 1. if 문의 구조는 
		// if (조건비교문) { 참일때 실행 }
		// if (조건비교문) { 참일때 실행 } else { 거짓일때 실행 }
		// if (조건기교문) { 참 } else if(조건비교문) { 참 } else { 거짓 } 
	    // if () {} else if() {} 
		
		int a = 10, b = 15; 
		if( a != 10 || b > 15) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		if(false) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		
		int c = 11; 
		int d = 0; 

		if(c % 2 == 0 || d++ > 0) {
			System.out.println("c는 2로 나눠지는 수");
		} else if( c % 3 == 0 || d++ > 0) {
			System.out.println("c는 3으로 나눠지는 수");
		} else if( c % 4 == 0 || d++ > 0) {
			System.out.println("c는 4로 나눠지는 수");
		} else if( c % 1 == 0 || d++ > 0) {
				System.out.println("c는 1로 나눠지는 수");
		} else {
			System.out.println("c는 나눠지는 수가 없음");
		}
 		
		System.out.println(d);
//		
//		if(c % 2 == 0) {
//			System.out.println("c는 2로 나눠지는 수");
//		} else if( c % 3 == 0) {
//			System.out.println("c는 3으로 나눠지는 수");
//		} else if( c % 4 == 0) {
//			System.out.println("c는 4로 나눠지는 수");
//		} else if( c % 1 == 0) {
//			System.out.println("c는 1로 나눠지는 수");
//		} else {
//			System.out.println("c는 나눠지는 수가 없음");
//		}
// 		
		
		
	}
	
	
}
