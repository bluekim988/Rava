package day12;

import java.util.Arrays;

/*
 	문제 1]
 		학생의 java, db, html, javascript, spring, sum, avg
 		점수를 관리할 배열을 만들고
 		총점과 평균을 구해서 출력하세요.
 		
 		단, 과목별 총점과 평균도 같이 배열에서 관리하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		double[][] cls = new double[7][7];
		
		for(int i=0; i<cls.length-2; i++) {
			for(int j=0; j<cls[i].length-2; j++) {
				cls[i][j] = randomScore();
				cls[i][5] += cls[i][j];
				cls[5][j] += cls[i][j];
			}
			cls[i][6] = cls[i][5] / 5.;	
		}
		
		for(int i=0; i<cls.length-2; i++) {
			cls[6][i] = cls[5][i] / 5.;
		}
		
		for(double[] d : cls) {
			System.out.println(Arrays.toString(d));
		}
	}
	
	static int randomScore() {
		return (int)(Math.random() * 41) + 60;
	}

}
