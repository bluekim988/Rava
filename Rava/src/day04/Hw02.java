package day04;

import java.util.Scanner;

/*
 	두 수를 입력받은 후
 	두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
 */

public class Hw02 {
	Scanner sc = new Scanner(System.in);
	public Hw02() {
		
		int sum = 1;
		System.out.print("첫번째 수 :");
		int no1 = sc.nextInt();
		System.out.print("두번째 수 :");
		int no2 = sc.nextInt();
		
		
		while(true) {
			if(sum%no1==0 && sum%no2==0) {
				System.out.println(no1+"과"+no2+"의 최소공배수는 : "+ sum);
				return;
			}sum++;
		}
	}
	public static void main(String[] args) {
		new Hw02();

	}

}
