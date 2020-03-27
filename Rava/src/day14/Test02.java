package day14;

import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		// 숫자형태의 문자열을 입력받고
		String sno = JOptionPane.showInputDialog("숫자를 입력하세요!");
		// 정수 변수를 만들고
		int no = 0 ;
		
		try {
			System.out.println("*** 숫자 변환 전 ***");
			no = Integer.parseInt(sno);
			System.out.println("### 숫자 변환 후 ###");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("no : " + no);
		}
	}

}
