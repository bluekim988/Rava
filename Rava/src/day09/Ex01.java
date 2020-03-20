package day09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		char[][] ch = new char[3][10];
		
		char no = '0';
		char al = 'A';
		for(int i=0; i<ch[0].length; i++) {
			ch[0][i] = no++;
			ch[1][i] = al++;
		}
		char[] ko = {'��', '��', '��', '��', '��', '��', '��', '��', '��', '��'};
		ch[2] = ko;
		
		// ch1 �迭
		char[][] ch1 = new char[2][10];
		for(int i = 0; i<ch1[0].length; i++) {
			ch1[0][i] = ch[0][i];
			ch1[1][i] = ch[1][i];
		}
		
		// ch2 �迭
		char[][] ch2 = new char[2][10];
		for(int i = 0; i<ch2[0].length; i++) {
			ch2[0][i] = ch[0][i];
			ch2[1][i] = ch[2][i];
		}
		
		// ch3 �迭
		char[][] ch3 = new char[10][3];
		for(int i=0; i<ch3.length; i++)	{
			for(int j=0; j<ch3[i].length; j++) {
				ch3[i][j] = ch[j][i];
			}
		}
		
		// ch4 �迭
		char[][] ch4 = new char[10][2];
		for(int i=0; i<ch4.length; i++)	{
			for(int j=0; j<ch4[i].length; j++) {
				ch4[i][j] = ch[j][i];
			}
		}
		
		// ch5 �迭
		int cnt = 0;
		char[][] ch5 = new char[10][2];
		for(int i=0; i<ch5.length; i++)	{
			for(int j=0; j<ch5[i].length; j++) {
				ch5[i][j] = ch[cnt][i];
				cnt = 2;;
			}
			cnt = 0;
		}
		
		char[][][] sumCh = new char[6][][];
		sumCh[0] = ch;
		sumCh[1] = ch1;
		sumCh[2] = ch2;
		sumCh[3] = ch3;
		sumCh[4] = ch4;
		sumCh[5] = ch5;
		
		System.out.println("ch �迭 ==> "+Arrays.deepToString(ch) + "\n");
		System.out.println("ch1 �迭 ==> "+Arrays.deepToString(ch1)+ "\n");
		System.out.println("ch2 �迭 ==> "+Arrays.deepToString(ch2)+ "\n");
		System.out.println("ch3 �迭 ==> "+Arrays.deepToString(ch3)+ "\n");
		System.out.println("ch4 �迭 ==> "+Arrays.deepToString(ch4)+ "\n");
		System.out.println("ch5 �迭 ==> "+Arrays.deepToString(ch5)+ "\n");
		System.out.println("================================================");
		System.out.println("sumCh �迭 ==> "+Arrays.deepToString(sumCh)+ "\n");
	}

}
