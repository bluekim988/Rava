package day11;
/*
 	���� 1]
 		�� Ŭ������ ���� ������ ������ Ŭ�����̴�.
 		�� Ŭ������ ��ü�� �� �� �������� �Է¹޾Ƽ�
 		���� ������ �Է��̵ǰ� Ŭ������ �����ϼ���.
 		
 		�������� �Է��� �ȵ� ���� 10���� �Էµǰ� �ϼ���
 */
public class Circle {
	double radius;
	double area;
	double around;
	
	
	public Circle () {
		this(10);
	}
	
	public Circle(double radius) {
		this.radius = radius;
		
		area = radius * radius * 3.14;
		around = radius * 2 * 3.14;
	}
	
	public void showAll() {
		System.out.printf("������: %.2f \n����: %.2f \n�ѷ�: %.2f",radius, area, around);
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		for(int i = -(int)radius; i<=(int)radius; i++) {
			for(int j = -(int)radius; j <=(int)radius; j++) {
				if(i *i + j * j <=(int)radius*(int)radius) {
					System.out.print("**");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
	}
}
