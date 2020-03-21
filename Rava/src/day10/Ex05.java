package day10;
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
