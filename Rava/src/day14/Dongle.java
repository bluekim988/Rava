package day14;

public class Dongle {
	private int rad;
	private double arround, area;
	
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround(){
		arround = 2 * 3.14 * rad;
	}
	
	public void setArea() {
		area = 3.14 * rad * rad;
	}
	
	public double getArea() {
		return area;
	}
	
	public boolean equals(Object obj) {
		Dongle inst = (Dongle) obj;
		if(this.area == inst.area) {
			return true;
		} else {
			return false;
		}
	}
}
