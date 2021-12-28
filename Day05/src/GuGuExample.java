
public class GuGuExample {

	public static void main(String args[]) {
		
		//for(int x = 2; x < 10; x++)
		for(int x = 2; x <= 9; x ++) {
		 
			//if(x % 2 != 0) continue;
			
			for(int y = 1; y <= 9; y ++) {
				System.out.println(x + "*" + y + "=" + (x * y));
				//if(y == 3) break;
			}
			
			//if(x == 5) break;
		}
		
	}
	
		
		
}
