package day06;
/*
 문제5]
	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서
	배열에 저장된 데이터를 출력하세요.
	
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
