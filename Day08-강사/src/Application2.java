
public class Application2 {
	
	public static void main(String args[]) {
//		Korean k = new Korean(); 
//		k.name = "���� �ѱ���";
//		k.sayHello();
		
		
		Person p = new Japanese(); 
		p.name = "�����";
		p.sayHello();
	}
}

//class ����
//[����������] class Ŭ������ { // ���� } 
class Person {
	
	String name; 
	
	public void sayHello() {
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
	}
}

// ����� extends [Class��] 
class Korean extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
	}
}

class Japanese extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. ������.");
	}
}

class chinese extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. ���Ͽ�.");
	}
}


