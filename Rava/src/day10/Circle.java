package day10;
/*
 문제 1]
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고
	출력하세요. 
	
 */

public class Circle {
	int ban;
	double around;
	double area;
	
	public Circle(int a) {
		ban = a;
		around = a * 2 * 3.14;
		area = a * a * 3.14;
	}
	public void showVal() {
		System.out.printf("반지름 : %3d \n원의둘레 : %.2f \n원의넓이 : %.2f \n",ban, around, area);
	}
}
