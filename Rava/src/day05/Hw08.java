package day05;

/*
 
			A
			B C
			D E F
			G H I J
			K L M N O
			
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15
 */

public class Hw08 {

	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(no1 + no2++);
			}
			System.out.println();
			no1++;
			no2=1;
		}
		System.out.println();
		char ch1 = 'A'-1;
		int no = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch1 + no++));
			}
			System.out.println();
			ch1++;
			no=1;
		}

	}

}
