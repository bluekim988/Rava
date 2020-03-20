package day03;

import java.util.Scanner;

/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 				�ڵ�		�⺻���		�����
 		������	(1)		3800		245
 		�����	(2)		2400		157
 		������	(3)		2900		169
 		�����	(4)		3200		174
 		
 		������ = �⺻��� + ��뷮  * �����
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ� 
 		�������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
interface INIT_MENU {
	int HOME=1 , INDUSTRY=2 , EDUCATION=3 , BUSINESS=4;
}
class MenuChoiceExeption extends Exception {
	int wrongChoice;
	
	public MenuChoiceExeption(int choice) {
		super("�߸��� ������ �̷������ϴ�.");
		wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice + " �� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}
public class Ex03 {
	Scanner sc = new Scanner(System.in);
	public Ex03() {
			
		while(true) {
			try {
				menu();
				int no = sc.nextInt();
				sc.nextLine();
				if(no<INIT_MENU.HOME || no>INIT_MENU.BUSINESS)
					throw new MenuChoiceExeption(no);
				
				
				switch(no) {
				case INIT_MENU.HOME :
					homeUser();
					break;
				case INIT_MENU.INDUSTRY :
					sanUpUser();
					break;
				case INIT_MENU.EDUCATION :
					stuUser();
					break;
				case INIT_MENU.BUSINESS :
					compUser();
					break;
				case 5 :
					System.out.println("�����մϴ� :)");
					return;
				}
			}
		
			catch(MenuChoiceExeption e){
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n");
			}
			catch(Exception r) {
				
			}
		}
		
	}
	public void menu() {
		System.out.println("������ �ڵ� ��� ���α׷�");
		System.out.println("���� �ش� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. ������");
		System.out.println("2. �����");
		System.out.println("3. ������");
		System.out.println("4. �����");
		System.out.println("5. ���α׷� ����");
		System.out.print("==> ���� : ");
	}
	public void homeUser() {
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int no = sc.nextInt();
		sc.nextLine();
		int result = 3800 + no * 245;
		System.out.println("\n������ ��� ��� ��� : " + result +"\n");
	}
	public void sanUpUser() {
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int no = sc.nextInt();
		int result = 2400 + no * 157;
		System.out.println("\n������ ��� ��� ��� : " + result+"\n");
	}
	public void stuUser() {
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int no = sc.nextInt();
		int result = 2900 + no * 167;
		System.out.println("\n������ ��� ��� ��� : " + result+"\n");
	}
	public void compUser() {
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int no = sc.nextInt();
		int result = 3200 + no * 174;
		System.out.println("\n������ ��� ��� ��� : " + result+"\n");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
