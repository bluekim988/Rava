package day10;
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
		member = new int[memberno];		
	}
	
	public void setSubject() {
		for(int i=0; i<member.length; i++) {
			int subjectNo = (int)(Math.random() * 3) + 3;	
			member[i][subjectNo];
		}
	}
	
	public void setScore() {
//		for(int i=0; i<meber)
	}
}

class ScoreSum {
	int sum;
	double avg;
	
	Public ScoreSum(int...score) {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
	}
}
public class Ex05 {
	
	double clsAvg;
	
	public void randomScore(ClsDay10...cls) {
		
		for(int i=0; i<cls.length; i++) {
			cls[i]
		}
	}
	
	
	public static void main(String[] args) {
		

	}

}
