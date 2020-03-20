package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;
/*
 * 	**코딩 순서**
 	1. 45 ~ 1이 담긴 배열을 만든다.
 	2. 배열의 인덱스를 랜덤하게 발생시켜 배열의 정보를 랜덤하게 추출할 것이다.
 		따라서 배열의 인덱스만큼의 정수를 랜덤하게 발생시킨다.
 	3. 추출된 랜덤한인덱스로 배열의 정보를 6번 반복하여 출력한다.
 */
public class Ex00 {

	public static void main(String[] args) {
		
		// 45 ~ 1 이 담긴 배열 만들기
		int[] num = new int[45];
		int no = 45;
		for(int i=0; i<num.length; i++) {
			num[i] = no--; 
		}
		
		int[] randomIndex = new int[6]; // 랜덤추출한 인덱스 담을 배열
		String str = "";	// 발생한 수 담아둘 문자열
		
		// 6번 반복할 반복문
		ot :
		for(int i=0; i<6; i++) {
			//인덱스 랜덤하게 발생시키고 인덱스 배열에 담기
			randomIndex[i] = (int)(Math.random()*num.length);
			//중복 번호 제거하기
			for(int j=0; j<i; j++) {
				if(randomIndex[i] == randomIndex[j]) {
					i--; 
					continue ot;
				}
			}
			
			//발생한 인덱스로 배열정보 하나씩 담기
			str += i+1 + "번째 : "+num[randomIndex[i]] + "\n";
		}
		// 추출해보기
		JOptionPane.showMessageDialog(null, str);

	}

}
