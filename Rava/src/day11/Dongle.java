package day11;

public class Dongle extends Dohyung {
	int rad;
	double arround;
	
	public Dongle() {
		this(1);
	}
	
	public Dongle(int rad) {
		super(rad);
		this.rad = rad;
		setArround();
	}
	
	public void setArround() {
		arround = rad * 2 * 3.14;
	}
	
	@Override
	public void showAll() {
		System.out.println("반지름: " + rad);
		System.out.printf("둘레 : %.2f \n", arround);
		super.showAll();
	}
}
