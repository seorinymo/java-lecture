
//-- Switch Case 
public class SwitchExample {
   
   public static void main(String[] args) {
	  
	  // switch(����) 
	  // {
	  //   case �񱳰� :
	  //   break;
	  //   case �񱳰� :
	  //   break; 
	  //   default :
	  //  
	  // }
	   
	  int month = 12;
	  String month_name = ""; 
	  switch(month) {
	    default : 
	    	month_name = "����";
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
	    	month_name = "�Ͼ��Ͼ�";
	  }
	  System.out.println(month + "���� ����� " + month_name + "�Դϴ�.");
	 
   }
}
