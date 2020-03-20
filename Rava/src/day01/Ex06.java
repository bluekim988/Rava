package day01;
/*
 *  숙제]
 	1년은 365.2426일이다.
 	이 날짜는 과연 몇일 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
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
		
		
		System.out.println(day + " 일");
		System.out.println(hour + " 시간");
		System.out.println(min + " 분");
		System.out.println(sec + " 초");
		

		
		
		
		
		

	}

}
