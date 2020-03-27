package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test05 {
	public Test05() {
		// ��ȭ��ȣ�� �Է¹޾Ƽ� �Է��� ��ȣ�� �´� �������� �˻��غ�����
		
		String num = JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
		
		// 1. Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
		// �׷��� Pattern Ŭ������ �������Լ��� ȣ���� �� ������ ���߾� ���� Ŭ�����̹Ƿ�
		// �� Ŭ������ ��ü�� ������� �Լ��� �Ӽ��� static �̸鼭 ��ȯ���� Pattern �� �Լ��� ã�Ƽ� ����ϸ� �� ���̴�.
		// compile(String regex)
		Pattern pattern = Pattern.compile("^0[0-9]{2}-[0-9]{3,4}-[0-9]{4}$");
		/*
		 	2. �� Ŭ�������� ���Խ� ������ �˻��� �޶�� ��û�Ѵ�.
		 		������ �˻��ϴ� �Լ��� matcher()
		 		�� �Լ��� �˻� ����� Matcher ��� Ŭ���� Ÿ������ ��ȯ�� ���ش�
		 		���� ����� ���� ��� ������ Matcher Ŭ�������� ó���� �ؾ� �� ���̴�.
 				
 				����� �˾Ƴ��� ���
 				
 					matches()
		 */
		
		Matcher match = pattern.matcher(num);
		
		//���� �˻� ����� match �� ������ �Ǿ� ������ ������ ����ϸ� �ȴ�.
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� ��ȭ��ȣ�Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� ��ȣ�����Դϴ�.");			
		}
	}
	public static void main(String[] args ) {
		new Test05();
	}
}
