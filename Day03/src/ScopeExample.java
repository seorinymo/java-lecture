
public class ScopeExample {
	static String name="������ �ٺ�";
	
	public static void main(String args[]) {
		// ����� ������ �߰�ȣ �������� ������ ��������
		String name = "������";
		
		System.out.println(name);  //������
		printName();
		
	}
	
	public static void printName() {
		// ����� �������� ������, �ڱ� ���� ���� �߰�ȣ�� üũ�Ѵ�
		 System.out.println(name);		//������ �ٺ�
			
			
		//	 String g_name = "������";
		//   System.out.println(g_name);
			 
		}
		//g_name="�ٺ�";  // Scope �޶� ����
		//System.out.println(name);
		
	}

