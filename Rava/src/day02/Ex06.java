package day02;

import java.util.Scanner;

/*
  	���� 6]
 		������ �⵵�� �Է¹޾Ƽ�
 		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		��, ���׿����ڸ� ����ؼ� ó���ϼ���.
 */

public class Ex06 {

	public Ex06() {
		Scanner sc = new Scanner(System.in);
		
		view();
		int no = sc.nextInt();
		System.out.println("\n ������ ����������..... \n");
		System.out.println("......����.....");
		System.out.println(".........��� \n");
		year(no);
	}
	
	public void year(int no) {
		String str = (no % 4 == 0 && no % 100 != 0) ? ("[ " + no + " ] ���� �Դϴ�.") : 
			(no % 400 == 0) ? ("[ " + no + " ] ���� �Դϴ�.") : ("[ " + no + " ] ��� �Դϴ�.");
			
		System.out.println(str + "\n");
	}
	
	public void view() {
		System.out.println("*** �� ���α׷��� �ش� �⵵�� �������� ������� �˷��帳�ϴ�. ***");
		System.out.print("�⵵�� �Է��ϼ��� : ");
	}
	public static void main(String[] args) {
		new Ex06();
	}

}
