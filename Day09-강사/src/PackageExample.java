import student.EleStudent; 
// student ��Ű��/������ EleStudent ��� Ŭ������ ����Ҳ���.
//import java.io.ByteArrayInputStream;

//import student.*; 
//student ��Ű��/������ �ִ� ��� Ŭ�������� ������ �� �ִ�.

public class PackageExample {

	public static void main(String[] args) {
		//student.EleStudent ele = new student.EleStudent();
		//import ���� ��� �ڵ忡 ��Ű��/�������� ����ؼ� ����� �� �ִ�. 
		EleStudent ele = new EleStudent();
		ele.name = "������";
		ele.grade = 4; 
	}
	
}
