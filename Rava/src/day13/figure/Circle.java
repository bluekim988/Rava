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
		System.out.println("\n이 도형은 [ 원 ] 입니다");
		System.out.printf("반지름: %3d \t넓이: %.2f ", rad, area);
		System.out.println();
	}

}
