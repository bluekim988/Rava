package exam;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
 	JOptionPane ���� ���ڸ� �Է¹޾Ƽ�
 	�迭�� �����
 	�迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ�
 	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
 	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���.
 */

public class Ex01 {
	ArrayList<Integer> sum = new ArrayList<Integer>();

	public Ex01() {

		for (int i = 0; i < 5; i++) {
			try {
				String strNum = JOptionPane.showInputDialog((i + 1) + " ���� ��ȣ �Է�");
				sum.add(addNum(strNum));

			} catch (NumberFormatException e) {
				e.printStackTrace();
				i--;
			}
		}
		summer(sum);
	}

	public int addNum(String str) throws NumberFormatException {
		int num = Integer.parseInt(str);
		return num;

	}

	public void summer(List<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i).intValue();
		}

		System.out.println("�� �� : " + sum);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
