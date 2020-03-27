package day12.figure;

public class Triangle extends Figure {
	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = base * height * 0.5;
	}
	
	public void toPrint() {
		System.out.printf("�ﰢ��\n�غ�: %2d \t����: %2d \t����: %.2f",base, height, area);
		System.out.println();
	}
}
