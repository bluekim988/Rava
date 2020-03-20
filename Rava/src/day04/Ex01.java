package day04;

import java.util.*;
/*
 	4자리 숫자로 된 년도를 입력받아서 
 	윤년인지 평년인지 판단해서 출력하세요.
 	단, switch ~ case 구문으로 사용하세요.
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
		System.out.println(wrongnum + " 잘못된 번호 입니다.");
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
					System.out.println(year + " 년 ==> 윤년");
					return;
				case  CODE_NUM.PYUNG :
					System.out.println(year + " 년 ==> 평년");
					return;
				}
			}
			
			catch(NumberException e){
				System.out.println("프로그램을 다시 시작합니다. \n");
			}
		}
	}
	public int whatsYear() {
		try {
			System.out.print("해당 년도를 입력하세요 : ");
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
