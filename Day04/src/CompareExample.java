//�񱳿���
public class CompareExample {
	
	
		
	
	//�񱳿����� ��/������ ������ ������
	// >,<,>=,<=
	// == ���� ( = �Ҵ� )
	// != ���� �ʴ�
	// ������� boolean 
	
	public static void main(String args[]) {
	
    	int a = 10, b = 20, c = 10;
    	
    	System.out.println("a>b="+(a>b));
    	System.out.println("a<b="+(a<b));
    	System.out.println("a>=b="+(a>=b));
    	System.out.println("a<=b"+(a<=b));
    	
    	boolean result = (a >=b);
    	System.out.println(result);
    	
    	System.out.println("!(a>b)"+!false);
    	// ! �� not �� �ǹ��Ѵ� !false == true !true == false
    	
    	System.out.println("a==b"+(a==b));  // false
    	// a == b -> a ���� b (a�� b�� �������̳�)
    	
    	System.out.println("a!=b"+(a!=b));  // true
    	//
	
	
	
	
	} 	    	
	
}
