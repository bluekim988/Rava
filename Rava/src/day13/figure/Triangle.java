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
		System.out.println("\n이 도형은 [ 삼각형 ] 입니다.");
		System.out.printf("밑변: %3d \t높이: %3d \t넓이: %.2f", base, height, area);
		System.out.println();

	}

}
