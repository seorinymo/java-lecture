// �������̽��� 
// ���������� interface �������̽� ��

// ���ͳ� ���ۿ� �������̽�
public interface InterfaceExample {

	void connect();
	void close();
	void speedUp();
	void speedDown();

}

class SKInterface implements InterfaceExample {
	@Override
	public void connect() {
		System.out.println("�����ϱ� �����߾��sk");
	}

	@Override
	public void close() {
		System.out.println("�ݾƿ�sk");	
		
	}

	@Override
	public void speedUp() {
		System.out.println("�ӵ��÷���sk");		
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ�������sk");		
	}
	
	
	
	class LGInterface implements InterfaceExample {
		@Override
		public void connect() {
			System.out.println("�����ϱ� �����߾��lg");
		}

		@Override
		public void close() {
			System.out.println("�ݾƿ�lg");	
			
		}

		@Override
		public void speedUp() {
			System.out.println("�ӵ��÷���lg");		
		}

		@Override
		public void speedDown() {
			System.out.println("�ӵ�������lg");		
		}
}