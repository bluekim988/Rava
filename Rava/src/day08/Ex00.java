package day08;

import java.util.Arrays;

/*
 ���� 0]
	�������� ����ϴµ�
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���.
	
	int[][]	gugudan = {dan, gop};
 */

public class Ex00 {

	public static void main(String[] args) {
		int[] dan = new int[8];
		int[] gop = new int[9];
		
		for(int i=0; i<dan.length; i++ ) {
			dan[i] = i+2;
		}
		for(int i=0; i<gop.length; i++ ) {
			gop[i] = i+1;
		}
		int[][] gugudan = new int[2][];
		
		gugudan[0] = dan;
		gugudan[1] = gop;
		
		
		
		for(int i=0; i<gugudan[0].length; i++) {
			for(int j=0; j<gugudan[1].length; j++) {
				System.out.println(gugudan[0][i] + " x " + gugudan[1][j] + " = " + gugudan[0][i]*gugudan[1][j]);
				
			}
			System.out.println("===================================");
		}
		
	}

}
