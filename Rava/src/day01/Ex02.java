package day01;

import java.util.Scanner;

public class Ex02 {
	/*
	2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
		���� �ѷ� : 2 * ������ * 3.14
		���� ���� : ������ * ������ * 3.14
		
		��, ������, �ѷ�, ���̴� ������ ���� ó���� �ϼ���.
		�׸��� �ѷ��� float Ÿ���� ������ ���弼��.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		float half = sc.nextFloat();
		sc.hasNextLine();
		sc.close();
		float round = (float)2 * half * (float)3.14;
		float area = half * half * (float)3.14;
		
		System.out.println("������ " + half + " �� ���� �ѷ� : " + round);
		System.out.println("������ " + half + " �� ���� ���� : " + area );
		
	}
	

}
