package day13.sub;

import day13.sub.ExecSub.RandomMaker;

public class Dongle implements Moyang {
	int rad;
	double area;
	
	public Dongle() {
		rad = RandomMaker.randomNum();
		setArea();
	}

	@Override
	public void setArea() {
		area = rad * rad * pi;
	}

	@Override
	public void toPring() {
		System.out.printf("\n¹İÁö¸§: %3d \t³ĞÀÌ: %.2f", rad, area);
		System.out.println();

	}

}
