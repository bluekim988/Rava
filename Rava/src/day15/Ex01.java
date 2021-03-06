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
	
	public Ex01() {
		pw();
	}
	
	public void pw() {
		String pw = JOptionPane.showInputDialog("패스워드를 입력하세요");
		Pattern pt = Pattern.compile("^(?=.*[\\W])(?=.*[a-zA-Z])(?=.*[\\d])[\\Wa-zA-Z\\d]{8,}$");
		Matcher mt = pt.matcher(pw);
		
		String str = "잘못된 pw 형식입니다.";
		if(mt.matches()) {
			str = "패스워드가 입력되어졌습니다";
		}
		
		JOptionPane.showMessageDialog(null, str);
		
	}
	
	public void id() {
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		Pattern pt = Pattern.compile("^([a-z\\d_-]{5,15})$");
		Matcher mt = pt.matcher(id);
		
		String str = "잘못된 id 형식입니다.";
		if(mt.matches()) {
			str = "아이디가 만들어졌습니다";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}
	public void email() {
		String mail = JOptionPane.showInputDialog("이메일을 입력하세요");
		Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([\\da-z]+)\\.([a-z\\.]{2,6}$)");	
		Matcher matcher = pattern.matcher(mail);
		
		String str = "잘못된 이메일 형식입니다";
		if(matcher.matches()) {
			str = "이메일이 입력되었습니다.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
