package day02;

import java.util.Scanner;

/*
 문제 4]
 		소수점이 있는 숫자를 입력한 후
 		소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
 		
 		원리]
 			+0.005 세째자리에서 변화가 일어날 것이고
 			여기에 x100 해주면 두째까지 정수부에 들어갈 것이고
 			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고
 			다시 / 100 해주면 원 소수점 형태로 변환될 것이고...
 */
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수를 입력하세요 : " );
		double no = sc.nextDouble();
		double num = ban(no);
		System.out.println(no + " 에서 세째자리 반올림 한 수 : " + num);
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
