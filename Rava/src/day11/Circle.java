package day11;
/*
 	문제 1]
 		이 클래스는 원의 정보를 저장할 클래스이다.
 		이 클래스가 객체가 될 때 반지름을 입력받아서
 		원의 정보가 입력이되게 클래스를 정의하세요.
 		
 		반지름이 입력이 안될 경우는 10으로 입력되게 하세요
 */
public class Circle {
	double radius;
	double area;
	double around;
	
	
	public Circle () {
		this(10);
	}
	
	public Circle(double radius) {
		this.radius = radius;
		
		area = radius * radius * 3.14;
		around = radius * 2 * 3.14;
	}
	
	public void showAll() {
		System.out.printf("반지름: %.2f \n넓이: %.2f \n둘레: %.2f",radius, area, around);
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		for(int i = -(int)radius; i<=(int)radius; i++) {
			for(int j = -(int)radius; j <=(int)radius; j++) {
				if(i *i + j * j <=(int)radius*(int)radius) {
					System.out.print("**");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
	}
}
