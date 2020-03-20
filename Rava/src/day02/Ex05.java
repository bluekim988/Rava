package day02;
/*
 	문제 5]
 		랜덤한 숫자를 10 ~ 99 사이의 숫자를 발생시킨 후
 		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
 		
 		예]
 			45 는 50과의 차가 5가 난다.
 			
 			53은 50 과의 차가 3이 난다.	
 			
 			int no2 = 13
 			int no1 = 13 / 10 * 10 = 10
 			int num = 13 % 10 = 3
 			num < 5 ? (no1) : (no1 + 10) 
 */
public class Ex05 {

	public Ex05() {
		int num = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		interval(num);
	}
	
	public void interval(int no) {
		int num1 = no / 10 * 10;
		int num2 = no % 10;
		int num3 = (num2 >= 5) ? (10 + num1) : (num1);
		int result = (num2 >= 5) ? (num3 - no) : (no - num3);
		System.out.println(no + " 와  " + num3 + " 의 차이는 : " + result );
	}
	public static void main(String[] args) {
		new Ex05();

	}

}
