package day10;

import java.util.Arrays;

/*
 문제 2]
	10개의 과목의 점수를 입력할 배열을 만들고
	그 배열에 담긴 정수의
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
 */

public class Ex02 {

	
	public static void main(String[] args) {
		int[] st1 = new int[10];
		
		Cls1 cls = new Cls1(st1);
		
		cls.setSum(st1);
		
		System.out.println(Arrays.toString(st1));
		cls.showVal();
		

	}

}
