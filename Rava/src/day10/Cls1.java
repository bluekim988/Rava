package day10;
/*
 문제 2]
	10개의 과목의 점수를 입력할 배열을 만들고
	그 배열에 담긴 정수의
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
 */
public class Cls1 {

	int sum;
	double avg;
	
	public Cls1(int[] a) {
		for(int i=0; i<a.length; i++) {
			int no = (int)(Math.random() * (100-40+1))+40;
			a[i] = no;
		}
	}
	
	public void setSum(int[] a) {
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		avg = sum/10;
	}
	public void showVal() {
		System.out.printf("총점 : %3d \n평균: %.2f \n",sum, avg);
	}
}
