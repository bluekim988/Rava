package day10;


import java.util.Arrays;

/*
 문제 5]
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	
	심화]
		랜덤하게 인원수를 만들고 
		그 인원수 만큼 점수를 랜덤하게 만들어서
		함수를 실행하게 하세요.
 */


class ClsDay10{
	//이 클래스는 한 반의 학생수를 랜덤하게 발생시켜준다.
	// 또한 각 학생들의 점수도 랜덤하게 발생시켜준다.
	// 단 한 반의 학생수는 10 ~ 25로 한정한다.
	// 단 한 학생의 수강 과목은 3 ~ 5 과목으로 한정한다.
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
	
	public int[] getMember(int i) {  // 매개변수 i는 학생의 인덱스 번호이다.
		return member[i];
	}
}

class ClsDay10_re {
	// 이 클래스는 ScoreSum 클래스 생성자에 가변인자 매개변수를 실험해보고자 제작하였다.
	// 때문에 ClsDay10과 동일한 기능이지만 학생의 수강 과목을 4과목으로 통일한다.
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
	
	public int[] getMember(int i) {  // 매개변수 i는 학생의 인덱스 번호이다.
		return member[i];
	}
}

class ScoreSum {
	//이 클래스는 점수를 입력하면 총점과 평균을 구해준다.
	
	double sum;
	double avg;
	
	public ScoreSum() {}
	// 오버로딩시 매개변수 (int...score) 불가능  컴파일러는 가변인자와 1차원 배열을 같은 타입으로 본다
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
		System.out.printf("총점: %.0f \n평균: %.2f \n", sum, avg);
	}
}

public class Ex05 {
	
	
	public static void main(String[] args) {
		// ClsDay10 클래스를 통해 ScoreSum 생성자에 매개변수 배열로 넘기기
		ClsDay10 cls1 = new ClsDay10();
		
		
		cls1.setSubject();
		cls1.setScore();
		int[] cls1Arr = cls1.getMember(0);
		ScoreSum cls1Avg = new ScoreSum(cls1Arr);
		cls1Avg.show_sum_avg();
		System.out.println(Arrays.toString(cls1Arr));
		
		System.out.println("----------------------------------------");
		// ClsDay10_re 클래스를 통해 ScoreSum 생성자에 매개변수 가변인자로 넘기기
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

