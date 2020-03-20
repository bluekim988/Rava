package day07;
import javax.swing.*;
public class Test04 {
	public static void main(String[] args) {
		String str = "자바를 이용해서 코딩하고 프로그램을 만들자";
		
		String str1 = str.substring(9, str.length());
		
		JOptionPane.showMessageDialog(null, "****" +str1+"****");
	}

}
