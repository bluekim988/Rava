package day02;
/*
 	���� 5]
 		������ ���ڸ� 10 ~ 99 ������ ���ڸ� �߻���Ų ��
 		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 		
 		��]
 			45 �� 50���� ���� 5�� ����.
 			
 			53�� 50 ���� ���� 3�� ����.	
 			
 			int no2 = 13
 			int no1 = 13 / 10 * 10 = 10
 			int num = 13 % 10 = 3
 			num < 5 ? (no1) : (no1 + 10) 
 */
public class Ex05 {

	public Ex05() {
		int num = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		interval(num);
	}
	
	public void interval(int no) {
		int num1 = no / 10 * 10;
		int num2 = no % 10;
		int num3 = (num2 >= 5) ? (10 + num1) : (num1);
		int result = (num2 >= 5) ? (num3 - no) : (no - num3);
		System.out.println(no + " ��  " + num3 + " �� ���̴� : " + result );
	}
	public static void main(String[] args) {
		new Ex05();

	}

}
