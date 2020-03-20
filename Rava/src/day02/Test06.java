package day02;

import java.util.Scanner;

public class Test06 {
/*
 	랜덤하게 정수 11 ~ 33 까지의 두수를 발생시키고
 	숫자를 입력받아서 
 	입력받은 숫자가 1이면 삼각형의 넓이를
 			  2이면 사각형의 넓이를 구해주는 프로그램을 작성하세요.
 */
	public Test06() {
		Scanner sc = new Scanner(System.in);
		
		menu();
		int code = sc.nextInt();
		sc.nextLine();
		
		int no1 = (int)(Math.random() * (33 - 11 + 1)) + 1;
		int no2 = (int)(Math.random() * (33 - 11 + 1)) + 1;
		
		/*
		 	사각형과 삼각형의 넓이의 타입이 다르기 때문에
		 	한가지 타입으로 통일 시켜줘야겠다.
		 	여기서는 함수 실행의 결과를 그대로 출력할 용도로만 사용할 것이기 때문에
		 	문자열로 통일해서 사용하면 될것 같다.
		 */
		double semo = samgak(no1, no2);
		double sagak = sagak(no1, no2);
		
		String result = 
				(code == 1) ? (no1 + " , " + no2 + " 삼각형의 넓이 : " + semo) : 
							(	
					code == 2 ? (no1 + " , " + no2 + " 사각형의 넓이 : " + sagak) : ("잘못된 입력")
										);
		System.out.println(result);
	}
	//	삼각형 넓이 구해주는 함수
	public double samgak(int no1, int no2) {
		double area = no1 * no2 / 2.;
		return area;
	}
	//	사각형 넓이 구해주는 함수
	public int sagak(int no1, int no2) {
		int area = no1 * no2;
		return area;
	}
	public void menu() {
		System.out.println("***\t프로그램을 시작합니다 \t ***");
		System.out.println("1. 삼각형 넓이");
		System.out.println("2. 사각형 넓이");
		System.out.print("입력 : ");
	}
	public static void main(String[] args) {
		new Test06();
	}

}
