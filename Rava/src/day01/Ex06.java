package day01;
/*
 *  ����]
 	1���� 365.2426���̴�.
 	�� ��¥�� ���� ���� ��ð�, ���, �������� ����ؼ� ����ϼ���.
 */

public class Ex06 {

	public static void main(String[] args) {
		
		double num = 365.2426 * 24 * 60 * 60;
		double tmp = 365 * 24 * 60 * 60;
		int day = 0;
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		day = (int)num / 60 / 60 / 24; 
		num -= tmp;
		hour = (int)num / 60 /60;
		num -= hour * 60 * 60;
		min = (int)num / 60;
		num -= min * 60;
		sec = (int)num;
		
		
		System.out.println(day + " ��");
		System.out.println(hour + " �ð�");
		System.out.println(min + " ��");
		System.out.println(sec + " ��");
		

		
		
		
		
		

	}

}
