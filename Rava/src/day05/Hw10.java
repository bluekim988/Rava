package day05;

public class Hw10 {

	public static void main(String[] args) {
		
		int no = 2;
		int no2 = 1;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<8; j++) {
				System.out.printf("%3d %2s %2d %s %2d\t",no, "x", no2, "=", no++ *no2);
			}
			System.out.println();
			no = 2;
			no2++;
		}
	}

}
