package day05;
/*
 			*****
			 ****
			  ***
			   **
			    *
 */
public class Hw04 {

	public static void main(String[] args) {
		for(int i=6;i>0;i--) {
			for(int j=6;j>0;j--) {
				if(j>i) {
						System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
