package day07;
/*
 문제4]
	전화번호를 입력하면
	'-'를 기준으로 데이터를 분리해서 저장할 배열을 만들고
	분리된 데이터를 순서에 맞게 입력한뒤 출력하세요.
	
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		String[] arr = new String[3];

		String number = JOptionPane.showInputDialog("전화번호 입력 : ");
		
		String num = new String(number);
		
		
		for(int i=0; i<arr.length; i++) {
			int no = num.indexOf('-');
			if(no != -1) {
			arr[i] = num.substring(0, no);
			num = num.substring(no+1,num.length());
			} else {
				arr[i] = num.substring(0, num.length());
			}
		}
		String str = Arrays.toString(arr);
		JOptionPane.showMessageDialog(null, str);
	}

}
