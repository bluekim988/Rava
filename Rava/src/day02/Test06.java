package day02;

import java.util.Scanner;

public class Test06 {
/*
 	�����ϰ� ���� 11 ~ 33 ������ �μ��� �߻���Ű��
 	���ڸ� �Է¹޾Ƽ� 
 	�Է¹��� ���ڰ� 1�̸� �ﰢ���� ���̸�
 			  2�̸� �簢���� ���̸� �����ִ� ���α׷��� �ۼ��ϼ���.
 */
	public Test06() {
		Scanner sc = new Scanner(System.in);
		
		menu();
		int code = sc.nextInt();
		sc.nextLine();
		
		int no1 = (int)(Math.random() * (33 - 11 + 1)) + 1;
		int no2 = (int)(Math.random() * (33 - 11 + 1)) + 1;
		
		/*
		 	�簢���� �ﰢ���� ������ Ÿ���� �ٸ��� ������
		 	�Ѱ��� Ÿ������ ���� ������߰ڴ�.
		 	���⼭�� �Լ� ������ ����� �״�� ����� �뵵�θ� ����� ���̱� ������
		 	���ڿ��� �����ؼ� ����ϸ� �ɰ� ����.
		 */
		double semo = samgak(no1, no2);
		double sagak = sagak(no1, no2);
		
		String result = 
				(code == 1) ? (no1 + " , " + no2 + " �ﰢ���� ���� : " + semo) : 
							(	
					code == 2 ? (no1 + " , " + no2 + " �簢���� ���� : " + sagak) : ("�߸��� �Է�")
										);
		System.out.println(result);
	}
	//	�ﰢ�� ���� �����ִ� �Լ�
	public double samgak(int no1, int no2) {
		double area = no1 * no2 / 2.;
		return area;
	}
	//	�簢�� ���� �����ִ� �Լ�
	public int sagak(int no1, int no2) {
		int area = no1 * no2;
		return area;
	}
	public void menu() {
		System.out.println("***\t���α׷��� �����մϴ� \t ***");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �簢�� ����");
		System.out.print("�Է� : ");
	}
	public static void main(String[] args) {
		new Test06();
	}

}
