// final 
// 클래스, 메서드, 속성
// ex) 클래스에 final = 상속 안하겠다
// ex) 메서드에 final = 오버라이딩(중첩)을 허용 안하겟다
// ex) 속성/변수에 final = 값을 변경할수 없게하겠다
// 문법 final class 클래스명
// final 리턴타입 메서드명 (매개변수)
// final 데이터타입 변수명 = 값

// 상수명
// final static 데이터타입 상수명 = 10;
// final static double PI = 3.145121323;
// static final double PI = 3.145121323;

public class FinalExample {
	final static double PI = 3.145121323;
	public static void main(String[] args) {
//		AO ao = new BO();
//		ao.printName();
		
	}

}




// final 메소드 예제
//
//class AO {
//	void printName() {
//		System.out.println("이종석");
// }
//	
//	}
//
//
//class BO extends AO {
//	void printName() {
//		System.out.println("박은진");
//	}
//}
//
////아버지 BO의 메서드가 final이므로, 메서드 중첩(오버라이딩)을 할수없다
//class CO extends BO {
//	void printName() { // 에러

		
		
// final 속성 (변수 ) 예제		
//final 속성/변수는 한번 초기화(값이 들어간이후) 변경이 불가능하다
//다만 생성자를 통한 초기화의 경우만 예외로 한다
//class AO {
//	final int grade; 
//	AO(int grade) {
//		this.grade = grade;
//		
//	}
//}
//
//
//class BO extends AO {
//	void changeGrade() {
//		// 값 직접입력은 불가능
//		// this.grade = 100;
//		new AO(1);
//		
	



// final class 예제
//final class AO{
//	String name = "이종석 ";
//	
//	
//}
////final 클래스는 상속을 할수없으므로 에러를 발생시킨
//class BO extends AO{
//	
//}