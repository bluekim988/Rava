package day04;

import java.util.Scanner;

/*
 	문제 4]
 		5자리 정수를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 		
 		회문수란?
 			앞에서 읽으나 뒤에서 읽으나 똑같은 수
 */
public class Ex04 {
	Scanner sc = new Scanner(System.in);

	String str = " ==> 회문수입니다.";
	public Ex04() {

			sumNumber();
				
	}
	public void sumNumber() {
			
			while(true) {
				System.out.println("5자리 정수를 입력하세요 ");
				System.out.println("프로그램을 종료시 x 입력");
				System.out.print("입력 : ");
				String num = sc.nextLine();
				if(num.equals("x")) break;
				for(int i = 0; i < num.length(); i++)
					if(num.charAt(i) == num.charAt((num.length()-1)-i)) {
						continue;
					} else {
						str = " ==> 회문수가 아닙니다.";
				}
				System.out.println("입력한 정수 " + num + str);
			}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
