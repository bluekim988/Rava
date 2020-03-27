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
		System.out.printf("�簢�� \n����: %2d \t����: %2d \t����: %.2f",hor, ver, area);
		System.out.println();
	}
}
