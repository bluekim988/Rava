package day04;
/*
 	4자리 숫자로된 년도를 입력받아서
 	그 해가 윤년인지 아닌지 판단하세요.
 */
import java.util.*;

class YunPyung {
	int year = 0;
	Scanner sc = new Scanner(System.in);
	
	public YunPyung() {
		try {
			System.out.print("해당 년도를 입력하세요 : ");
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
			System.out.println(no + " 년 ==> 윤년입니다.");
		} else {
			System.out.println(no + " 년 ==> 평년입니다.");
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
