package day08;

import java.util.Arrays;

/*
 	�������� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����
 	�� �迭���� ������ �迭�� ���� �Է��ϰ� ����ϼ���.
 */
public class Test02 {

	public static void main(String[] args) {
		
		String[] name = {"�����", "ȸ���", "ŷ", "��ı"};
		String[] num = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444"};
		String[] mail = {"aa@increpas.com", "bb@increpas.com", "cc@increpas.com", "dd@increpas.com"};
		
		String[][] team1 = new String[3][name.length];
		for(int i=0; i<name.length; i++) {
			team1[0][i] = name[i];
			team1[1][i] = num[i];
			team1[2][i] = mail[i];
		}
		
		String[][] teamOne = new String[3][];
		teamOne[0] = name;
		teamOne[1] = num;
		teamOne[2] = mail;
		
		System.out.println(Arrays.deepToString(team1));
		System.out.println(Arrays.deepToString(teamOne));
		
		System.out.println(team1[0][3]);
		System.out.println(teamOne[0][3]);
		
	}

}
