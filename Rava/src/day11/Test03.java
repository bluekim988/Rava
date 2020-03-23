package day11;

public class Test03 {
	int num;
	int num2;
	static int num3;
	int num4;
	
	{
		num = 10; 
		num2 = 20;
	}
	
	
	static {
		num3 = 30;
	}
	
	public Test03() {
		this.num4 = 50;
	}

	public static void main(String[] args) {
		Test03 tt = new Test03();
		
		System.out.println(tt.num);
		System.out.println(tt.num2);
		System.out.println(num3);
		System.out.println(tt.num4);
		

	}

}
