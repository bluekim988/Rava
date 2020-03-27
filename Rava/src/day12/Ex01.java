package day12;

import java.util.Arrays;

/*
 	���� 1]
 		�л��� java, db, html, javascript, spring, sum, avg
 		������ ������ �迭�� �����
 		������ ����� ���ؼ� ����ϼ���.
 		
 		��, ���� ������ ��յ� ���� �迭���� �����ϼ���.
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
