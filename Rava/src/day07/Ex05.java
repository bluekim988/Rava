package day07;
/*
 문제5]
	영문 문자열을 입력받아서
	해당 알파벳이 출현하는 빈도를 저장하고
	빈도를 *로 표현하세요.
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("영문 문자열 : ");
		
		char[] abc = new char[str.length()];
		abc = str.toCharArray();

		int cnt = 0;
		ot :
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<i; j++) {
				if(abc[i] == abc[j]) {
					continue ot;
				}
			}
			cnt++;
		}
		
		char[] abcRe = new char[cnt];
		String st = "";
		ot :
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<i; j++) {
				if(abc[i] == abc[j]) {
					continue ot;
				}
			}
			st += abc[i];
		}
		abcRe = st.toCharArray();	
		System.out.println(Arrays.toString(abcRe));
		
		int[] count = new int[cnt];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			for(int j=0; j<abcRe.length; j++) {
				if(c==abcRe[j]) {
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		System.out.println(str);
		System.out.println("===========================");
		for(int i=0; i<abcRe.length; i++) {
			System.out.printf("%3c", abcRe[i]);
			System.out.printf("%3d", count[i]);
			for(int j=0; j<count[i]; j++) {
				System.out.printf("%3s","*");
			}
			System.out.println();
		}

	}
	

}
