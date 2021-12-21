
public class ConstExample {

	public static void main(String[] args) {

		//변수란 변할수 있는 수 
		//상수는 변할수 없는 수
		
		int age = 10;
		System.out.println(age);
		
		age = 20;
		System.out.println(age);

		//상수는 final 키워드 사용
		//final 데이터타입(자료형) 상수명 = 값		
		final double PI = 3.14;	
		System.out.println(PI);
		
		PI = 3.20;  //상수는 변경할수 없으므로 에러
		System.out.println(PI);
		
	}

}
