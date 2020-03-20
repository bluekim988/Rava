package day05;

public class Hw00 {

	public static void main(String[] args) {
		
		for(int i=10; i>0; i--) {
			for(int j=0;j<i; j++) {
				if(j<3) {
					System.out.print(" ");
				} else
				System.out.print("*");
				}
			System.out.println();
		}
	}
		
}


