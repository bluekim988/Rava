package day01;

import java.util.Scanner;

/*
 * 5. 54232���� �����ؾ��Ѵ�.
 		�츮������ ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
 		5������ - 1��
 		1������ - 0��
 		5õ���� - 0��
 		1õ���� - 4��
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܵ� ��ȯ�� �ݾ� �Է����ּ��� : ");
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
		
		System.out.println("5������ : " + five_mill + "�� ");
		System.out.println("1������ : " + one_mill + "�� ");
		System.out.println("5õ���� : " + five_st + "�� ");
		System.out.println("1õ���� : " + one_st + "�� ");
		System.out.println("5���   : " + five_hd + "�� ");
		System.out.println("1���   : " + one_hd  + "�� ");
		System.out.println("50��    : " + five_ten + "�� ");
		System.out.println("10��    : " + ten + "�� ");
		System.out.println("1��      : " + one + "�� ");
		
		
	}

}
