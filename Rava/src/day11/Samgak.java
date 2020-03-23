package day11;

public class Samgak extends Dohyung {
	int base;
	int height;
	
	public Samgak() {
		this(1, 1);
	}
	
	public Samgak(int base, int height) {
		super(base, height);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void showAll() {
		System.out.println("�ﰢ�� �غ� : " + base);
		System.out.println("�ﰢ�� ���� : " + height);
		super.showAll();	
	}
}
