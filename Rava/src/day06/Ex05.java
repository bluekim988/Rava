package day06;
/*
 ����5]
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� �����͸� ����ϼ���.
	
 */
public class Ex05 {

	public static void main(String[] args) {
		long[] sum = new long[10];
		
		long one = 2;
		long two = 1;
		long result = 2;
		for(int i=0; i<10; i++) {
			sum[i] = result;
			result = one + two;
			two = one;
			one = result;
		}
		for(long j : sum) {
			System.out.printf("%4d", j);
		}

	}

}
