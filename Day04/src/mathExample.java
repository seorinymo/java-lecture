
public class mathExample {

	//�������
	public static void main(String args[]) {
	  
		// +,-,*,/,%
		int a = 10;
		int b = 20;
		
		// ���� ���� a(4bytes) + b(4bytes)= 8����Ʈ (�̰� ȿ����)
		System.out.println(a+b+a+b+b);  //���� 
		// ��Ż ��� ����Ʈ�� 4 * 5 = 20����Ʈ
		System.out.println(10+20+10+20+20);
		
		System.out.println(a-b); // ���� = -10
		
		System.out.println(a*b); // ���� = 200
		
		System.out.println("a/b="+(a/b));
		// ������ ( 0.5���� -> �⺻�������� int �̱� ������ 0�� �߷��Ѵ�
		
		int c = 15;
		
		System.out.println("c % b ="+(c % b));
		
		
		
		
		
		
	}
}
