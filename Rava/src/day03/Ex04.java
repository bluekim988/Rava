package day03;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/*
 	���� 3]
 		�μ���ȣ�� �Է��ϸ�
 		�μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 			10 - �ѹ���
 			20 - ȸ���
 			30 - ������
 			40 - �����
 			������ - ������ȸ��...
 */
public class Ex04 {
	Scanner sc = new Scanner(System.in);
	public Ex04() {
		
		showMenu();
		int no = sc.nextInt();
		sc.nextLine();
		
		deptno(no);
	}
	public void deptno(int no) {
		switch(no) {
		case 10 :
			System.out.println("�ش� �μ��� [ �ѹ��� ] �Դϴ�\n");
			break;
		case 20 :
			System.out.println("�ش� �μ��� [ �ѹ��� ] �Դϴ�\n");
			break;
		case 30 :
			System.out.println("�ش� �μ��� [ �ѹ��� ] �Դϴ�\n");
			break;
		case 40 :
			System.out.println("�ش� �μ��� [ �ѹ��� ] �Դϴ�\n");
			break;
		default :
			System.out.println("��Ȯ�� ��ȣ�� �Է����ּ���.");
			break;
		}			
	}
	public void showMenu() {
		System.out.println("�μ� ���� ��� ���α׷�");
		System.out.println("������� �ش� �μ� ��ȣ�� �Է����ּ���");
		System.out.print("�Է� : ");
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
