package day09;


import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 문제 3]
	5학생의 국어, 영어, 수학, 물리, 국사 점수를 입력받아
	총점과 석차를 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
	
	단, 배열은 [5][7] 의 형태로 만든다.
 */

public class Ex3 {
	int[][] cls = new int[5][7];
	
	public Ex3() {
		inputNum(cls);
		inputSum(cls);
		inputNo(cls);
		showCls();
//		System.out.println(Arrays.deepToString(cls));
		
	}
	//각 학생별로 5개과목 점수 랜덤하게 입력
	public void inputNum(int[][] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length-2; j++) {
				ar[i][j] = (int)(Math.random() *(100-40+1))+40;
			}
		}
		cls = ar;
	}
	//각 학생별 점수 꺼내와 더하고 합한점수 구하기
	public void inputSum(int[][] ar) {
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length-2; j++) {
				sum += ar[i][j];
			}
			cls[i][5] = sum;	//합한 점수 담기
			cls[i][6] = 1;	 //각학생들을 기본등수 1로 초기화
			sum = 0;
		}
	}
	//합을 기준으로 등수 정하기
	public void inputNo(int[][] ar) {	
		int no = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				if(ar[i][5] < ar[j][5]) {	//점수가 낮으면 +1
					cls[i][6] += 1;
				}
			}
			
		}
	}
	//출력함수
	public void showCls() {
		//석차별로 정렬
		for(int i=0; i<cls.length; i++) {
			for(int j=i; j< cls.length; j++) {
				if(cls[i][5] < cls[j][5]) {
					int[] tmp = cls[i];
					cls[i] = cls[j];
					cls[j] = tmp;
				}
			}
		}
		//출력
		StringBuffer str = new StringBuffer();
		str.append(" 국 | 영 | 수 | 물 | 국 |  합 | 등 |\n");
		str.append("===========================\n");
		for(int i=0; i<cls.length; i++) {
			for(int j=0; j<cls[i].length; j++) {
				str.append(cls[i][j] + " | ");
			}
			str.append("\n");
		}
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Ex3();

	}

}