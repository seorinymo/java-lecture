import java.util.*;

public class SampleProject1 {

	
	public static void main(String[] args) {

		Scanner sc;
		String input;
		String command;
		
		while(true) {
	
			System.out.print("���ڿ��� �Է��� �ּ���");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		
		command = sc.nextLine();

			System.out.println("�Է°��� '" + input + " '�Դϴ�");
		
			if(input.indexOf("quit") >= 0) {
		
				
				break;
					
			}
		}
	
		sc.close();
		System.out.println("���α׷� ����");
	}

}
