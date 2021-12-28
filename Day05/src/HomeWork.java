
public class HomeWork {

	public static void main(String args[]) {

	    int c1 = 2; //Integer.parseInt(args[0]);  
	    int c2 = 1; //Integer.parseInt(args[1]); 
			
        for(int x = c2 ; x <= 9; x++) {
	      
	      for(int y = c1 ; y <=9; y++) {
	    	  System.out.print( y + " x" + x + "=" + ( y * x ) + "      ");   
	      } 	
	      
 	      System.out.print("\n");
	   }

	}
}