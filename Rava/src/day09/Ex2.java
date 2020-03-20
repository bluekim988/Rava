package day09;

import java.util.Arrays;

/*
 문제 2]
	1차 배열에 10개의 데이터를 입력한 후
	총점과 평균을 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수로 처리하세요.
 */
public class Ex2 {
	int[] jum = new int[10];
	int sum = 0;
	double pu = 0;
	
	public Ex2() {
		jum = inputData(jum);
		sum = getSum(jum);
		pu = getPyung(sum);
		showAll();
	}
	public int[] inputData(int[] ar) {
		int[] br = new int[10];
		for(int i=0; i<br.length; i++) {
			br[i] = (int)(Math.random() *(100-40+1))+40; 
		}
		return br;
	}
	public int getSum(int[] ar) {
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i]; 
		}
		return sum;
	}
	public double getPyung(int a) {
		double sum = a / 10;
		return sum;
	}
	public void showAll() {
		System.out.println(Arrays.toString(jum));
		System.out.printf("총점 : %3d   평균 : %.2f", sum, pu);
	}

	public static void main(String[] args) {
		new Ex2();

	}

}
