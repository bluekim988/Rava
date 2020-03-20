package day05;
/*
 	1  2
 	10 9
 	11 12
 	20 19
 	21 22
 */
public class Solv16 {

	public static void main(String[] args) {
		
		int no1 = 1;
		int no2 = 10;
		
		for(int i=1; i <4; i++) {
			for(int j= 1; j<6; j++) {
				System.out.printf("%5d",no1++);
			}
			System.out.println();
			if(no2==30) {
				break;
			}
			for(int x = 1; x < 6; x++) {
				System.out.printf("%5d",no2--);
			}
			no1 +=5;
			no2 +=15;
			System.out.println();
		}

	}

}
