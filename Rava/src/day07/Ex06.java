package day07;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {

		int[][]	num = new int[3][];
	/*
		1. �� �ڵ尡 ���������� �����غ��δ�.
		2. ������ �����Ͻ� NullPointerException�� �߻��Ѵ�.
		3. �迭�� ������ ���ÿ� ���̸� �����ؾ߸��Ѵ�.
		4. ������ų�� ���� ���̸� �ٲٱ� ���ؼ���
		      ���ϴ� ���̷� ���ο� �迭�� �����ϰ� �迭�� ������ �����Ѵ�.
		 
	 */

		int no = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<=i; j++) { //[j]�� ���̸� ������ �Է°� ���ÿ� �����ǵ��� �����غ���
				num[i][j] = no++;	// [i][j] => j�� ���̰� ���������ʾ� NPE �߻�!
			}
		}
		for(int[] i : num) {
			System.out.println(Arrays.toString(i));
		}
	}

}
