package day07;
/*
 ����4]
	��ȭ��ȣ�� �Է��ϸ�
	'-'�� �������� �����͸� �и��ؼ� ������ �迭�� �����
	�и��� �����͸� ������ �°� �Է��ѵ� ����ϼ���.
	
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		String[] arr = new String[3];

		String number = JOptionPane.showInputDialog("��ȭ��ȣ �Է� : ");
		
		String num = new String(number);
		
		
		for(int i=0; i<arr.length; i++) {
			int no = num.indexOf('-');
			if(no != -1) {
			arr[i] = num.substring(0, no);
			num = num.substring(no+1,num.length());
			} else {
				arr[i] = num.substring(0, num.length());
			}
		}
		String str = Arrays.toString(arr);
		JOptionPane.showMessageDialog(null, str);
	}

}
