package day05;

/*
    			*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
 */
public class Hw06 {

	public static void main(String[] args) {
		ot :
		for (int i = 0; i < 11; i++) {
			if (i <= 5) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print(" ");
				}
				for (int x = 0; x <= i * 2; x++) {
					System.out.print("*");
				}
				System.out.println();
				if(i==5) {
					continue ot;
				}
			} else {
				for (int z = 5; z < i; z++) {
					System.out.print(" ");
				}
				for (int y = 0; y < 21-i*2; y++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
