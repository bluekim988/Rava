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
