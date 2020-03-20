package day01;

import java.util.Scanner;

/*
 * 5. 54232원을 지불해야한다.
 		우리나라의 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
 		5만원권 - 1장
 		1만원권 - 0장
 		5천원권 - 0장
 		1천원권 - 4장
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔돈 변환할 금액 입력해주세요 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		int five_mill = 0;
		int one_mill = 0;
		int five_st = 0;
		int one_st = 0;
		int five_hd = 0;
		int one_hd = 0; 
		int five_ten = 0;
		int ten = 0;
		int one = 0;
		
		int tmp = money;
		five_mill = tmp / 50000;
		tmp %= 50000;
		one_mill = tmp / 10000;
		tmp %= 10000;
		five_st = tmp / 5000;
		tmp %= 5000;
		one_st = tmp / 1000;
		tmp %= 1000;
		five_hd = tmp / 500;
		tmp %= 500;
		one_hd = tmp / 100;
		tmp %= 100;
		five_ten = tmp / 50;
		tmp %= 50;
		ten = tmp / 10;
		tmp %= 10;
		one = tmp / 1;
		
		System.out.println("5만원권 : " + five_mill + "장 ");
		System.out.println("1만원권 : " + one_mill + "장 ");
		System.out.println("5천원권 : " + five_st + "장 ");
		System.out.println("1천원권 : " + one_st + "장 ");
		System.out.println("5백원   : " + five_hd + "개 ");
		System.out.println("1백원   : " + one_hd  + "개 ");
		System.out.println("50원    : " + five_ten + "개 ");
		System.out.println("10원    : " + ten + "개 ");
		System.out.println("1원      : " + one + "개 ");
		
		
	}

}
