package day10;


import java.util.Arrays;

/*
 ���� 5]
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	
	��ȭ]
		�����ϰ� �ο����� ����� 
		�� �ο��� ��ŭ ������ �����ϰ� ����
		�Լ��� �����ϰ� �ϼ���.
 */


class ClsDay10{
	//�� Ŭ������ �� ���� �л����� �����ϰ� �߻������ش�.
	// ���� �� �л����� ������ �����ϰ� �߻������ش�.
	// �� �� ���� �л����� 10 ~ 25�� �����Ѵ�.
	// �� �� �л��� ���� ������ 3 ~ 5 �������� �����Ѵ�.
	int[][] member; 

	public ClsDay10() {
		int memberNo = (int)(Math.random() * 16) + 10;	
		member = new int[memberNo][];		
	}
	
	public void setSubject() {
		for(int i=0; i<member.length; i++) {
			int subjectNo = (int)(Math.random() * 3) + 3;	
			member[i] = new int[subjectNo]; 
		}
	}
	
	public void setScore() {
		for(int i=0; i<member.length; i++) {
			for(int j=0; j<member[i].length; j++) {
				int score = (int)(Math.random() * 61) + 40;
				member[i][j] = score;
			}
		}
	}
	
	public int[][] getMember() {
		return member;
	}
	
	public int[] getMember(int i) {  // �Ű����� i�� �л��� �ε��� ��ȣ�̴�.
		return member[i];
	}
}

class ClsDay10_re {
	// �� Ŭ������ ScoreSum Ŭ���� �����ڿ� �������� �Ű������� �����غ����� �����Ͽ���.
	// ������ ClsDay10�� ������ ��������� �л��� ���� ������ 4�������� �����Ѵ�.
	int[][] member;
	
	public ClsDay10_re() {
		int memberNo = (int)(Math.random() * 16) + 10;	
		member = new int[memberNo][4];
	}
	
	public void setScore() {
		for(int i=0; i<member.length; i++) {
			for(int j=0; j<member[i].length; j++) {
				int score = (int)(Math.random() * 61) + 40;
				member[i][j] = score;
			}
		}
	}
	
	public int[][] getMember() {
		return member;
	}
	
	public int[] getMember(int i) {  // �Ű����� i�� �л��� �ε��� ��ȣ�̴�.
		return member[i];
	}
}

class ScoreSum {
	//�� Ŭ������ ������ �Է��ϸ� ������ ����� �����ش�.
	
	double sum;
	double avg;
	
	public ScoreSum() {}
	// �����ε��� �Ű����� (int...score) �Ұ���  �����Ϸ��� �������ڿ� 1���� �迭�� ���� Ÿ������ ����
	public ScoreSum(double...score) {	
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}
	
	public ScoreSum(int[] score) {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}
	public void show_sum_avg() {
		System.out.printf("����: %.0f \n���: %.2f \n", sum, avg);
	}
}

public class Ex05 {
	
	
	public static void main(String[] args) {
		// ClsDay10 Ŭ������ ���� ScoreSum �����ڿ� �Ű����� �迭�� �ѱ��
		ClsDay10 cls1 = new ClsDay10();
		
		
		cls1.setSubject();
		cls1.setScore();
		int[] cls1Arr = cls1.getMember(0);
		ScoreSum cls1Avg = new ScoreSum(cls1Arr);
		cls1Avg.show_sum_avg();
		System.out.println(Arrays.toString(cls1Arr));
		
		System.out.println("----------------------------------------");
		// ClsDay10_re Ŭ������ ���� ScoreSum �����ڿ� �Ű����� �������ڷ� �ѱ��
		ClsDay10_re cls2 = new ClsDay10_re();
		cls2.setScore();
		int[] cls2Arr = cls2.getMember(0);
		int no1 = cls2Arr[0];
		int no2 = cls2Arr[1];
		int no3 = cls2Arr[2];
		int no4 = cls2Arr[3];
		
		ScoreSum cls2Avg = new ScoreSum(no1, no2, no3, no4);
		cls2Avg.show_sum_avg();
		System.out.println(Arrays.toString(cls2Arr));
		 
	}

}

