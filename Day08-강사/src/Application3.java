
public class Application3 {
	public static void main(String args[]) {
		//-- 객체를 생성하는 방법
		MathExample math = new MathExample(); 
		int sum = math.plus(10, 20);
		System.out.println(sum);
		
		// Stack 구조 Last In First Out (LIFO) 
		System.out.println(math.minus(math.plus(10, 20), 100));
		
		// 재귀메소드 
		System.out.println(math.fact(4));
	}
}

//-- 1. 클래스 정의 
class MathExample {
	
	//-- 메소드들(행위) 
	//-- 메소드 문법 
	//-- [접근한정자] 리턴데이터타입 메소드명 ( 매개변수 ) { 
	//    행동 문단  
	//}
	// void 리턴이 없는 메소드
	void printName() {
	  System.out.println("안녕");	
	}
	
	int plus(int x, int y) {
		return x + y;
	} 
	
	int minus(int x, int y) {
		return x - y; 
	}
	

	// 4! = 4*3*2*1 
	// 100! = 100*99*.........1;
	public int fact(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fact(n-1) * n;
		}
	}

	
}