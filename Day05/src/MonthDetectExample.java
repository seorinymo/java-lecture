
public class MonthDetectExample {
   
	public static void main(String[] args) {
		
		String input = args[0];
		int command = Integer.parseInt(input); 
		System.out.println("�Է°��� " + command + "�Դϴ�.");
		
		// input �̶�� ���ڸ� �޾Ƽ�. 
		// 1-12���� ���ڸ� ��ü�ϴ� ���� �ܾ ����ض� 
		// 12 -> 12���� Dec. �Դϴ�. 
		// Jan, Feb, Mar, Apr, May, Jun, july, Aug, Sept, 
		// Oct, Nov, Dec 
		
		// 1. switch case 
		String month_eng = ""; 
		switch(command) {
			case 1 : 
				month_eng = "Jan"; 
				break; 
			case 2 : 
				month_eng = "Feb"; 
				break; 
			case 3 : 
				month_eng = "Mar"; 
				break;
			case 12: 
				month_eng = "Dec"; 
				break;
			default: 
				month_eng = "Nothing"; 
		}
		
		System.out.println(command + "���� ����� " + month_eng + "�Դϴ�");
		
		if(command == 1) {
			month_eng = "Jan";
		} else if(command == 2) {
			month_eng = "Feb";
		} else if(command == 3) {
			month_eng = "Mar";
		} else if(command == 12) {
			month_eng = "Dec"; 
		} else {
			month_eng = "Nothong";
		}
		
		
		
		
	}
	
}
