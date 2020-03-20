package day09;
/*
 	1차원 배열에 
 	'A' ~ 'E' 까지 초기화 해주는 함수를 제작해서
 	전역변수 ch 에 초기화를 해주고
 	
 	대문자를 입력하면 소문자로 반환해주는 함수를 만들어서
 	ch의 문자를 소문자로 모두 변경 하세요.
 	
 	
 	심화학습]
 		문자배열을 입력하면
 		문자배열을 'A' ~ 'E' 초기화해주는 기능을 가진 함수를 작성하고
 		실행해서 출력하세요.
 */

public class Test03 {
	char[] ch;
	char[] test = new char[5];
	
	public Test03() {
		// ch 배열 초기화
		setCh();
		
		// 출력해보기
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		// toSo메소드를 호출해 문자 변환하기
		for(int i=0; i<ch.length; i++) {
			ch[i] = toSo(ch[i]);
		}
		// 줄바꿈
		System.out.println();
		
		// 출력해보기
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		
		// 심화문제
		setArr(test);
		
		System.out.println();
		System.out.println("\n-------심화문제---------");
		
		//출력해보기
		for(char c : test) {
			System.out.printf("%2c | ", c);
		}
	}
	// 심화문제 메소드
	public void setArr(char[] ar) {
		for(int i=0; i<ar.length; i++) {
			ar[i] = (char)('A' + i);
		}
	}
	
	// 문자배열 초기화시키는 기능의 함수
	public void setCh() {
		ch = new char[5];
		for(int i = 0; i<ch.length; i++) {
			ch[i] = (char)('A' + i);
		}	
	}
	
	// 대문자를 소문자로 반환해주는 함수
	public char toSo(char c) {
		char result = (char)(c + ('a' - 'A'));
		return result;
	}
	public static void main(String[] args) {
		new Test03();
		
	}

}
