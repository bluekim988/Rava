package day13.sub;

import day13.sub.ExecSub.RandomMaker;

public class Samgak implements Moyang {
	private int width, height;
	private double area;
	
	public Samgak() {
		this.width = RandomMaker.randomNum();
		this.height = RandomMaker.randomNum();
		setArea();
	}
	
	@Override
	public void setArea() {
		area = width * height * 0.5;

	}

	@Override
	public void toPring() {
		System.out.printf("\n�غ�: %3d \t����: %3d \t����: %.2f", width, height, area);
		System.out.println();

	}

}
