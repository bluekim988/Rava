package day11;

public class Sagak extends Dohyung {
	double horizontal;
	double Vertical;
	
	public Sagak() {
		this(1, 1);
	}
	
	public Sagak(int horizontal, int Vertical) {
		super(horizontal, Vertical);
		this.horizontal = horizontal;
		this.Vertical = Vertical;
	}
	
	@Override
	public void showAll() {
		System.out.println("사각형 가로 : " + horizontal );
		System.out.println("사각형 세로 : " + Vertical );
		super.showAll();
	}
}
