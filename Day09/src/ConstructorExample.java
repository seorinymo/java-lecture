
public class ConstructorExample {
	
	public static void main(String[] args) {
	 Bus bus = new Bus();
	 bus.printMynum();
	 Bus bus2 = new Bus (1000);
	 bus2.printMynum();
	 
			 
	}
}

// �����ڸ� �����ϴ� ���
// Ŭ������ (�Ű�����) { .. ���� .. }





class Bus {
	int num = 503;  //�Ӽ�,���,�ʵ�
	
	//������ ����
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

// Ż�� Ŭ����
class Vehicle {
	int wheelCnt;
	
	Vehicle(int wheelCht) {
		this.wheelCnt = wheelCnt;
		
	}
}





