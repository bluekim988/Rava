package day19;

import java.io.*;
import javax.swing.*;

/*
 	���� ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���
 */
public class Test10 {

	public Test10() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			
			/*
			// 1. ���ڸ�(2����Ʈ) �����غ���
			char ch = '��';
			fw.write(ch);
			*/
			
			/*
			// 2. ���ڿ��� char[] �� �Է�����
			String str = "���� �׻� �� �˴ϴ�.";
			char[] ch = str.toCharArray();
			fw.write(ch);
			*/
			
			// 3. ���ڿ���ü�� �Է�����
			String str = "������ �����ӿ�ũ";
			fw.write(str);
			// char ���� ��Ʈ���� �ؽ�Ʈ �����͸� ó���ϵ��� �Ǿ��ֱ� ������
			// �⺻ �Լ��� ���� ó�� ��ɵ� �Բ� �߰��Ǿ���.
			
			JOptionPane.showMessageDialog(null, "����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
