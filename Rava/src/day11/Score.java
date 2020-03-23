package day11;
/*
 	���� 2]
 		�� Ŭ������ �л� �Ѹ���
 		�̸�, java, oracle, html, javascript, jsp, spring�� ������
 		����� Ŭ���� �̴�.
 		�� Ŭ������ ��ü�� �� �� �����͸� �Է¹޾Ƽ� �� ������ ����̵ǰ�
 		Ŭ������ �����ϼ���.
 		
 		��, �����Ͱ� �Է��� �� �� ���
 			�̸��� "�ڱ�ȣ"�� �ϰ�
 			������ �����ϰ� ���ǰ� �ϻ���.
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
		this("�ڱ�ȣ", randomScore(), randomScore(), randomScore(),randomScore(),randomScore(),randomScore());
	
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


