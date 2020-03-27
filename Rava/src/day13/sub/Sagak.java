package day13.sub;

import day13.sub.ExecSub.RandomMaker;

public class Sagak implements Moyang {
	private int hor;
	private int ver;
	private double area;
	
	public Sagak() {
		hor = RandomMaker.randomNum();
		ver = RandomMaker.randomNum();
		setArea();
	}

	@Override
	public void setArea() {
		area = hor * ver;

	}

	@Override
	public void toPring() {
		System.out.printf("\n����: %3d \t����: %3d \t����: %.2f", hor, ver, area);
		System.out.println();

	}

}
