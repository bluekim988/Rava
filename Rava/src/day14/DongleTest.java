package day14;

public class DongleTest {

	public DongleTest() {
		Dongle d1 = new Dongle(5);
		Dongle d2 = new Dongle(5);
		
		System.out.println("d1.area :" + d1.getArea());
		System.out.println("d2.area :" + d2.getArea());
		System.out.println("d1과 d2는  " + (d1.equals(d2) ? "같은 원 입니다." : "다른 원 입니다." ) );
		
	}
	public static void main(String[] args) {
		new DongleTest();

	}

}
