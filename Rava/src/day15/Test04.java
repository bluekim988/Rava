package day15;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args ) {
		int[] arr = {10, 5, 7, 15, 8};
		
		System.out.println("orignal");
		System.out.println(Arrays.toString(arr));
		
		// 배열 arr을 정렬하세요.
		
		System.out.println("sort");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("fill");
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
	}

}
