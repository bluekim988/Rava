package day05;
/*
 			*****
			****
			***
			**
			*
 */

public class Hw03 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=6;j>0;j--) {
				if(j>i) {
						System.out.print("*");
				} else {
				System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
