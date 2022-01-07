import student.EleStudent; 
// student 패키지/폴더에 EleStudent 라는 클래스만 사용할꺼야.
//import java.io.ByteArrayInputStream;

//import student.*; 
//student 패키지/폴더에 있는 모든 클래스들을 참조할 수 있다.

public class PackageExample {

	public static void main(String[] args) {
		//student.EleStudent ele = new student.EleStudent();
		//import 없이 모든 코드에 패키지/폴더명을 명시해서 사용할 수 있다. 
		EleStudent ele = new EleStudent();
		ele.name = "이종석";
		ele.grade = 4; 
	}
	
}
