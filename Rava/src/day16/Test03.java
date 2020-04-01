package day16;

import java.text.ChoiceFormat;

import javax.swing.JOptionPane;

public class Test03 {

	
	public Test03() {
		double[] limits = {0, 60, 70, 80, 90};
		// limits�� ���鶧 ���ǻ���
		// �ݵ�� �������� ���ĵǾ�� �Ѵ�.
		String[] formats = {"F", "D", "C", "B", "A"};
		// �̶� �ݵ�� limits�� ������ ��ġ ���Ѿ� �Ѵ�.
		
		ChoiceFormat c = new ChoiceFormat(limits, formats);
		
		// ������ �Է¹޾� ������ ó���غ���
		while(true) {
			String str = JOptionPane.showInputDialog("���� �Է�\n����� q�Է�");
			if(str.equals("q"))
				break;
			int score = 0;
			try {
				score = Integer.parseInt(str);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "�ٽ� �Է��ϼ���");
				continue;
				
			}
			String grade = c.format(score);
			JOptionPane.showMessageDialog(null, "���� " + score + "\n���� " + grade);
		}	
	}
	
	
	public static void main(String[] args) {
		new Test03();
		
	}

}
