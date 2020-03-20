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
	String name;
	int[] score;
	
	
	public ClsDay10() {} 

	public ClsDay10(String name, int...num) {
		this.name = name;
		score = new int[num.length];
		
		for(int i=0; i<num.length; i++) {
			
			score[i] = num[i];
		
		}
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
