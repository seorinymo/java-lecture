import student.EleStudent;
// student 패키지/폴더에 EleStudent 라는 클래스만 사용할거야

//import student.*;   
// -> student 패키지/폴더에 있는 모든 클래스들을 참조할수 있다


public class PackageExample {

	public static void main(String[] args) {
		EleStudent ele = new EleStudent();
		ele.name = "이종석";
		ele.grade = 4;
		
		
	}
}
