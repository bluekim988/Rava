package day02;

import java.util.Scanner;

/*
 ���� 4]
 		�Ҽ����� �ִ� ���ڸ� �Է��� ��
 		�Ҽ��� ���� ��°�ڸ����� �ݿø��� ����� ����ϼ���.
 		
 		����]
 			+0.005 ��°�ڸ����� ��ȭ�� �Ͼ ���̰�
 			���⿡ x100 ���ָ� ��°���� �����ο� �� ���̰�
 			�̰��� ������ �ٲٸ� �������� ��°�ڸ� ���ϴ� �������̰�
 			�ٽ� / 100 ���ָ� �� �Ҽ��� ���·� ��ȯ�� ���̰�...
 */
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ��� �Է��ϼ��� : " );
		double no = sc.nextDouble();
		double num = ban(no);
		System.out.println(no + " ���� ��°�ڸ� �ݿø� �� �� : " + num);
	}
	
	public double ban(double no) {
		int num = (int)(no * 1000);
		int num2 = (int)((num + 5) /10.);
		double result = num2 / 100.;
		return result;
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
