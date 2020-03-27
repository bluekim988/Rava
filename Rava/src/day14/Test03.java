package day14;

import javax.swing.JOptionPane;

public class Test03 {

	public Test03() {
		int num = 0;			
		try {
			num = getNum();
			System.out.println(num);
		} catch(NumberFormatException n) {
			System.out.println(n.getMessage());
			n.printStackTrace();
		} 
		
		System.out.println("정상종료");
		
	}
	public int getNum() throws NumberFormatException {
		String numStr = JOptionPane.showInputDialog("정수를 입력하세요");
		int num = Integer.parseInt(numStr);
		
		if(num<0) {
			throw new NumberFormatException(num + "");
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
