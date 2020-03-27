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
		System.out.println("\n이 도형은 [ 사각형 ] 입니다.");
		System.out.printf("가로: %3d \t세로: %3d \t넓이: %.2f", hor, ver, area);
		System.out.println();

	}

}
