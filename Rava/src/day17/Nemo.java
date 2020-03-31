package day17;

import java.util.Comparator;

public class Nemo {
	private int hor;
	private int ver;
	private int area;
	
	public Nemo(int hor, int ver) {
		this.hor = hor;
		this.ver = ver;
		setArea();
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = hor * ver;
	}

}
