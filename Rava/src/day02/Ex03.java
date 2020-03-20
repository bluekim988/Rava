package day02;
/*
 문제 3]
 		화씨(Fahrenheit) 온도 100도는 
 		섭씨(Celcius) 온도 몇도인지 알아보는 프로그램을 작성하세요.
 		
 		공식]
 			섭씨온도 = 5 / 9 X (화씨온도 - 32)
 			
 */
public class Ex03 {

	public Ex03() {
		double num = 100.;
		celcius(num);
	}
	
	public void celcius(double no) {
		double sum1 = 5. / 9. * (no - 32.);
		int result = (int)sum1;
		System.out.println("화씨 " + (int)no + " 도 는 섭씨 " + result + " 도 입니다.");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
