package day12.arr;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		
		int no = 0;
		int no1 = 100;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if((i+1) % 2 == 0) {
					no1 += 1;
					arr1[i][j] = no1;
				} else {
					no += 1;
					arr1[i][j] = no;
				}
				
			}
		}
		
		for(int[] i : arr1) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				arr2[j][i] = arr1[i][j];
			}
		}
		for(int[] i : arr2) {
			System.out.println(Arrays.toString(i));
		}
	}

}
