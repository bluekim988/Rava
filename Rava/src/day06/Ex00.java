package day06;

import java.util.Arrays;

/*
 	팩토리얼 구하기
	//5! = 4! x 3! x 2! x 1!
 */
public class Ex00 {

	public static void main(String[] args) {
		
		int num = 7;
		long result = 1;
		for(long i=1; i<num; i++ ) {
			result = result * i;
			System.out.println(result);
			
		}
		
		int[] arr = {10,20,55};

		System.out.println(Arrays.toString(arr));
		
		
	}

}
//	5 x 4 x 3 x 2 x 1 