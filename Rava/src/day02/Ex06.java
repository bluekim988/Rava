package day02;

import java.util.Scanner;

/*
  	문제 6]
 		임의의 년도를 입력받아서
 		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
 		
 		단, 삼항연산자를 사용해서 처리하세요.
 */

public class Ex06 {

	public Ex06() {
		Scanner sc = new Scanner(System.in);
		
		view();
		int no = sc.nextInt();
		System.out.println("\n 정보를 가져오는중..... \n");
		System.out.println("......띠띠띠.....");
		System.out.println(".........띠띠 \n");
		year(no);
	}
	
	public void year(int no) {
		String str = (no % 4 == 0 && no % 100 != 0) ? ("[ " + no + " ] 윤년 입니다.") : 
			(no % 400 == 0) ? ("[ " + no + " ] 윤년 입니다.") : ("[ " + no + " ] 평년 입니다.");
			
		System.out.println(str + "\n");
	}
	
	public void view() {
		System.out.println("*** 이 프로그램은 해당 년도가 윤년인지 평년인지 알려드립니다. ***");
		System.out.print("년도를 입력하세요 : ");
	}
	public static void main(String[] args) {
		new Ex06();
	}

}
