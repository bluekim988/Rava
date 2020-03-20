package day06;
/*
 문제8]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고
	데이터를 입력해서
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test08 {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	String[] name = new String[5];
	String[] num = new String[5];
	String[] email = new String[5];

	public void inputData() {
		String na = JOptionPane.showInputDialog("이름 : ");
		String nu = JOptionPane.showInputDialog("전화번호 : ");
		String em = JOptionPane.showInputDialog("이메일 : ");
		
		name[cnt] = na;
		num[cnt] = nu;
		email[cnt] = em;
		cnt += 1;
	}
	

	public void searchData() {

		String name1 = JOptionPane.showInputDialog("검색할 이름 : ");
		int no = searchCnt(name1);
		String msg = "해당 정보가 없습니다.";
		if(no > -1) {
			msg = "이름 : " + name[no] + "\n전화번호 : " + num[no] + "\n이메일 : " + email[no];
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public int searchCnt(String na) {
		int no = -1;
		for(int i=0; i<cnt; i++) {
			if(name[i].equals(na)) {
				no = i;
			}
		}
		return no;
	}
	
	
	public String initMenu() {
		String no = JOptionPane.showInputDialog("프로그램을 시작합니다. \n1.정보입력 \n2.정보검색 \n3.프로그램종료 \n선택 : ");
		return no;
	}
	public Test08() {
		while(true) {
			String no = initMenu();
			
			switch(no) {
			case "1" :
				inputData();
				break;
			case "2" :
				searchData();
				break;
			case "3" : 
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Test08();

	}

}
