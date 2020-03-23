package day05;

public class Test01 {
	public static void main(String[] args) {
		
		int sum = 15;
		
		for(int i = -sum; i<=sum; i++) {
			for(int j = -sum; j <=sum; j++) {
				if(i *i + j * j <=sum*sum) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
