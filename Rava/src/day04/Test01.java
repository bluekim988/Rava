package day04;
/*
 	4�ڸ� ���ڷε� �⵵�� �Է¹޾Ƽ�
 	�� �ذ� �������� �ƴ��� �Ǵ��ϼ���.
 */
import java.util.*;

class YunPyung {
	int year = 0;
	Scanner sc = new Scanner(System.in);
	
	public YunPyung() {
		try {
			System.out.print("�ش� �⵵�� �Է��ϼ��� : ");
			int no = sc.nextInt();
			sc.nextLine();
			year = no;
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	public void whatIsYear(int no) {
		if(no%4==0 & no%100!=0 || no%400==0) {
			System.out.println(no + " �� ==> �����Դϴ�.");
		} else {
			System.out.println(no + " �� ==> ����Դϴ�.");
		}
		
	}
}

public class Test01 {
	public Test01() {
		YunPyung ye = new YunPyung();
		ye.whatIsYear(ye.year);
	}
	public static void main(String[] args) {
		new Test01();
	
	}
}
