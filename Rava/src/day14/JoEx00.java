package day14;

import javax.swing.JOptionPane;

public class JoEx00 {

	public static void main(String[] args) {
		
		loop :
		for (int i = 0; i < 1; i++) {
			String str = JOptionPane.showInputDialog("�Է�");
			str = null;
			if (str == null) {
				int code = JOptionPane.showConfirmDialog
						(null, "<html><h3>���α׷��� �����Ͻðڽ��ϱ�?</h3></html>",
						"### ���α׷� ���� ###", JOptionPane.YES_NO_OPTION);

				switch (code) {
				case JOptionPane.YES_OPTION:
					return;
				case JOptionPane.NO_OPTION:
					continue loop;
				}
			}
			JOptionPane.showMessageDialog(null, str);
		}

	}
}
