package day07;
import javax.swing.*;
public class Test04 {
	public static void main(String[] args) {
		String str = "�ڹٸ� �̿��ؼ� �ڵ��ϰ� ���α׷��� ������";
		
		String str1 = str.substring(9, str.length());
		
		JOptionPane.showMessageDialog(null, "****" +str1+"****");
	}

}
