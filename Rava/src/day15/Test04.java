package day15;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args ) {
		int[] arr = {10, 5, 7, 15, 8};
		
		System.out.println("orignal");
		System.out.println(Arrays.toString(arr));
		
		// �迭 arr�� �����ϼ���.
		
		System.out.println("sort");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("fill");
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
	}

}
