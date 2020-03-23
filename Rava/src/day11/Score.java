package day11;
/*
 	문제 2]
 		이 클래스는 학생 한명의
 		이름, java, oracle, html, javascript, jsp, spring의 점수를
 		기억할 클래스 이다.
 		이 클래스가 객체가 될 때 데이터를 입력받아서 각 변수에 기억이되게
 		클래스를 정의하세요.
 		
 		단, 데이터가 입력이 안 될 경우
 			이름은 "박광호"로 하고
 			성적은 랜덤하게 기억되게 하새요.
 */

public class Score {
	String name;
	int java;
	int oracle;
	int html;
	int javascript;
	int jsp;
	int spring;
	double avg;
	
	
	public Score() {
		this("박광호", randomScore(), randomScore(), randomScore(),randomScore(),randomScore(),randomScore());
	
	}
	
	public Score(String name ) {
		this(name, randomScore(), randomScore(), randomScore(),randomScore(),randomScore(),randomScore());
	}
	
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		this.java = java;
		this.name = name;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
		
		setAvg();
	}
	
	public void setAvg() {
		avg = (java + oracle + html + javascript + jsp + spring) / 6.;
	}

	static int randomScore() {
		return (int)(Math.random() * 41) + 60;
	}
	
	public void showAllScore() {
		System.out.println(name);
		System.out.print("java : " + java + "\n" + "oracle : " + oracle + "\n" + "html : " + html + "\n" );
		System.out.print("javascript : " + javascript + "\n" + "jsp : " + jsp + "\n" + "spring : " + spring + "\n");
		System.out.printf("avg : %.2f",avg);
		System.out.println();
		System.out.println("--------------------------------");
		
	}
	
	
}


