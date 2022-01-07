// -- ��Ӱ� �������̵�  
public class Application4 {

	public static void main(String args[]) {
		
		Asian[] arr = new Asian[3];
		arr[0] = new Asian();
		arr[1] = new JapanPerson(); 
		arr[2] = new KoreaPerson(); 
		
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i].getAge());
		}
		
	}
	
}

class Asian {
	
	String name; // �̸� 
	int age = 20; // ����  
	
	void sayHello() { // �λ縻 �޼���
		System.out.println("hello");
	}
	
	int getAge() { // ���� �޼��� 
		return age;
	}
	
}
// ����� class Ŭ������ extends �ƺ�Ŭ������
// 1. �������̵� (��ø)
// �������̵��� ����Ÿ�� / �޼ҵ�� / �Ű������� ��� ���� 
class JapanPerson extends Asian {
	int getAge() {
		return age - 1;
	}
}

class KoreaPerson extends Asian {
	int getAge() {
		return age; 
	}
}


