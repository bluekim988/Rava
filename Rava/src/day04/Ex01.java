package day04;

import java.util.*;
/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� 
 	�������� ������� �Ǵ��ؼ� ����ϼ���.
 	��, switch ~ case �������� ����ϼ���.
 */
interface CODE_NUM {
	int YUN = 1, PYUNG = 2;
}
class NumberException extends Exception {
	int wrongnum;

	public NumberException(int num) {
		super("xxx");
		wrongnum = num;
	}
	public void showWrong() {
		System.out.println(wrongnum + " �߸��� ��ȣ �Դϴ�.");
	}
}
public class Ex01 {
	Scanner sc = new Scanner(System.in);
	public Ex01() {
		while(true) {
			try {
				int year = whatsYear();
				if(year < 0) 
					throw new NumberException(year);
					
				int code;
				if(year%4==0 & year%100!=0 || year%400==0) {
					code = 1;
				} else {
					code = 2;
			}
			
				switch(code) {
				case  CODE_NUM.YUN :
					System.out.println(year + " �� ==> ����");
					return;
				case  CODE_NUM.PYUNG :
					System.out.println(year + " �� ==> ���");
					return;
				}
			}
			
			catch(NumberException e){
				System.out.println("���α׷��� �ٽ� �����մϴ�. \n");
			}
		}
	}
	public int whatsYear() {
		try {
			System.out.print("�ش� �⵵�� �Է��ϼ��� : ");
			int no = sc.nextInt();
			if(no < 0)
			throw new NumberException(no);
			
			return no;
		}
		catch(NumberException e) {
			e.showWrong();
			return -1;
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
