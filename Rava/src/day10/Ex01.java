package day10;
 /*
 ���� 1]
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ�
	����ϼ���. 
	
 */

public class Ex01 {
	Circle[] arr01 = new Circle[10];
	
	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		
		for(int i=0; i<ex1.arr01.length; i++) {
			int no = (int)(Math.random() * (30))+1;
			ex1.arr01[i] = new Circle(no);
		}
		
		for(Circle a : ex1.arr01) {
			a.showVal();
			System.out.println();
		}

	}

}
