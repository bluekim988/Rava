package day04;

import java.util.Scanner;

/*
 	�� ���� �Է¹��� ��
 	�� ���� �ּҰ������ ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 */

public class Hw02 {
	Scanner sc = new Scanner(System.in);
	public Hw02() {
		
		int sum = 1;
		System.out.print("ù��° �� :");
		int no1 = sc.nextInt();
		System.out.print("�ι�° �� :");
		int no2 = sc.nextInt();
		
		
		while(true) {
			if(sum%no1==0 && sum%no2==0) {
				System.out.println(no1+"��"+no2+"�� �ּҰ������ : "+ sum);
				return;
			}sum++;
		}
	}
	public static void main(String[] args) {
		new Hw02();

	}

}
