package day14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TriangleExec {
	ArrayList<Triangle> list = new ArrayList<Triangle>();

	public TriangleExec() {
		
		try {
			setTriangleInst();
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			JOptionPane.showMessageDialog(null, "������ ����˴ϴ�.");
		}
		
		JOptionPane.showMessageDialog(null,"1�� " + list.get(0).toString() );
		JOptionPane.showMessageDialog(null,"2�� " + list.get(1).toString() );
		
		String str = "�ﰢ��1�� �ﰢ��2��  " + (list.get(0).equals(list.get(1)) ? "���� �ﰢ�� �Դϴ�." : "�ٸ� �ﰢ�� �Դϴ�." );
		
		JOptionPane.showMessageDialog(null, str);
		
		
	}
	
	public void setTriangleInst() throws NumberFormatException{
		for(int i = 0; i < 2; i++) {
			String numStr = JOptionPane.showInputDialog("�غ��� �Է��ϼ���");
			String numStr2 = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
			int num = Integer.parseInt(numStr);
			int num2 = Integer.parseInt(numStr2);
			
			if(num < 0 || num2 < 0) {
				throw new NumberFormatException("ù���� �Է�" + num + "�ι��� �Է�  " + num2);
			}
			
			list.add(new Triangle(num, num2));
		}
	}
	public static void main(String[] args) {
		new TriangleExec();

	}

}
