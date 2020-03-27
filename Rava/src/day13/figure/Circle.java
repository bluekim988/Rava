package day13.figure;

public class Circle extends Figure {
	int rad;
	double area;
	
	public Circle() {
		rad = RandomNum.randomNumber();
	}
	
	@Override
	public void setArea() {
		area = rad * rad * 3.14;

	}

	@Override
	public void toPrint() {
		System.out.println("\n�� ������ [ �� ] �Դϴ�");
		System.out.printf("������: %3d \t����: %.2f ", rad, area);
		System.out.println();
	}

}
