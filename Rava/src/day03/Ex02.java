package day03;
/*
 	문제 1]
 		게시판에 글을 한페이지에 15개 글을 표시할 수 있다.
 		게시물의 갯수를 랜덤하게 0 ~ 100 발생한 후
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
 		단, 게시물 수가 0인 경우는 1페이지가 필요한 것으로 한다.
 		
 */

public class Ex02 {
	public Ex02() {
		int no = random();
		search(no);
	}
	public int random() {
		
		int result = (int)(Math.random()*(100)); 
		
		return result;
	}
	public void search(int no) {
		switch ((no-1)/15) {
		case 5 :
			System.out.println(no + " 는 6페이지 입니다.");
			break;
		case 4 :
			System.out.println(no + " 는 5페이지 입니다.");
			break;
		case 3 :
			System.out.println(no + " 는 4페이지 입니다.");
			break;
		case 2 :
			System.out.println(no + " 는 3페이지 입니다.");
			break;
		case 1 :
			System.out.println(no + " 는 2페이지 입니다.");
			break;
		case 0  :
			System.out.println(no + " 는 1페이지 입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
