



//-- Application ���� ��Ÿ�� ����Ʈ 
public class Application {

	public static void main(String[] args) {
		
		Person p = new Person(); // �� ���տ� ���̴� ��(����ȭ) = �޸𸮿� �ö���ִ�
		p.name = "������";
		p.sayHello();
		
		Person p2 = new Person(); 
		p.name = "�Ͼ��Ͼ�";
		p.sayHello(); 
		
		//-- �ּҰ� �񱳷� ���� �� ����,. 
		if( p == p2 ) {
			System.out.println("p�� p2�� ���ƿ�.");
		} else {
			System.out.println("p�� p2�� ���� �ʾƿ�.");
		}
		
		//-- ��ü ��ü�� ���ϴ°� (���� Ŭ���� ����̳�?) = instanceof ������. 
		if( p instanceof Person ) {
			// ���೻��.
		} 
		
		if( p2 instanceof Person ) {
			// ���೻��.
		}
		
		
		
	}
	
}


// class ����
// [����������] class Ŭ������ { // ���� } 
class Person1 {
	
	String name; 
	
	public void sayHello() {
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
	}
}

