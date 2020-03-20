package day03;

import java.util.Scanner;

/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요.
 				코드		기본요금		사용요금
 		가정용	(1)		3800		245
 		산업용	(2)		2400		157
 		교육용	(3)		2900		169
 		상업용	(4)		3200		174
 		
 		전기요금 = 기본요금 + 사용량  * 사용요금
 		
 		사용자코드와 사용량을 입력받아서 
 		전기요금을 계산해주는 프로그램을 작성하세요.
 */
interface INIT_MENU {
	int HOME=1 , INDUSTRY=2 , EDUCATION=3 , BUSINESS=4;
}
class MenuChoiceExeption extends Exception {
	int wrongChoice;
	
	public MenuChoiceExeption(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice + " 에 해당하는 선택은 존재하지 않습니다.");
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
					System.out.println("감사합니다 :)");
					return;
				}
			}
		
			catch(MenuChoiceExeption e){
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
			catch(Exception r) {
				
			}
		}
		
	}
	public void menu() {
		System.out.println("전기요금 자동 계산 프로그램");
		System.out.println("고객의 해당 번호를 입력하세요.");
		System.out.println("1. 가정용");
		System.out.println("2. 산업용");
		System.out.println("3. 교육용");
		System.out.println("4. 상업용");
		System.out.println("5. 프로그램 종료");
		System.out.print("==> 선택 : ");
	}
	public void homeUser() {
		System.out.print("사용량을 입력하세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		int result = 3800 + no * 245;
		System.out.println("\n고객님의 당월 사용 요금 : " + result +"\n");
	}
	public void sanUpUser() {
		System.out.print("사용량을 입력하세요 : ");
		int no = sc.nextInt();
		int result = 2400 + no * 157;
		System.out.println("\n고객님의 당월 사용 요금 : " + result+"\n");
	}
	public void stuUser() {
		System.out.print("사용량을 입력하세요 : ");
		int no = sc.nextInt();
		int result = 2900 + no * 167;
		System.out.println("\n고객님의 당월 사용 요금 : " + result+"\n");
	}
	public void compUser() {
		System.out.print("사용량을 입력하세요 : ");
		int no = sc.nextInt();
		int result = 3200 + no * 174;
		System.out.println("\n고객님의 당월 사용 요금 : " + result+"\n");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
