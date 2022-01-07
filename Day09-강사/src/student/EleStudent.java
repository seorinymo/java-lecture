// 1. 선언 : package 패키지명 
// 2. 패키지명 : 모두 소문자를 사용 
// ex) 일반적으로 회사 도메인을 역순으로 처리 
// ex) com.naver.util , kr.co.daum.data ....
package student;


public class EleStudent {
	
	public String name; 
	public int grade; 
	private static EleStudent std; 
	
	public void printName() {
		System.out.println("이름은 " + name + "입니다.");
	}
	
	//singleton 
	public static EleStudent getInstance() {
		if(std == null) std = new EleStudent();
		return std;
	}
	
	
}
