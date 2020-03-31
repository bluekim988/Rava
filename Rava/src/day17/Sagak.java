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
		// ��ȯ���� ������ ���� ���Ľ� �Էµ� �����Ϳ� �ڸ��� �ٲ��� �ʴ� �ٴ� �̾߱�
		// => �Ű������� �ԷµǴ� �����Ͱ� �� ũ��.
		Sagak s = (Sagak) o;
		
		int result = (int)(this.area - s.area);
		return result;
	}


}
