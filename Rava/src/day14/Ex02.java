package day14;
/*
 	���� 2]
	
		if - else if ������ ����ؼ�
		
		���̸� �Է��ϸ� �ʴ�, �̽ʴ�, ...
		�Ǻ����ִ� ���α׷��� �ۼ��ϼ���.
 */

import javax.swing.JOptionPane;

public class Ex02 {

	public Ex02() {
		
		String ageIn = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		String str = "";
		try {
			int age = Integer.parseInt(ageIn);
			
			str = showG(age);
			
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			str = ageIn + " �߸��� �Է��Դϴ�. \n���� ������ �Է��ϼ���.";
			
		}
		
		JOptionPane.showMessageDialog(null, str);
		
		
	}

	public String showG(int no) throws NumberFormatException {
		if(no >= 0 && no < 10) {
		return no + "�� ";
		} else if (no>=10) {
			return no/10 * 10 + "�� �Դϴ�";
		} else {
			throw new NumberFormatException(no+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

}
