// 인터페이스는 
// 접근제한자 interface 인터페이스 명

// 인터넷 접송용 인터페이스
public interface InterfaceExample {

	void connect();
	void close();
	void speedUp();
	void speedDown();

}

class SKInterface implements InterfaceExample {
	@Override
	public void connect() {
		System.out.println("연결하기 구현했어요sk");
	}

	@Override
	public void close() {
		System.out.println("닫아요sk");	
		
	}

	@Override
	public void speedUp() {
		System.out.println("속도올려요sk");		
	}

	@Override
	public void speedDown() {
		System.out.println("속도내려요sk");		
	}
	
	
	
	class LGInterface implements InterfaceExample {
		@Override
		public void connect() {
			System.out.println("연결하기 구현했어요lg");
		}

		@Override
		public void close() {
			System.out.println("닫아요lg");	
			
		}

		@Override
		public void speedUp() {
			System.out.println("속도올려요lg");		
		}

		@Override
		public void speedDown() {
			System.out.println("속도내려요lg");		
		}
}