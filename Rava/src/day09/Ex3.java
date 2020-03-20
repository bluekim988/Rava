package day09;


import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 ���� 3]
	5�л��� ����, ����, ����, ����, ���� ������ �Է¹޾�
	������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, �������, ����� �Լ��� ó���ϼ���.
	
	��, �迭�� [5][7] �� ���·� �����.
 */

public class Ex3 {
	int[][] cls = new int[5][7];
	
	public Ex3() {
		inputNum(cls);
		inputSum(cls);
		inputNo(cls);
		showCls();
//		System.out.println(Arrays.deepToString(cls));
		
	}
	//�� �л����� 5������ ���� �����ϰ� �Է�
	public void inputNum(int[][] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length-2; j++) {
				ar[i][j] = (int)(Math.random() *(100-40+1))+40;
			}
		}
		cls = ar;
	}
	//�� �л��� ���� ������ ���ϰ� �������� ���ϱ�
	public void inputSum(int[][] ar) {
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length-2; j++) {
				sum += ar[i][j];
			}
			cls[i][5] = sum;	//���� ���� ���
			cls[i][6] = 1;	 //���л����� �⺻��� 1�� �ʱ�ȭ
			sum = 0;
		}
	}
	//���� �������� ��� ���ϱ�
	public void inputNo(int[][] ar) {	
		int no = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				if(ar[i][5] < ar[j][5]) {	//������ ������ +1
					cls[i][6] += 1;
				}
			}
			
		}
	}
	//����Լ�
	public void showCls() {
		//�������� ����
		for(int i=0; i<cls.length; i++) {
			for(int j=i; j< cls.length; j++) {
				if(cls[i][5] < cls[j][5]) {
					int[] tmp = cls[i];
					cls[i] = cls[j];
					cls[j] = tmp;
				}
			}
		}
		//���
		StringBuffer str = new StringBuffer();
		str.append(" �� | �� | �� | �� | �� |  �� | �� |\n");
		str.append("===========================\n");
		for(int i=0; i<cls.length; i++) {
			for(int j=0; j<cls[i].length; j++) {
				str.append(cls[i][j] + " | ");
			}
			str.append("\n");
		}
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Ex3();

	}

}