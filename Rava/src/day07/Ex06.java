package day07;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {

		int[][]	num = new int[3][];
	/*
		1. 이 코드가 문법적으로 가능해보인다.
		2. 하지만 컴파일시 NullPointerException이 발생한다.
		3. 배열은 생성과 동시에 길이를 지정해야만한다.
		4. 가변시킬수 없어 길이를 바꾸기 위해서는
		      원하는 길이로 새로운 배열을 생성하고 배열의 내용을 복사한다.
		 
	 */

		int no = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<=i; j++) { //[j]의 길이를 데이터 입력과 동시에 가변되도록 설정해보자
				num[i][j] = no++;	// [i][j] => j의 길이가 지정되지않아 NPE 발생!
			}
		}
		for(int[] i : num) {
			System.out.println(Arrays.toString(i));
		}
	}

}
