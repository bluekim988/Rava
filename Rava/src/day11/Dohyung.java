package day11;
/*
 	문제 ]
 		이 클래스는 상속받은 클래스를 제작을 하는데
 		원, 사각형, 삼각형 클래스를 만드세요.
 */
public class Dohyung {
	double area;
	
	public Dohyung(int rad) {
		area = rad * rad * 3.14;
	}
	
	public Dohyung(int tri_base, int tri_height) {
		area = tri_base * tri_height * 0.5;
	}
	
	public Dohyung(double squ_base, double squ_height) {
		area = squ_base * squ_height;
	}
	
	public void showAll() {
		System.out.printf("넓이 : %.2f \n", area);
		System.out.println("------------------");
	}
}
