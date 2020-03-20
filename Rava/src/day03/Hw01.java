package day03;

import java.util.Scanner;
/*
	조건 명령문
		: 조건을 주고 조건이 맞는 경우와 맞지 않는 경우를 구분해서 처리해주는 명령문
		
		종류]
			1. if
				==> 조건을 제시하고 그 조건에 맞는 경우에만 처리하는 조건문
				형식]
					if(조건식) {
						실행문
					}
				==> 조건식이 맞는 경우에만 실행문을 실행하고
					그렇지 않은 경우에는 조건문을 건너뛰는 방식
			2. if ~ else
				==> 조건을 제시하고 조건에 맞는 경우와 맞지 않는 경우 두가지를 처리하는 조건문
				형식]
					if(조건식) {
						실행문1
					} else {
						실행문2
					}
				==> 조건식이 맞는 경우는 실행문1을 실행하고,
					그렇지 않은 경우 실행문2를 실행하는 방식
			3. if ~ else if ~ else
				==> 조건을 두개 이상 제시하고 각 조건에 맞는 경우를 처리하는 조건문
				형식]
					if(조건식1) {
						실행문1
					} else if(조건식2) {
						실행문2
					} else if(조건식3) {
						실행문3
					...
					
					} else {
						실행문n
					}
				==> 조건식을 여러개를 제시해서 그 조건문에 맞는 실행문을 실행하는 조건문
			4. switch ~ case
				==> 조건을 처리하는데 데이터를 여러개를 제시하고
					그 데이터에 맞는 케이스를 찾아가 처리해주는 방법
					
				형식]
					switch(변수) {
					case 데이터1 :
							실행문1
							break;
					case 데이터2 :
							실행문2
							break;
					...
					default:
							실행문n
					}
				==> 변수의 값이 일치하는 case문의 실행문을 실행 처리하는 조건식
*/
public class Hw01 {
	public Hw01() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("### 입력받아 처리할 경우 1, 랜덤하게 만들어서 처리할경우 2");
		System.out.print("입력 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num == 1) {
			iFloor(sc);
		} else {
			rFloor();
		}
		

	}
	
	public void iFloor(Scanner sc) {
		System.out.print("세자리 정수를 입력하세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		int num = no - (no % 100);
		System.out.println("입력한수 : [ " + no + " ] 를 십의자리에서 반올림하면 [ " + num + " ] 입니다");
	}
	public void rFloor() {
		int no = (int)(Math.random() * (999 - 100 + 1)) + 100;
		System.out.println("랜덤하게 발생한 수 : " + no);
		no = no / 100 * 100;
		System.out.println("십의자리에서 반올림 : " + no);
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
