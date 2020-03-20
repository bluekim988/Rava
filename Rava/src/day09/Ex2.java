package day09;

import java.util.Arrays;

/*
 ���� 2]
	1�� �迭�� 10���� �����͸� �Է��� ��
	������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ó���ϼ���.
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
		System.out.printf("���� : %3d   ��� : %.2f", sum, pu);
	}

	public static void main(String[] args) {
		new Ex2();

	}

}
