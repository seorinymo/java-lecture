
public class ConstructorExample {
	
	public static void main(String[] args) {
	 Bus bus = new Bus();
	 bus.printMynum();
	 Bus bus2 = new Bus (1000);
	 bus2.printMynum();
	 
			 
	}
}

// 생성자를 선언하는 방법
// 클래스명 (매개변수) { .. 내용 .. }





class Bus {
	int num = 503;  //속성,멤버,필드
	
	//생성자 선언
//	Bus() {
//		num = 200;


	
//	Bus(int wheelCnt, int_num) {
	//	super(wheelCnt);
		//this num = bus_num;

	
	
	
	// * this (keyword)	
	Bus(int num) {
	 this.num = num;
	}
	
	
	//
	
	
	void printMynum() {
		System.out.println(num);

		
	}
}

// 탈거 클래스
class Vehicle {
	int wheelCnt;
	
	Vehicle(int wheelCht) {
		this.wheelCnt = wheelCnt;
		
	}
}





