package day17;

import java.util.*;
import javax.swing.*;

public class Test08 {

	public Test08() {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("�̸�", "ū��");
		table.put("tel", "010-1111-1111");
		table.put("����", "�ǹ���");
		table.put("�ξ�", "���");

		// ������ ������
		/*
		 * String key = JOptionPane.showInputDialog("�˰���� ������ �Է��ϼ���");
		 * 
		 * JOptionPane.showMessageDialog(null, table.get(key));
		 */
		// Map �迭�� Ű���� �˾ƾ� �����͸� ������ �ִ�

		Collection<String> con = table.values();

		Iterator<String> itr = con.iterator();

//		while (itr.hasNext()) {
//			JOptionPane.showMessageDialog(null, itr.next());
//		}

		Enumeration<String> en = table.keys();

		while (en.hasMoreElements()) {
			String key = en.nextElement();
			JOptionPane.showMessageDialog(null,key + " : " + table.get(key));
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
