package day06;
/*
 ����6]
	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ���
	������ ����ϼ���.
 */

public class Ex06 {

	public static void main(String[] args) {
		int[] fac = new int[10];
		
		int result = 1;
		/*
		for(int i=1; i<11; i++) {
			result = result * i;
			fac[i-1] = result;
		}
		for(int j : fac) {
			System.out.printf("%8d", j);
		}
		*/
		for(int i=0; i<10; i++) {
			for(int j=1; j<=1+i; j++) {
				result = result * j;
			}
			fac[i] = result;
			result = 1;
			System.out.print(fac[i] + " ");
		}
		

	}

}
