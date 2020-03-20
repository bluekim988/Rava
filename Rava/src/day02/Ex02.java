package day02;
/*
	문제 2]
	 		0 ~ 255 사이의 숫자를 랜덤하게 만들고
	 		그 숫자를 코드값으로 하는 문자를 만들어서
	 		해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
	 		단, 삼항 연산자를 사용해서 처리하세요.
*/
public class Ex02 {
	
	public Ex02() {
		char ch = (char)(Math.random() * (255 + 1));
		
		what(ch);
	}
	
	public void what(char ch) {
		String result = (ch >= 'A' && ch <= 'Z') ? 
				(ch + " 영문자 ") : (ch  >= 'a' && ch <= 'z') ? (ch + "영문자") : (ch +" 영문자가 아닙니다.");
				System.out.println(result);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
