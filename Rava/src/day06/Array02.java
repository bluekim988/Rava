package day06;

import java.util.Arrays;

/*
 	배열 생성과 반복문
 	
 		1 ~ 10까지 수로 된 배열을 만드세요.
 */
public class Array02 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		int i = 0;
		while(i < 10) {
			arr[i] = i++ +1;
			
		}
		for(int no : arr) {
			System.out.printf("%3d", no);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
