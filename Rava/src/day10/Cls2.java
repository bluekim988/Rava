package day10;
/*
 ���� 3]
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �����ϰ�
	����, ����� ����ؼ� �Է��� Ŭ������ �����ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ���� ó���ϼ���.
	�׸��� 5���� �л��� �迭�� ���� ���� ����, �̸��� �Է��ؼ� 
	����ϼ���. 
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
		System.out.println("�̸� : " + name);
		System.out.printf("����: %3d   ����: %3d   ����: %3d   ����: %3d   �ڵ�: %3d \n����: %3d   ���: %.2f",
							kor, eng, math, mul, co, sum, avg);
		System.out.println();
		System.out.println("=====================================================");
	}
}
