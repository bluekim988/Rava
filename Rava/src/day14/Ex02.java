package day14;
/*
 	문제 2]
	
		if - else if 구문을 사용해서
		
		나이를 입력하면 십대, 이십대, ...
		판별해주는 프로그램을 작성하세요.
 */

import javax.swing.JOptionPane;

public class Ex02 {

	public Ex02() {
		
		String ageIn = JOptionPane.showInputDialog("나이를 입력하세요");
		String str = "";
		try {
			int age = Integer.parseInt(ageIn);
			
			str = showG(age);
			
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			str = ageIn + " 잘못된 입력입니다. \n나이 형식을 입력하세요.";
			
		}
		
		JOptionPane.showMessageDialog(null, str);
		
		
	}

	public String showG(int no) throws NumberFormatException {
		if(no >= 0 && no < 10) {
		return no + "세 ";
		} else if (no>=10) {
			return no/10 * 10 + "대 입니다";
		} else {
			throw new NumberFormatException(no+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

}
