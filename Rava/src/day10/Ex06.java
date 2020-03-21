package day10;

/*
숙제 1]
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 점수를 관리하는 클래스를 제작하고
	학생의 데이터를 준비된 만큼만 입력해서
	전체 총점, 전체 평균을 구하는 프로그램을 작성하세요.
*/
class MySubjectScore {
	//이 클래스는 학생의 점수를 관라하기위해 제작된 클래스이다.
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
	
	public int getScore(int i) {	//i는 과목의 인덱스 번호
		return allScore[i];
	}
	
	public void showMyAvg(int...score) {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
		int no = score.length;
		
		System.out.printf("[ 이름: %4s  || 과목수: %2d ] \n총점: %3d \n평균: %.2f \n",name, no, sum, avg);
	}
	
	public void showMyAllScore() {
		System.out.printf("이름: %4s \nkor: %3d eng: %3d math: %3d phys: %3d cor: %3d",name, eng, math, phys, cor);
	}
	
	public int randomScore() {
		int score = (int)(Math.random() * 41) + 60;
		return score;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		MySubjectScore st1 = new MySubjectScore("김종형");
		st1.showMyAvg(st1.kor, st1.eng, st1.math);
		
		MySubjectScore st2 = new MySubjectScore("반장님");
		st2.showMyAvg(st2.cor, st2.eng);

	}

}
