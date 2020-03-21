package day10;

/*
���� 1]
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ �����ϴ� Ŭ������ �����ϰ�
	�л��� �����͸� �غ�� ��ŭ�� �Է��ؼ�
	��ü ����, ��ü ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
*/
class MySubjectScore {
	//�� Ŭ������ �л��� ������ �����ϱ����� ���۵� Ŭ�����̴�.
	int[] allScore = new int[5];
	
	String name;
	int kor;
	int eng;
	int math;
	int phys;
	int cor;
	int sum;
	double avg;
	
	
	public MySubjectScore(String name) {
		this.name = name;
		kor = randomScore();
		eng = randomScore();
		math = randomScore();
		phys = randomScore();
		cor = randomScore();
		
		allScore[0] = kor;
		allScore[1] = eng;
		allScore[2] = math;
		allScore[3] = phys;
		allScore[4] = cor;
	}
	
	public int[] getAllScore() {
		return allScore;
	}
	
	public int getScore(int i) {	//i�� ������ �ε��� ��ȣ
		return allScore[i];
	}
	
	public void showMyAvg(int...score) {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
		int no = score.length;
		
		System.out.printf("[ �̸�: %4s  || �����: %2d ] \n����: %3d \n���: %.2f \n",name, no, sum, avg);
	}
	
	public void showMyAllScore() {
		System.out.printf("�̸�: %4s \nkor: %3d eng: %3d math: %3d phys: %3d cor: %3d",name, eng, math, phys, cor);
	}
	
	public int randomScore() {
		int score = (int)(Math.random() * 41) + 60;
		return score;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		MySubjectScore st1 = new MySubjectScore("������");
		st1.showMyAvg(st1.kor, st1.eng, st1.math);
		
		MySubjectScore st2 = new MySubjectScore("�����");
		st2.showMyAvg(st2.cor, st2.eng);

	}

}
