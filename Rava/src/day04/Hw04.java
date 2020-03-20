package day04;

/*
 	두 사람이 등산을 하는데
 	한 사람은 이제 등산을 0.54m/s 시작했고
 	한사람은 정상에서 1.07m/s 내려오기 시작했다.
 	
 	산의 높이가 7564m라고 가정하고
 	두 사람이 만나는 시간은 몇분 몇초 후인지와 높이를 출력해주는 프로그램을 작성하세요.
 	
 	속도 = 시간/거리
 	
 	0.54 x 시간  + 1.07 x 시간 = 7564
 */
public class Hw04 {

	public Hw04() {
		double sNum = sec();
		System.out.println(sNum);
		System.out.println(0.54*sNum + "m");
		double min = (sNum/60);
		sNum = sNum - (int)min*60;
		System.out.println((int)min + "분" + (int)sNum +"초" );
		
	}
	public double sec() {
		double xNum = 0.54;
		double yNum = 1.07;
		double sum = 0;
		
		for(double i=1;true;i++) {
			sum = xNum*i + yNum*i;
			if(sum >= 7564) {
				return i;
			}
		}
	}
	

	public static void main(String[] args) {
		new Hw04();

	}

}
