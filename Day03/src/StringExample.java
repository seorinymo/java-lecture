
public class StringExample {

	public static void main(String[] args) {
		
		// ���� ����, ��� 
		// ���̾�Ÿ��(�ڷ���) ������; <--����
		// ������Ÿ��(�ڷ���) ������; = ��; <-- ����� ���ÿ� �ʱ�ȭ
		
		// String name = "������";
		
		String name;
		String home;
		String description;
		
		
		name = "������";
		home = "���굿";
		//description = name + "�� ���� " + home + "�̴�";
		description = String.format("%s�� ���� %s�̴�", name, home);
	    char c_name = description.charAt(0);
		
		
		// �������� "������"
		//char c_name = 'A';
		
		System.out.println(c_name);
		System.out.println(description);
		
	}
}
