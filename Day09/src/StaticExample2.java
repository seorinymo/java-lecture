
public class StaticExample2 {

	public static void main(String[] args) {
		System.out.println("TestStatic");
	    TestStatic ts = new TestStatic();
	    System.out.println("TestStatic2");
	    TestStatic ts2 = new TestStatic();
	    
		
	}
}



class TestStatic {
	TestStatic() {
	   System.out.println("Test Static ��ü ����");
	}
	
	//  ----- nonstatic  ��ü�ʱ�ȭ ����
	
	{
	   System.out.println("Test Static �ʱ�ȭ ��� ����");
		
	}
	
	//   -----static ��ü�ʱ�ȭ ����
	
	static {
		System.out.println("TestStatic / static �ʱ�ȭ ��� ����");
	}
}