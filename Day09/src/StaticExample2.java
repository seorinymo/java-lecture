
public class StaticExample2 {

	public static void main(String[] args) {
		System.out.println("TestStatic");
	    TestStatic ts = new TestStatic();
	    System.out.println("TestStatic2");
	    TestStatic ts2 = new TestStatic();
	    
		
	}
}



class TestStatic {
	TestStatic() {
	   System.out.println("Test Static 객체 생성");
	}
	
	//  ----- nonstatic  객체초기화 영역
	
	{
	   System.out.println("Test Static 초기화 블록 생성");
		
	}
	
	//   -----static 객체초기화 영역
	
	static {
		System.out.println("TestStatic / static 초기화 블록 실행");
	}
}