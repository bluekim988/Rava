package day04;
/*
 	2 ~ 100 까지의 수중 소수만 출력해주는 프로그램을 작성하세요.
 	
 	comm ]
 		위 문제의 결과로 찾아낸 소수의 카운트를 가장 마지막에 출력하세요.
 */

public class Hw03 {
	

	public static void main(String[] args) {
		
		int count = 0;
		int o = 0;
		oot :
		for(int i=2; i<=100; i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					continue oot;
				}
			}
			String str = ", ";
			if(i==2) {
				str="";
			}
			System.out.print(str+ i);
			
			count +=1;
		}
		System.out.println();
		System.out.println("100이하 소수 카운트 : " + count);
	}

}
