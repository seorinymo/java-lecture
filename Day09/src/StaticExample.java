// 1. static �� �޸��� ���������� �̸� ����� ����
// ��� ��ü���� �����ϴ� �����̴�
// 2. static �� ��ü����(new)�� �ʿ�� ���� �ʴ´�
// Ŭ������.�Ӽ� / Ŭ������.�޼���()
// 3. static �� �Ӽ�, �޼��� ��� ���ɼ� �ִ�







public class StaticExample {

	public static void main(String[] args) {
	
/*		BoardObject bd = new BoardObject(); 
		bd.read();
		bd.read();
		bd.read();
		bd.read();
		
		System.out.println("bd2 ��ü����");
		BoardObject bd2 = new BoardObject();
		bd2.read(); */
		
		
		BoardObject.count = 10;
		BoardObject.count ++;
		System.out.println("BoardObject : " +BoardObject.count);
		
		BoardObject.printHello();
		
		BoardObject bd = new BoardObject();
		bd.read();
		
		}
}

class BoardObject {
	static int count = 0;     // Static �������(�Ӽ�)
	void read() {		
		this.count ++;     //���� ��������
		System.out.println("���� �� : " + count);
		
	}



	static void printHello() {       // Static �޼���
		System.out.println("Hello");
		
	}

}
