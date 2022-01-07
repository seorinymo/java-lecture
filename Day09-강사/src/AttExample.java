import student.*;

public class AttExample {

	public static void main(String[] args) {
	
		//-- 일반 객체생성 
		EleStudent ele1 = new EleStudent(); 
		ele1.name = "이종석";
		ele1.printName(); 
		
		EleStudent ele2 = new EleStudent(); 
		ele2.printName();
		
		//-- 싱글턴 패턴 
		System.out.println("싱글턴 패턴");
		EleStudent ele3 = EleStudent.getInstance();
		ele3.name = "이종석2";
		ele3.printName(); 
		EleStudent ele4 = EleStudent.getInstance();
		ele4.printName(); 
		EleStudent ele5 = EleStudent.getInstance();
		ele5.printName(); 
		
	}
	
	
}
