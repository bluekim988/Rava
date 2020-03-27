package day14;

import javax.swing.JOptionPane;

public class JoEx00 {

	public static void main(String[] args) {
		
		loop :
		for (int i = 0; i < 1; i++) {
			String str = JOptionPane.showInputDialog("입력");
			str = null;
			if (str == null) {
				int code = JOptionPane.showConfirmDialog
						(null, "<html><h3>프로그램을 종료하시겠습니까?</h3></html>",
						"### 프로그램 종료 ###", JOptionPane.YES_NO_OPTION);

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
