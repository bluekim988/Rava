package day08;

import java.util.Arrays;

/*
 문제 2]
	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다.
	학생의 수는 5명이고 
	2차원 배열로 만들어서
	5명의 점수를 저장할 배열을 만드세요.
	
 문제 3]
	2번에서 
	점수에 총점과 평균을 추가해서 관리하려고 한다.
	2번 문제의 배열의 길이를 증가시켜서 처리하세요.
	
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] cls = new int[5][6];
		int[] score1 = new int[6];
		int[] score2 = new int[6];
		int[] score3 = new int[6];
		int[] score4 = new int[6];
		int[] score5 = new int[6];
		
		//이름 저장
		score1[0] = 1;
		score2[0] = 2;
		score3[0] = 3;
		score4[0] = 4;
		score5[0] = 5;
		
		
		//점수 저장
		for(int i=0; i< 5; i++) {
			int no = (int)(Math.random()*(100 - 10 + 1)) +10;
			score1[i+1] = no;
			int no1 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score2[i+1] = no1;
			int no2 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score3[i+1] = no2;
			int no3 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score4[i+1] = no3;
			int no4 = (int)(Math.random()*(100 - 10 + 1)) +10;
			score5[i+1] = no4;
		}

		//우리반 학생점수 관리 배열
		cls[0] = score1;
		cls[1] = score2;
		cls[2] = score3;
		cls[3] = score4;
		cls[4] = score5;

		// 총점과 평점만큼 인덱스 증가한 배열 만들어 cls배열의 정보와 총점, 평점 정보 저장하기
		double[][] newCls = new double[cls.length][cls[0].length+2];
		double sum = 0;
		for(int i=0; i<cls.length; i++) {
			for(int j=0; j<cls.length; j++) {
				sum += cls[i][j];
			}
			for(int y=0; y<cls[0].length; y++) {
				newCls[i][y] = cls[i][y];
			}
			newCls[i][cls.length+1] = sum;
			newCls[i][cls.length+2] = sum/5;
			sum = 0;
		}
		
		
		//출력하기
		System.out.printf("%s %7s %8s %8s %9s %9s %9s %11s", "학생", "국", "수", "영", "물", "역", "합", "평균");
		System.out.println();
		System.out.println("==============================================");
	
		
		for(double[] i : newCls) {
			for(double j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
	}

}
