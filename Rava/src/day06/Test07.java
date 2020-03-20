package day06;


import java.util.Arrays;

import javax.swing.JOptionPane;


/*
 문제7]
	문자열을 입력받아서
	문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요.
	
	참고]
		문자열의 특정위치의 문자를 추출해주는 함수
		
		문자열.charAt(위치값);
 */
public class Test07 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("문자열 입력: ");
		char[] ch = new char[str.length()]; 
		
		for(int i=0; i<str.length(); i++) {		
			ch[i] = str.charAt(i);
		}
		String msg = "문자열: " + str + "\nch배열 : " + Arrays.toString(ch);
		JOptionPane.showMessageDialog(null, msg);
	}
}
