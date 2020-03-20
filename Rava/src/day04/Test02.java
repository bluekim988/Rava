package day04;
/*
 	반복문
 		특정 명령을 반복하도록 하는 명령
 		
 		종류]
 			1. for 명령
 				: 명령문 형식 자체에 카운터변수(반복할 횟수를 지정하는 변수)가 만들어진다. 
 			2. while 명령
 				: 형식에 카운터변수 정의하는 부분이 없다.
 					따라서 반복문이 실행되기전에 카운터 변수가 만들어져야한다.
 					또는 반복실행을 종료할 조건을 반드시 기술해주어야한다.
 					
 	1. for 명령
 	
 	2. while 명령
 	
 		참고]
 			중첩 for 명령
 				조건문과 마찬가지로 반복문도 중첩해서 사용할 수 있다.
 				
 				**
 				안쪽 for 명령은 바깥 for 명령이 다음 회차로 반복하면
 				처음부터 다시 시작한다.
 				
 				for(int i=0; i<10; i++) {
 					for(int j=0; j<5; j++) {
 						
 					}
 				}
 */
public class Test02 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum+i;
			System.out.print(sum + " ");
		}
		System.out.println("\n1부터 100까지의 합은 " + sum + " 입니다.");
		/*
		for(int i=1;i<10; i++) {
			System.out.println("9" +"x" + i + "=" + 9 * i);
		}
		*/

	}

}
