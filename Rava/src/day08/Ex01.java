package day08;

import java.util.Arrays;

/*
 ���� 1]
	�츮�� �л����� ������ �迭�� �����Ϸ����Ѵ�.
	�̸�, ��ȭ��ȣ, �̸����� �迭�� ���·� ����� �����ϰ�
	�ٽ� ������ �����͸� �����ؼ� �迭�� ����� ����ϼ���. 4��!
	
 */

public class Ex01 {

	public static void main(String[] args) {
		String[] name1 = {"�����", "ȸ���"};		
		String[] num1 = {"010-1111-1111", "010-2222-2222"};
		String[] mail1 = {"aa@increpas.com", "bb@increpas.com"};
		
		String[] name2 = {"ŷ", "��ı"};		
		String[] num2 = {"010-1111-1112", "010-2222-2223"};
		String[] mail2 = {"aa@increpas.com", "bb@increpas.com"};
		
		String[][] team1 = new String[name1.length][3];
		for(int i=0; i<name1.length; i++) {
			team1[i][0] = name1[i];
			team1[i][1] = num1[i];
			team1[i][2] = mail1[i];
		}
		
		String[][] team2 = new String[name1.length][3];
		for(int i=0; i<name1.length; i++) {
			team2[i][0] = name2[i];
			team2[i][1] = num2[i];
			team2[i][2] = mail2[i];
		}
		
		String[][][] cls = new String[2][][];
		cls[0] = team1;
		cls[1] = team2;
		
		for(int i=0; i<3; i++) {
			System.out.println(cls[0][0][i]);
		}
		/*
		for(String[][] i : cls) {
			for(String[] j : i) {
				for(String y : j) {
					System.out.println(y);
				}
				System.out.println("----------------------");
			}
			System.out.println("======================");
		}
		*/
		

	}

}
