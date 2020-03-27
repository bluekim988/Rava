package day12.figure;

public class Circle extends Figure{
	int rad;
	double arround;
	
	public Circle() {}
	
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = rad * 3.14 * 2;
	}
	
	public void setArea() {
		area = rad * rad * 3.14;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("��\n������ : %3d \t�ѷ�: %.2f \t����: %.2f", rad, arround, area);
		System.out.println();
	}
}
