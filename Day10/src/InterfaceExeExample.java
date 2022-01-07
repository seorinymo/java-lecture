
public class InterfaceExeExample {
	public static void main(String[] args) {
	
	// 1. 추상클래스는 new로 객체생성가능? -> 불가능
	// 이유는 구형이 모두 안되어 있다
	// 2. 인터페이스는? new로 객체생성가능 ? -> 불가능
	// 이유는 a) interface 는 class가 아니라서 객체생성이 불가능
	// b) 구현이 없어 -> 객체생성 불가능
	// !) interface 는 너와 나의 통신규약을 만드는거

	
	InterfaceExample im = new SKInternet();
	InterfaceExample im2 = new LGInternet();
	
 }
}

class ImCC extends Father implements AA, BB, CC {
	void aa() {
	}
	
	
	
}

