
public class ConstructorExample {
	
	public static void main(String[] args) {
	  
	  Bus bus = new Bus();	
	  bus.printMyNum();
	  Bus bus2 = new Bus(1000);
	  bus2.printMyNum(); 
	  
	  
	}
	
}

// �����ڸ� �����ϴ� ���.
// Ŭ������ (�Ű�����) { .. ���� ... }
// this(keyword)
class Bus extends Vehicle {
	
	int num = 503; // �Ӽ�/�ɹ�/�ʵ� 
	
	//-- ������ ���� ----------------
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

// Ż�� Ŭ���� 
class Vehicle {
	int wheelCnt; 
	Vehicle() {} 
	Vehicle(int wheelCnt) {
		this.wheelCnt = wheelCnt;
	}
}
