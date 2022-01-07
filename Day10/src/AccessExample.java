// 접근제한(한정)자
// public > protected > (default) > private
// 사용방법
// 1. 멤버(속성)변수에 사용가능
// ex) public int age; [접근제한자] 데이터 타입 변수명;
// 2. 클래스에 사용가능
// ex) class Person [접근제한자] class 클래스명
// 3. 메서드에 사용가능
// ex) int plus(int x, int y) [접근제한자] 리턴타입 메서드명(매개변수)

import kr.education.*;

public class AccessExample {

	public static void main(String[] args) {
		// 동일패키지 내에 default 제한자를 가지는
		// 클래스, 속성, 메서드는 아무 제한없이 사용 가능하다
		Student std1 = new Student();
		std1.name = "뭐야";
		std1.grade = 10;
	    std1.printMySelf();
		
	    // 다른패키지에 public 클래스라서 참조가능
		StudentDefalt std2 = new StudentDefault
		// StudentDefault 클래스의 name 속성은 public 이라 참조가능
				std2.name = "아아아이";
		//다른패키지의 default 속성이라 참조할수 없다 ( 에러)
		// std2.grade = 10;
	}
}
		