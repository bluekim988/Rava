package day15;
/*
 	���� 1]
 	
 		�̸����� �Է¹޾Ƽ�
 		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �ƴ��� �˻��ϼ���.
 		�̸��� ������ 
 			���ĺ��� ���ڷ� 8�� �̻����� �ϰ�  @ �������ּҷ� ó���ϼ���.
 		����]
 			�ѱ� ó�� : [��-�R]	- �ѱ��� ���̵� ���� ������.
 */

import java.util.regex.*;
import javax.swing.*;

public class Ex01 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("�̸����� �Է��ϼ���");
		
		Pattern pattern = Pattern.compile("^[\\w._%+-]+@[a-zA-Z]+\\.[a-zA-Z]+\\.[a-zA-Z]{2,6}$");
		
		Matcher matcher = pattern.matcher(mail);
		
		String str = "�߸��� �̸��� �����Դϴ�";
		if(matcher.matches()) {
			str = "�̸����� �ԷµǾ����ϴ�.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

}
