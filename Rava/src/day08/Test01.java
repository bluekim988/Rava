package day08;

import java.util.Arrays;

/*
 	2���� �迭�� �����
 	�Ʒ��� ���·� �Է��Ѵ�.
 	
 	[ [1,1,1,1,1], [2,2,2,2,2], [3,3,3,3,3] ]
 */
public class Test01 {

	public static void main(String[] args) {
		// �迭�� �����.
		int[][] num = new int[3][5];
		
		// 1���� �迭�� �ʱ�ȭ�Ѵ�.
		// ���� 2�� �迭�� ����ִ� �迭�� ���������� ������.
		for(int i=0; i<num.length; i++) {
			// 2�� �迭�� �� �濡 ����ִ� �迭�� �ٽ� ������.
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = i+1;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}

}
