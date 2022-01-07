// 일반적인 클래스 선언문
// 접근제한자 class 클래스명


public class AbstractClassExample {
	 public static void main(String[] args) {
		 AbstractStudent s = new AbstractSubClass();
		s.printName();
		 s.printGrade();
		 	 
	 }
}


// 추상클래스
// abstract class 클래스명
abstract class AbstractStudnet {
	
	String name = "이종석";
	int grade = 3;
	
	void printName() {
		System.out.println("이름은"+ name + "입니다");
		
	}
	abstract void printGrade();
	
}

class AbstractSubClass extends AbstractStudent {
	
	void printGrade() {
		System.out.println("학년은"+ grade+ "입ㄴ디ㅏ");
		
	}
	
}