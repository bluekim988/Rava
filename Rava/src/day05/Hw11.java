package day05;

public class Hw11 {
	int one = 1;
	int two = 1;
	int result = -1;

	public Hw11() {
		System.out.println(pibonacci(40));
		
	}
	
	public int pibonacci(int no) {
		if(no == 1) {
			return 1;
		} 
		if(no == 2) {
			return 2;
		} else	{
			result = pibonacci(no-1) + pibonacci(no-2);
			return result;
		}
	}
	public static void main(String[] args) {
		new Hw11();
		
		 
	}

}
