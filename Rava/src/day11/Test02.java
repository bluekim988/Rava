package day11;

public class Test02 {
	

	public static void main(String[] args) {
		
		Test02 t1 = new Test02();
		

		int no1 = t1.getRandom();
		int no2 = new Test02().getRandom();

		int no3 = getTen();
	}
	public int getRandom() {
		int result = (int)(Math.random() * 7 + 1);
		return result;
	}
	
	public static int getTen() {
		return 10;
	}

}
