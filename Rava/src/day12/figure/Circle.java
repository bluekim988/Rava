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
		System.out.printf("원\n반지름 : %3d \t둘레: %.2f \t넓이: %.2f", rad, arround, area);
		System.out.println();
	}
}
