package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	예제]
 		로또 한 게임을 만들어서 배열에 담고
 		낮은 번호부터 정렬해서
 		담긴 데이터를 출력해보자.
 		
 		로또 한 게임은
 			1 ~ 45 까지의 숫자가 6개 필요하다.
 */
public class ArraySoft01 {

	public static void main(String[] args) {
		// 숫자 담을 배열 6개 생성
		int[] lotto = new int[6];
		//랜덤 숫자 6개 생성해서 담기;
		ot :
		for(int i=0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45-1+1))+1;
			// 같은수가 없는지 찾아본다
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue ot;
				}
			}
			// 나온 숫자가 이전 숫자와 같지 않으면 배열에 담고 숫자 초기화시키기
			lotto[i] = no;
		}
		//번호 확인해보기
		JOptionPane.showMessageDialog(null, Arrays.toString(lotto));
	
		//오름차순 정렬하기
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println();
		//정렬된 내용 출력하기
		JOptionPane.showMessageDialog(null,  "<html><b style=\"color: red;\">★★★ 당첨 예정 번호 ★★★</b></html>\n\t"+Arrays.toString(lotto), "*********", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
