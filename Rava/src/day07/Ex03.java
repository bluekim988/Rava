package day07;
/*
 문제3]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고  - 문자열 배열 3개
	데이터를 입력해 놓고
	
	이름을 입력하면 그 사람의 데이터를 모두 저장할 배열을 만들어서 데이터를 담고
	출력하세요.
	
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"김종형", "반장님", "회장님"};
		String[] num = {"010-1111-1111", "010-2222-2222", "010-3333-3333"};
		String[] mail = {"aaa@increpas.com", "bbb@increpas.com", "ccc@increpas.com"};
		
		String[] sum = new String[1];
		String na = JOptionPane.showInputDialog("이름 : ");
		
		int no = -1;
		
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(na)) {
				no = i;
			}
		}
		String st = "해당 정보는 없습니다.";
		if(no>-1) {
			sum[0] = name[no] + "\n" +num[no] +"\n" +mail[no];
			st = Arrays.toString(sum);
			JOptionPane.showMessageDialog(null, st);
		} else {
			JOptionPane.showMessageDialog(null, st);
		}
			
	}

}
