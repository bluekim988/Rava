package day10;
/*
 문제 3]
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고
	총점, 평균을 계산해서 입력할 클래스를 제작하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 만들어서 처리하세요.
	그리고 5명의 학생을 배열로 만들어서 과목 점수, 이름을 입력해서 
	출력하세요. 
 */

public class Cls2 {
	String name;
	int kor;
	int eng;
	int math;
	int mul;
	int co;
	
	int sum;
	double avg;
	
	public Cls2(String name) {
		this.name = name;
		
		kor = (int)(Math.random() * (100-40+1))+40;
		eng = (int)(Math.random() * (100-40+1))+40;
		math = (int)(Math.random() * (100-40+1))+40;
		mul = (int)(Math.random() * (100-40+1))+40;
		co = (int)(Math.random() * (100-40+1))+40;
	}
	
	public void setVal() {
		sum = kor + eng + math + mul + co;
		avg = sum / 5;
	}
	
	public void showVal() {
		System.out.println("이름 : " + name);
		System.out.printf("국어: %3d   영어: %3d   수학: %3d   물리: %3d   코딩: %3d \n총점: %3d   평균: %.2f",
							kor, eng, math, mul, co, sum, avg);
		System.out.println();
		System.out.println("=====================================================");
	}
}
