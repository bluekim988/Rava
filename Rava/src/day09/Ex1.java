package day09;
/*
 ���� 1]
	�������� �����ϰ� �߻��ؼ� 
	�� �������� �Է��ϸ� 
	���� ���̸� �����ִ� �Լ���
	���� �ѷ��� �����ִ� �Լ��� �����ϰ�
	�����ؼ� ����ϼ���.
	
 */

public class Ex1 {

	public Ex1() {
		int ban = randomNum();
		
		double area = getArea(ban);
		double around = getAround(ban);
		
		System.out.printf("������ : %3d   �ѷ� : %.2f   ���� : %.2f",ban,around,area );
	}
	public int randomNum() {
		int result = (int)(Math.random() * (50))+1;
		return result;
	}
	public double getArea(int a) {
		double result = a * a * 3.14;
		return result;
	}
	public double getAround(int a) {
		double result = a * 2 * 3.14;
		return result;
	}

	public static void main(String[] args) {
		new Ex1();
	}

}
