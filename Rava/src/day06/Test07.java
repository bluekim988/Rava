package day06;


import java.util.Arrays;

import javax.swing.JOptionPane;


/*
 ����7]
	���ڿ��� �Է¹޾Ƽ�
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���.
	
	����]
		���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
		
		���ڿ�.charAt(��ġ��);
 */
public class Test07 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("���ڿ� �Է�: ");
		char[] ch = new char[str.length()]; 
		
		for(int i=0; i<str.length(); i++) {		
			ch[i] = str.charAt(i);
		}
		String msg = "���ڿ�: " + str + "\nch�迭 : " + Arrays.toString(ch);
		JOptionPane.showMessageDialog(null, msg);
	}
}
