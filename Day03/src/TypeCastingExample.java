
public class TypeCastingExample {

	public static void main(String [] args) {
		// 정수형 데이터타입
		// 명시적 형변환  
		int a = 10; // 4 bytes
		short b = (short)a;  // 2 bytes  (데이터타입)
		
		// 묵시적 형변환 (작은거를 큰거에)
		short c = 100;  // 2bytes
		int d = c;  // 4 bytes
		
		//byte x = 128;  // 1 bytes -128~127 범위 벗어남

		// example 
		int a1 = 128;
		byte x1 = (byte)a1;
		
		System.out.println(x1);  // 에러값 들어감 (-128)
		
		//int z = 3f;
		//double zx = 3l;
		
		double xa = 3.6441;
	    int xb = (int)xa;
	    System.out.println(xb);
	    
	    
	    int ya = 10;
	    double yb = ya;
	    System.out.println(yb);
	    
	}
}
