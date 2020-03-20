package day08;

import java.util.Arrays;

/*
 ���� 2]
	����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�.
	�л��� ���� 5���̰� 
	2���� �迭�� ����
	5���� ������ ������ �迭�� ���弼��.
	
 ���� 3]
	2������ 
	������ ������ ����� �߰��ؼ� �����Ϸ��� �Ѵ�.
	2�� ������ �迭�� ���̸� �������Ѽ� ó���ϼ���.
	
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] cls = new int[5][6];
		int[] score1 = new int[6];
		int[] score2 = new int[6];
		int[] score3 = new int[6];
		int[] score4 = new int[6];
		int[] score5 = new int[6];
		
		//�̸� ����
		score1[0] = 1;
		score2[0] = 2;
		score3[0] = 3;
		score4[0] = 4;
		score5[0] = 5;
		
		
		//���� ����
		for(int i=0; i< 5; i++) {
			int no = (int)(Math.random()*(100 - 10 + 1)) +10;
			score1[i+1] = no;
			int no1 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score2[i+1] = no1;
			int no2 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score3[i+1] = no2;
			int no3 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score4[i+1] = no3;
			int no4 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score5[i+1] = no4;
		}

		//�츮�� �л����� ���� �迭
		cls[0] = score1;
		cls[1] = score2;
		cls[2] = score3;
		cls[3] = score4;
		cls[4] = score5;

		// ������ ������ŭ �ε��� ������ �迭 ����� cls�迭�� ������ ����, ���� ���� �����ϱ�
		double[][] newCls = new double[cls.length][cls[0].length+2];
		double sum = 0;
		for(int i=0; i<cls.length; i++) {
			for(int j=0; j<cls.length; j++) {
				sum += cls[i][j];
			}
			for(int y=0; y<cls[0].length; y++) {
				newCls[i][y] = cls[i][y];
			}
			newCls[i][cls.length+1] = sum;
			newCls[i][cls.length+2] = sum/5;
			sum = 0;
		}
		
		
		//����ϱ�
		System.out.printf("%s %7s %8s %8s %9s %9s %9s %11s", "�л�", "��", "��", "��", "��", "��", "��", "���");
		System.out.println();
		System.out.println("==============================================");
	
		
		for(double[] i : newCls) {
			for(double j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
	}

}
