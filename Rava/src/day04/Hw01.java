package day04;

import java.util.Scanner;

/*
 	두 수를 입력받은 후
 	두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요.
 	
 */
public class Hw01 {
	Scanner sc = new Scanner(System.in);
	public Hw01() {
		System.out.print("첫번째 수 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int no2 = sc.nextInt();
		ot :
		for(int i=no1;;) {
			for(int j=no2;;) {
				if(i>j) {
					if(i%j-- == 0) {
						System.out.println(no1+" 와 "+no2+" 의 " + "최대공약수 : "+ ++j);
						break ot;
					}
				} else {
					if(j%i-- == 0) {
						System.out.println(no1+" 와 "+no2+" 의 " + "최대공약수 : "+ ++i);
						break ot;
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new Hw01();
	}

}
