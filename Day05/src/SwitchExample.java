
//-- Switch Case 
public class SwitchExample {
   
   public static void main(String[] args) {
	  
	  // switch(변수) 
	  // {
	  //   case 비교값 :
	  //   break;
	  //   case 비교값 :
	  //   break; 
	  //   default :
	  //  
	  // }
	   
	  int month = 12;
	  String month_name = ""; 
	  switch(month) {
	    default : 
	    	month_name = "없음";
	    	break;
	    case 10 : 
	    	month_name = "Oct";
	    	break;
	    case 11 : 
	    	month_name = "Nov";
	    	break;
	    case 12 : 
	    	month_name = "Dec"; 
	    	break;
	    case 100 : 
	    	month_name = "하악하악";
	  }
	  System.out.println(month + "월은 영어로 " + month_name + "입니다.");
	 
   }
}
