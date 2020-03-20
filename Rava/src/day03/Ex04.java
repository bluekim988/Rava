package day03;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/*
 	문제 3]
 		부서번호를 입력하면
 		부서이름을 출력해주는 프로그램을 작성하세요.
 		
 			10 - 총무부
 			20 - 회계부
 			30 - 영업부
 			40 - 기술부
 			나머지 - 다음기회에...
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
			System.out.println("해당 부서는 [ 총무부 ] 입니다\n");
			break;
		case 20 :
			System.out.println("해당 부서는 [ 총무부 ] 입니다\n");
			break;
		case 30 :
			System.out.println("해당 부서는 [ 총무부 ] 입니다\n");
			break;
		case 40 :
			System.out.println("해당 부서는 [ 총무부 ] 입니다\n");
			break;
		default :
			System.out.println("정확한 번호를 입력해주세요.");
			break;
		}			
	}
	public void showMenu() {
		System.out.println("부서 정보 출력 프로그램");
		System.out.println("사용자의 해당 부서 번호를 입력해주세요");
		System.out.print("입력 : ");
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
