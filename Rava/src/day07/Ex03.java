package day07;
/*
 ����3]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����  - ���ڿ� �迭 3��
	�����͸� �Է��� ����
	
	�̸��� �Է��ϸ� �� ����� �����͸� ��� ������ �迭�� ���� �����͸� ���
	����ϼ���.
	
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"������", "�����", "ȸ���"};
		String[] num = {"010-1111-1111", "010-2222-2222", "010-3333-3333"};
		String[] mail = {"aaa@increpas.com", "bbb@increpas.com", "ccc@increpas.com"};
		
		String[] sum = new String[1];
		String na = JOptionPane.showInputDialog("�̸� : ");
		
		int no = -1;
		
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(na)) {
				no = i;
			}
		}
		String st = "�ش� ������ �����ϴ�.";
		if(no>-1) {
			sum[0] = name[no] + "\n" +num[no] +"\n" +mail[no];
			st = Arrays.toString(sum);
			JOptionPane.showMessageDialog(null, st);
		} else {
			JOptionPane.showMessageDialog(null, st);
		}
			
	}

}
