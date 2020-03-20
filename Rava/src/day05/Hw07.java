package day05;

public class Hw07 {
	public static void main(String[] args) {
		
		int a = 1; 
		int b=1; 
		int result = 0;
		
		for(int i=1; i<10; i++) {
			result = a + b;
			a = b;
			b = result;
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println(result);
	}
}
