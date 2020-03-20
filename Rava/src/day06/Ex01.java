package day06;

import java.util.Arrays;

/*
 ����1]
	'A' ~ 'J' ������ ���ڸ� ���������� ����
	�迭�� �ְ� �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ� ����ϼ���.
	
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���.
	
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
