
public class ArrCopyExample {

	public static void main(String[] args) {
		// �迭�� ���̴� �ѹ� �������� �����Ҽ� ����
		// ���� ���̸� ���̰ų� ���϶���, �Űܳ��� �迭�� �����ϰ�
		// ������ ���� �迭(��)�� �ı��Ѵ�
		
		int[] a = {1,2,3};
		int[] b = new int[5];
		
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
			
		}
		
		a = null;
		
		int[] c = {1,2,3,4,5};
		int[] d = new int[3];
		
		System.arraycopy(c, 2, d, 0, 3);

		for(int i=0; i <d.length; i++) {
			d[i] = c[i+2];   //���� ���� ����
			//d[0] = c[i+2]
		    //d[1] = c[3]
		    //d[2]=c[4]
			
		
		}
		for(int i=0; i < d.length; i++) {
			System.out.println(d[i]);
			
		}
		
	}
}
