
public class ArrayExample {

	public static void main(String[] args) {
		
		
		// �迭 
		// ���� ����
		// ���� ����� :
		// ������Ÿ�� ������[] or ���̾�Ÿ��[] ������ (��õ)
		// int a[10]; 
		// 1. ������
		int[] a = new int[5];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
//		
		//int[10] a;
        //a[0]=10; ->  ù��°�� 10

				
		// �ݺ������� �� �ֱ�
		for( int i = 0; i < 5; i ++) {
			a[i] = i;
		}
		
//		a[5] = 10;  // Array out of bound exception
		
		
		int[] b = {1,2,3,4,5};
		
		for( int i=0; i < b.length; i++ ) {
			//System.out.println(i);   //-> 0,1,2,3,4
			System.out.println(i+1);  //-> 1,2,3,4,5
		}
		
		// �迭����
		// 1. �迭�� ���� ������Ÿ���� ������ �������� ��
		// int[5] -> 4 * 5 = 20 bytes  
		
		// �迭 �����
		// int[] ������;    => ����
		
		// �迭 ����� ���ÿ� �� �����
		// char[] ������ = new char[5];   
		// ���ֱ�a: a[0] = 97; a[1] = 98;...
		// ���ʱ�b: for�� ���� �ݺ��� ����ϴ°�
		// --���ҹ��� �ֱ�
		char[] alpha = new char[26];
		
		char alpha_start = 'A';     //97;
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = alpha_start ++;
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
		
	
		// -- �迭 ����� ���ÿ� �� �����ֱ�
		// ������Ÿ�� �迭������ = {��};
		char[] arrCh = {97,98,99};
		
		
    		
	}
}
