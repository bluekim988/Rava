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
	
	public Ex01() {
		pw();
	}
	
	public void pw() {
		String pw = JOptionPane.showInputDialog("�н����带 �Է��ϼ���");
		Pattern pt = Pattern.compile("^(?=.*[\\W])(?=.*[a-zA-Z])(?=.*[\\d])[\\Wa-zA-Z\\d]{8,}$");
		Matcher mt = pt.matcher(pw);
		
		String str = "�߸��� pw �����Դϴ�.";
		if(mt.matches()) {
			str = "�н����尡 �ԷµǾ������ϴ�";
		}
		
		JOptionPane.showMessageDialog(null, str);
		
	}
	
	public void id() {
		String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���");
		Pattern pt = Pattern.compile("^([a-z\\d_-]{5,15})$");
		Matcher mt = pt.matcher(id);
		
		String str = "�߸��� id �����Դϴ�.";
		if(mt.matches()) {
			str = "���̵� ����������ϴ�";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}
	public void email() {
		String mail = JOptionPane.showInputDialog("�̸����� �Է��ϼ���");
		Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([\\da-z]+)\\.([a-z\\.]{2,6}$)");	
		Matcher matcher = pattern.matcher(mail);
		
		String str = "�߸��� �̸��� �����Դϴ�";
		if(matcher.matches()) {
			str = "�̸����� �ԷµǾ����ϴ�.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
