package day06;

/*
 문제4]
	반지름 5개를 기억할 배열을 만들고
	
	각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고
	각 원의 둘레를 계산해서 저장할 배열도 만들어서 
	
	결과를 출력하는 프로그램을 작성하세요.
	
	단, 출력 형태는
	
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
			
		의 형태로 출력되게 하세요.
 */

public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		double[] area = new double[5];
		double[] around = new double[5];
		
	
		for(int i=0; i<ban.length; i++) {
			ban[i] = (int)(Math.random()*(30-2+1)+2);
			area[i] = ban[i] * 2 * Math.PI;
			around[i] = ban[i] * ban[i] * Math.PI;
		}
		for(int j=0; j<ban.length; j++) {
			System.out.printf("반지름 : %d , 원의 둘레 : %.2f , 원의 넓이 : %.2f",ban[j], +area[j] ,around[j]);
			System.out.println();
		}
	}

}
