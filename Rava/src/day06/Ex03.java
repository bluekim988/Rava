package day06;
/*
 문제3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	
	79456원을 준비된 화폐단위로 계산할 때 각각의 화폐단위가 몇개씩 필요한지
	갯수를 저장할 배열을 만들고,
	출력하는 프로그램을 작성하세요.
	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] sum = new int[8];
		String[] str = {"만   ", "오천", "천   ", "오백", "백   ", "오십", "십   ", "일   "};
		
		int no = 79456;
		
		for(int i=0; i<coin.length; i++) {
			sum[i] = (no/coin[i]);
			no = no % coin[i];
			
		}
		for(int j=0; j<sum.length; j++) {
			System.out.printf("%s",str[j]);
			System.out.printf("%4d",sum[j]);
			System.out.println();
		}
	}
}
