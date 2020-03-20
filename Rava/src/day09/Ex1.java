package day09;
/*
 문제 1]
	반지름을 랜덤하게 발생해서 
	그 반지름을 입력하면 
	원의 넓이를 구해주는 함수와
	원의 둘레를 구해주는 함수를 제작하고
	실행해서 출력하세요.
	
 */

public class Ex1 {

	public Ex1() {
		int ban = randomNum();
		
		double area = getArea(ban);
		double around = getAround(ban);
		
		System.out.printf("반지름 : %3d   둘레 : %.2f   넓이 : %.2f",ban,around,area );
	}
	public int randomNum() {
		int result = (int)(Math.random() * (50))+1;
		return result;
	}
	public double getArea(int a) {
		double result = a * a * 3.14;
		return result;
	}
	public double getAround(int a) {
		double result = a * 2 * 3.14;
		return result;
	}

	public static void main(String[] args) {
		new Ex1();
	}

}
