import java.util.*;

public class SampleProject1 {

	
	public static void main(String[] args) {

		Scanner sc;
		String input;
		String command;
		
		while(true) {
	
			System.out.print("문자열을 입력해 주세요");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		
		command = sc.nextLine();

			System.out.println("입력값은 '" + input + " '입니다");
		
			if(input.indexOf("quit") >= 0) {
		
				
				break;
					
			}
		}
	
		sc.close();
		System.out.println("프로그램 종료");
	}

}
