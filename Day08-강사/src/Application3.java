
public class Application3 {
	public static void main(String args[]) {
		//-- ��ü�� �����ϴ� ���
		MathExample math = new MathExample(); 
		int sum = math.plus(10, 20);
		System.out.println(sum);
		
		// Stack ���� Last In First Out (LIFO) 
		System.out.println(math.minus(math.plus(10, 20), 100));
		
		// ��͸޼ҵ� 
		System.out.println(math.fact(4));
	}
}

//-- 1. Ŭ���� ���� 
class MathExample {
	
	//-- �޼ҵ��(����) 
	//-- �޼ҵ� ���� 
	//-- [����������] ���ϵ�����Ÿ�� �޼ҵ�� ( �Ű����� ) { 
	//    �ൿ ����  
	//}
	// void ������ ���� �޼ҵ�
	void printName() {
	  System.out.println("�ȳ�");	
	}
	
	int plus(int x, int y) {
		return x + y;
	} 
	
	int minus(int x, int y) {
		return x - y; 
	}
	

	// 4! = 4*3*2*1 
	// 100! = 100*99*.........1;
	public int fact(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fact(n-1) * n;
		}
	}

	
}