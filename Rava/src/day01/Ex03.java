package day01;

import java.util.Scanner;

public class Ex03 {
/*
 *  	3. �ΰ��� ����(����)�� ������ ���
 	 	�� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
 	 	
 	4. 3�� ������ �� ���� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int x_num = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int y_num = sc.nextInt();
		sc.nextLine();
		
		int sq_around = x_num * y_num;
		
		double tri_around = x_num * y_num * 0.5;
		
		System.out.println("���� :" + x_num + " ���� : " + y_num + " �� �簢���� ���� : " + sq_around + "\n");
		System.out.println("�غ� : " + x_num + " ���� : " + y_num + " �� �ﰢ���� ���� : " + tri_around);
	}
	
}
