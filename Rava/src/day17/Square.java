package day17;

public class Square implements Comparable<Square>{
	private int hor;
	private int ver;
	private int area;
	
	public Square() {}
	public Square(int hor, int ver) {
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
	@Override
	public int compareTo(Square o) {
		return this.area - o.area;
	}
}
