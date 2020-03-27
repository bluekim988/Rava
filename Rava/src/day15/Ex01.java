package day15;
/*
 	문제 1]
 	
 		이메일을 입력받아서
 		입력받은 문자열이 이메일 형식에 맞는지 아닌지 검사하세요.
 		이메일 형식은 
 			알파벳과 숫자로 8자 이상으로 하고  @ 도메인주소로 처리하세요.
 		참고]
 			한글 처리 : [가-힣]	- 한글은 아이디에 쓰지 마세요.
 */

import java.util.regex.*;
import javax.swing.*;

public class Ex01 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("이메일을 입력하세요");
		
		Pattern pattern = Pattern.compile("^[\\w._%+-]+@[a-zA-Z]+\\.[a-zA-Z]+\\.[a-zA-Z]{2,6}$");
		
		Matcher matcher = pattern.matcher(mail);
		
		String str = "잘못된 이메일 형식입니다";
		if(matcher.matches()) {
			str = "이메일이 입력되었습니다.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

}
