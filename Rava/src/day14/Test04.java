package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getSum()�� ����� ������ �غ���
	// �Է¹��� ���ڿ� 10�� ���� ������ ��ȯ���ֵ��� �������̵� �غ���
	
	public int getNum() throws NumberFormatException {
		String numStr = JOptionPane.showInputDialog("������ �Է��ϼ���");
		int num = Integer.parseInt(numStr);
		
		if(num < 0) {
			throw new NumberFormatException();
		}
		
		return num * 10;
	}
	public static void main(String[] args) {
		new Test04();

	}

}
