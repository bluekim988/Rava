package day06;
/*
 	1 ���� 5���� ����� �迭�� ����� ������ ����ϼ���.
 */
import java.util.*;
public class Array01 {

	public static void main(String[] args) {
		
		int[] num;	
		num = new int[]{1,2,3,4,5};
		
		int[] num2 = {1,2,3,4,5};
		
		for(int i=0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(num));

	}

}
