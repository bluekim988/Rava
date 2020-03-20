package day06;

import java.util.Arrays;

/*
 문제1]
	'A' ~ 'J' 까지의 문자를 순차적으로 만들어서
	배열에 넣고 각 문자를 하나씩 꺼내서 소문자로 변경하고 출력하세요.
	
	배열에 담긴 내용을 문자열로 확인해서 출력하세요.
	
 */
public class Ex01 {
	public static char[] upper(char[] up) {
		
		char ch = 'A';
		for(int i=0; i<up.length; i++) {
			up[i] = (char)(ch++ + ('a' - 'A'));
		}
		return up;
	}
	public static void main(String[] args) {
		char[] arr = new char[10];
		char[] rev = new char[10];
		
		
		char ch = 'A';
		for(int i=0; i<arr.length; i++) {
			arr[i] = ch++;
		}

		System.out.println(Arrays.toString(arr));
		rev = upper(arr);
		
		System.out.print("[");
		for(int j : rev) {
			System.out.printf("%2c", (char)j);
		}
		System.out.print("]");
		System.out.println();
		
	}

}
