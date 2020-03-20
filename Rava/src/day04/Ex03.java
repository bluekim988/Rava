package day04;

/*
 	문제 3]
 		2x + 4y = 10 의 방벙식의 결과를 출력하세요.
 		단, x, y 는 모두 0이상 10이하의 정수 
 */

public class Ex03 {

	public Ex03() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((2*i) + (4*j) == 10)
					System.out.println("2x + 4y = 10 일때 x와 y값 구하기\n"+"x : " + i + "\t y : " + j);
			}
		}
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
