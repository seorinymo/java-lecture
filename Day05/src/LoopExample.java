
// �ݺ����� ��ǻ�Ͱ� ���α׷��� �д� ��Ŀ��� 
// ���� (���� �ٽ� ���ư��� �а��ϴ�) �ϴ� ������ �����̴�. 

public class LoopExample {
 
	// for <-- 
	// while <--
	// do while 
	
	public static void main(String[] args) {
	
		// for( �Ҵ��/�ʱ�ȭ ; ���Ǻ񱳽�; �������� ) {
		//   -- ���Ⱑ �ݺ����� 
		//}
		
		int i = 2; 
		
		for( ; ; ) {
			System.out.println(i++);
			if( i > 10) { 
				break;
			}
		}
		
		System.out.println("���� i���� " + i + "�Դϴ�.");
		
		//-- 2. while 
		// while(���ǽ�) {  
		//   ���̸� ���� 
		// }
		
		int x = 10; 
		System.out.println("while");
		while( ++ x < 20 ) {
			System.out.println(x);
			//if(x ++ < 20) break;
		}
		
		//-- 3. do while 
		//-- do {
		//
		//-- } while(���ǽ�);
		
		x = 10;
		System.out.println("do ~ while");
		do {
			System.out.println(x);
		} while(++ x < 20);
		
		
		
		
	} 
	
	
}
