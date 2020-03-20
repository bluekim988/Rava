package day01;

import java.util.Scanner;

public class Ex03 {
/*
 *  	3. 두개의 숫자(정수)를 변수에 담고
 	 	두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
 	 	
 	4. 3번 문제의 두 수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x_num = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y_num = sc.nextInt();
		sc.nextLine();
		
		int sq_around = x_num * y_num;
		
		double tri_around = x_num * y_num * 0.5;
		
		System.out.println("가로 :" + x_num + " 세로 : " + y_num + " 의 사각형의 넓이 : " + sq_around + "\n");
		System.out.println("밑변 : " + x_num + " 높이 : " + y_num + " 의 삼각형의 넓이 : " + tri_around);
	}
	
}
