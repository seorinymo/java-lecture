// ��������(����)��
// public > protected > (default) > private
// �����
// 1. ���(�Ӽ�)������ ��밡��
// ex) public int age; [����������] ������ Ÿ�� ������;
// 2. Ŭ������ ��밡��
// ex) class Person [����������] class Ŭ������
// 3. �޼��忡 ��밡��
// ex) int plus(int x, int y) [����������] ����Ÿ�� �޼����(�Ű�����)

import kr.education.*;

public class AccessExample {

	public static void main(String[] args) {
		// ������Ű�� ���� default �����ڸ� ������
		// Ŭ����, �Ӽ�, �޼���� �ƹ� ���Ѿ��� ��� �����ϴ�
		Student std1 = new Student();
		std1.name = "����";
		std1.grade = 10;
	    std1.printMySelf();
		
	    // �ٸ���Ű���� public Ŭ������ ��������
		StudentDefalt std2 = new StudentDefault
		// StudentDefault Ŭ������ name �Ӽ��� public �̶� ��������
				std2.name = "�ƾƾ���";
		//�ٸ���Ű���� default �Ӽ��̶� �����Ҽ� ���� ( ����)
		// std2.grade = 10;
	}
}
		