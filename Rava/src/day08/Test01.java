package day08;

import java.util.Arrays;

/*
 	2차원 배열을 만들고
 	아래의 형태로 입력한다.
 	
 	[ [1,1,1,1,1], [2,2,2,2,2], [3,3,3,3,3] ]
 */
public class Test01 {

	public static void main(String[] args) {
		// 배열을 만든다.
		int[][] num = new int[3][5];
		
		// 1차원 배열을 초기화한다.
		// 먼저 2차 배열에 들어있는 배열을 순차적으로 꺼낸다.
		for(int i=0; i<num.length; i++) {
			// 2차 배열의 각 방에 들어있는 배열을 다시 꺼낸다.
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = i+1;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}

}
