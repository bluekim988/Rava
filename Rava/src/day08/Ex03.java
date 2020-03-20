package day08;
/*
 문제 3]
	"PengSoo Good!"
	이라는 문자열을 한 문자씩 꺼내서
	배열로 저장하고
	하나씩 꺼내서 출력하세요.
 */

public class Ex03 {

	public static void main(String[] args) {
		String str = "PengSoo Good!";
		
		char[] ch = new char[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		for(char j : ch) {
			System.out.print(j + " ");
		}
	}

}
