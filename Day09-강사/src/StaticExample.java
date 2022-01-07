// 1. static 은 메모리의 일정공간을 미리 만들어 놓고 
// 모든 객체들이 공유하는 공간이다. 
// 2. static 은 객체생성(new)을 필요로 하지 않는다. 
// 클래스명.속성 / 클래스명.메서드() 
// 3. static 은 속성, 메서드 등에서 사용될 수 있다. 


public class StaticExample {
 
	public static void main(String[] args) {
		
		/*BoardObject bd = new BoardObject();
		bd.read(); 
		bd.read(); 
		bd.read(); 
		bd.read(); 
		
		System.out.println("bd2 객체생성");
		BoardObject bd2 = new BoardObject();
		bd2.read();*/
		
		BoardObject.count = 10; 
		BoardObject.count ++;
		System.out.println("BoardCount : " + BoardObject.count);
		
		BoardObject.printHello();
		
		BoardObject bd = new BoardObject(); 
		bd.read();
	}
}

class BoardObject {
	static int count = 0; // Static 맴버변수(속성) 
	
	void read() {
		this.count ++; //-- 이런방식은 거의 안쓴다. (예를 위해서 쓴거임) 
		System.out.println("읽은 수 : " + count);
	}
	
	static void printHello() { // Static 메서드 
		System.out.println("Hello");
	}
}


