package day10;
/*
 ���� 1]
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ�
	����ϼ���. 
	
 */

public class Circle {
	int ban;
	double around;
	double area;
	
	public Circle(int a) {
		ban = a;
		around = a * 2 * 3.14;
		area = a * a * 3.14;
	}
	public void showVal() {
		System.out.printf("������ : %3d \n���ǵѷ� : %.2f \n���ǳ��� : %.2f \n",ban, around, area);
	}
}
