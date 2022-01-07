
public class ConstructorExample {
	
	public static void main(String[] args) {
	  
	  Bus bus = new Bus();	
	  bus.printMyNum();
	  Bus bus2 = new Bus(1000);
	  bus2.printMyNum(); 
	  
	  
	}
	
}

// 생성자를 선언하는 방법.
// 클래스명 (매개변수) { .. 내용 ... }
// this(keyword)
class Bus extends Vehicle {
	
	int num = 503; // 속성/맴버/필드 
	
	//-- 생성자 선언 ----------------
	Bus() {
	  //super();
	  num = 200;	
	}
	
	Bus(int num) {
	   super(4); // new Vehicle(4)
	   this.num = num;
	}
//	
//	Bus(double bus_num) {
//	
//	   this.num = (int)bus_num;
//	}
	//-----------------------------
	
	void printMyNum() {
		System.out.println(num);
	}
}

// 탈것 클래스 
class Vehicle {
	int wheelCnt; 
	Vehicle() {} 
	Vehicle(int wheelCnt) {
		this.wheelCnt = wheelCnt;
	}
}
