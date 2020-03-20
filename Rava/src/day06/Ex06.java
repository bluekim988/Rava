package day06;
/*
 문제6]
	팩토리얼 10개를 저장할 배열을 만들고
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고
	꺼내서 출력하세요.
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
