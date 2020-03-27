package day12.figure;

public class Square extends Figure {
	int hor;
	int ver;
	
	public Square(int hor, int ver) {
		this.hor = hor;
		this.ver = ver;
		setArea();
	}
	
	public void setArea() {
		area = hor * ver;
	}
	
	public void toPrint() {
		System.out.printf("사각형 \n가로: %2d \t세로: %2d \t넓이: %.2f",hor, ver, area);
		System.out.println();
	}
}
