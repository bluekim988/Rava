package day01;

import java.util.Scanner;

public class Ex02 {
	/*
	2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
		원의 둘레 : 2 * 반지름 * 3.14
		원의 넓이 : 반지름 * 반지름 * 3.14
		
		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리를 하세요.
		그리고 둘레는 float 타입의 변수로 만드세요.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		float half = sc.nextFloat();
		sc.hasNextLine();
		sc.close();
		float round = (float)2 * half * (float)3.14;
		float area = half * half * (float)3.14;
		
		System.out.println("반지름 " + half + " 의 원의 둘레 : " + round);
		System.out.println("반지름 " + half + " 의 원의 넓이 : " + area );
		
	}
	

}
