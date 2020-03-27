package day13.figure;

public class Square extends Figure {
	int hor;
	int ver;
	double area;
	
	public Square() {
		hor = RandomNum.randomNumber();
		ver = RandomNum.randomNumber();
	}
	
	@Override
	public void setArea() {
		area = hor * ver;

	}

	@Override
	public void toPrint() {
		System.out.println("\n�� ������ [ �簢�� ] �Դϴ�.");
		System.out.printf("����: %3d \t����: %3d \t����: %.2f", hor, ver, area);
		System.out.println();

	}

}
