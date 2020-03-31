package day17;

public class Sagak implements Comparable{
	private int width;
	private int height;
	private double area;

	public Sagak() {}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = width * height;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public int compareTo(Object o) {
		// 반환값이 음수인 경우는 정렬시 입력된 데이터와 자리를 바꾸지 않는 다는 이야기
		// => 매개변수로 입력되는 데이터가 더 크다.
		Sagak s = (Sagak) o;
		
		int result = (int)(this.area - s.area);
		return result;
	}


}
