import student.*;

public class AttExample {

	public static void main(String[] args) {
		
		///�Ϲݰ�ü����
		EleStudent ele1 = new EleStudent();
		ele1.name = "������";
		ele1.printName();
		
		EleStudent ele2 = new EleStudent();
		ele2.printName();
		
		
		//-- �̱��� ����
		System.out.println("�̱��� ����");
		EleStudent ele3 = EleStudent.getInstance();
		ele3.name = "������2";
		ele3.printName();
		EleStudent ele4 = EleStudent.getInstance();
		ele4.printName();
		EleStudent ele5 = EleStudent.getInstance();
		ele5.printName();
	}
}
