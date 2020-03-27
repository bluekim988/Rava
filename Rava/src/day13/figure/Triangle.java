package day13.figure;

public class Triangle extends Figure {
	int base;
	int height;
	double area;
	
	public Triangle() {
		base = RandomNum.randomNumber();
		height = RandomNum.randomNumber();
	}
	
	@Override
	public void setArea() {
		area = base * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.println("\n�� ������ [ �ﰢ�� ] �Դϴ�.");
		System.out.printf("�غ�: %3d \t����: %3d \t����: %.2f", base, height, area);
		System.out.println();

	}

}
