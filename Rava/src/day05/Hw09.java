package day05;

public class Hw09 {
	public static void main(String[] args) {
		
		int no1 = 0;
		int no2 = 1;
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(no1 + no2++);
			}
			System.out.println();
			no2 = 1;
		}
		
		System.out.println();
		int no = 1;
		for(int i=5; i>0; i--) {
			for(int j =0;j<i; j++) {
				if(j==i-1) {
					for(int x=6; x>i; x--)
					System.out.print(0 + no++);
				}
				System.out.print(" ");
			}
			System.out.println();
			no = 1;
		}
	}
}
