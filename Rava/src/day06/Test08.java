package day06;
/*
 ����8]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����
	�����͸� �Է��ؼ�
	
	ȸ���� �̸��� �Է��ϸ�
	ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���.
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
		String na = JOptionPane.showInputDialog("�̸� : ");
		String nu = JOptionPane.showInputDialog("��ȭ��ȣ : ");
		String em = JOptionPane.showInputDialog("�̸��� : ");
		
		name[cnt] = na;
		num[cnt] = nu;
		email[cnt] = em;
		cnt += 1;
	}
	

	public void searchData() {

		String name1 = JOptionPane.showInputDialog("�˻��� �̸� : ");
		int no = searchCnt(name1);
		String msg = "�ش� ������ �����ϴ�.";
		if(no > -1) {
			msg = "�̸� : " + name[no] + "\n��ȭ��ȣ : " + num[no] + "\n�̸��� : " + email[no];
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
		String no = JOptionPane.showInputDialog("���α׷��� �����մϴ�. \n1.�����Է� \n2.�����˻� \n3.���α׷����� \n���� : ");
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
