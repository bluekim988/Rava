package day04;

import java.util.Scanner;

/*
 	���� 4]
 		5�ڸ� ������ �Է¹޾Ƽ�
 		�� ���ڰ� ȸ�������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
 		
 		ȸ������?
 			�տ��� ������ �ڿ��� ������ �Ȱ��� ��
 */
public class Ex04 {
	Scanner sc = new Scanner(System.in);

	String str = " ==> ȸ�����Դϴ�.";
	public Ex04() {

			sumNumber();
				
	}
	public void sumNumber() {
			
			while(true) {
				System.out.println("5�ڸ� ������ �Է��ϼ��� ");
				System.out.println("���α׷��� ����� x �Է�");
				System.out.print("�Է� : ");
				String num = sc.nextLine();
				if(num.equals("x")) break;
				for(int i = 0; i < num.length(); i++)
					if(num.charAt(i) == num.charAt((num.length()-1)-i)) {
						continue;
					} else {
						str = " ==> ȸ������ �ƴմϴ�.";
				}
				System.out.println("�Է��� ���� " + num + str);
			}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
