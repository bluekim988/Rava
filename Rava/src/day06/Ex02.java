package day06;
/*
 문제2]
	'A' ~ 'J' 문자를 랜덤하게 100개 발생시킨후 
	각 문자의 카운트를 구해서(숫자) 출력하세요.
	
	추가로 숫자만큼 별표(*)를 찍어서 출력하세요.
	
 */

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[100];	
		char[] sChar = new char[10];
		int[] sum = new int[10];
		
		char ch3 = 'A';
		for(int i=0; i<sChar.length; i++) {
			sChar[i] = ch3++;
		}
		char ch1 = 'A';
		char ch2 = 'J';
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *(ch2 - ch1 + 1)) + ch1;
		}
		
		for(int i=0; i<sChar.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(sChar[i] == arr[j]) {
					sum[i] += 1;
				}
			}
		}
		
		for(int i=0; i<sum.length-1; i++) {
			for(int j=i; j<sum.length; j++) {
				if(sum[i]<sum[j]) {
					int tmp = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp;
					
					char chTmp = sChar[i];
					sChar[i] = sChar[j];
					sChar[j] = chTmp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.printf("%2c", (char)i);
		}
		System.out.println();
		System.out.println("===================카운트====================");
		for(int i=0; i<sChar.length; i++) {
			System.out.printf("%3s", sChar[i]);
			System.out.printf("%3d", sum[i]);
			System.out.printf("%3s", " ==> ");
			for(int j=0; j<sum[i]; j++) {
				System.out.printf("%3s", "*");
			}
			System.out.println();
		}
	}
}
