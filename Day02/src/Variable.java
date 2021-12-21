// 변수
// 변수 명명 규칙은 단봉낙타


public class Variable {

		public static void main(String [] args) {
			
			
		//	자료형 변수명 = 데이터;
			int a = 10;
			int x;
			int myAge = 19;
			
			
			System.out.println(10);
			System.out.println(10+10);
			
			x = 9;   // 9
			x = a - x;   // 10-9 =1
					
			// 변수의 문법적 특징
			// 1. 변수의 시작은 숫자일수 없다
			// int 0name; //  ---error
			// int name0; //  --- 정상
			
			// 2. 변수의 이름은 예약어 일수 없다
			// int class;  // 자바 컴파일러가 이미 사용하과 있는
			               // 예약어인 class 는 사용 불가
			// 3. 공백허용? 
			int iAmSam;
			//int i am sam;  // 공백 허용하지 않음
			
			// 4. 같은 Scope (블록{ --- }) 에 같은 이름의 변수는 허용되지 않는다
			
			 int im = 10;
			 int im;
			 
			// 5. 대소문자는 구분한다
			 int imABoy = 10;
			 int imaBoy = 9;  //다름
			
			
			
		}
}
