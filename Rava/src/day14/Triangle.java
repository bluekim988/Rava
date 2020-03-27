package day14;

public class Triangle {
	private int base;
	private int height;
	private double area;
	
	public Triangle() {
		
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = base * height * 0.5;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "πÿ∫Ø: " + base + " ≥Ù¿Ã: " + height + " ≥–¿Ã: " + area; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Triangle inst = (Triangle) obj;
		
		boolean bool = false;
		bool = (this.base == inst.base) ? true : false ;
		
		return bool;
	}

}
