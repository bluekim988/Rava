package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getSum()의 기능을 수정을 해보자
	// 입력받은 숫자에 10을 곱한 정수를 반환해주도록 오버라이드 해보자
	
	public int getNum() throws NumberFormatException {
		String numStr = JOptionPane.showInputDialog("정수를 입력하세요");
		int num = Integer.parseInt(numStr);
		
		if(num < 0) {
			throw new NumberFormatException();
		}
		
		return num * 10;
	}
	public static void main(String[] args) {
		new Test04();

	}

}
