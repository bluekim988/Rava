package day07;
/*
 문제1]
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서 출력하고,
	원래 배열을 소문자로 변경한 후 두 배열을 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		int[] ch = new int[10];
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = ((int)(Math.random()*('Z' - 'A' +1))+'A');
		}
		
		int[] ch2 = ch;
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = ch[i] + ('a'-'A');
		}
		
		for(int i : ch) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i : ch2) {
			System.out.print((char)i + " ");
		}
	}

}
