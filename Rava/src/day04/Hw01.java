package day04;

import java.util.Scanner;

/*
 	�� ���� �Է¹��� ��
 	�� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 */
public class Hw01 {
	Scanner sc = new Scanner(System.in);
	public Hw01() {
		System.out.print("ù��° �� : ");
		int no1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int no2 = sc.nextInt();
		ot :
		for(int i=no1;;) {
			for(int j=no2;;) {
				if(i>j) {
					if(i%j-- == 0) {
						System.out.println(no1+" �� "+no2+" �� " + "�ִ����� : "+ ++j);
						break ot;
					}
				} else {
					if(j%i-- == 0) {
						System.out.println(no1+" �� "+no2+" �� " + "�ִ����� : "+ ++i);
						break ot;
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new Hw01();
	}

}
