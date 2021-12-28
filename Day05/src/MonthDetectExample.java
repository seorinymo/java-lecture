
public class MonthDetectExample {
   
	public static void main(String[] args) {
		
		String input = args[0];
		int command = Integer.parseInt(input); 
		System.out.println("입력값은 " + command + "입니다.");
		
		// input 이라는 인자를 받아서. 
		// 1-12월중 인자를 대체하는 영어 단어를 출력해라 
		// 12 -> 12월은 Dec. 입니다. 
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
		
		System.out.println(command + "월은 영어로 " + month_eng + "입니다");
		
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
