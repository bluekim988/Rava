package day06;

import javax.swing.JOptionPane;

public class Test09 {

	public static void main(String[] args) {
		
		String[] name = {"김종형", "박광호", "임서진", "정우승", "최두용"};
		String[] tel = {"010-1111-1111", "010-2222-2222", 
						"010-3333-3333", "010-4444-4444", "010-5555-5555"};
		String[] mail = {"aa@increpas.com", "bb@increpas.com", 
						"cc@increpas.com", "dd@increpas.com", "ee@increpas.com"};
		
		String[][] team = new String[3][5];
		team[0] = name;
		team[1] = tel;
		team[2] = mail;
		
		String na = JOptionPane.showInputDialog("검색할 이름 : ");
		String msg = "해당 데이터가 없습니다.";
		
		int no = -1;
	
		for(int i=0; i < team[0].length; i++) {
			if(team[0][i].equals(na)) {  //정보비교
				no = i;
				break;
			}
		}
		if(no >= 0) {
			msg = "name : " + team[0][no] + "\ntel : " + team[1][no] + "\nmail : " + team[2][no];
		}
	
		JOptionPane.showMessageDialog(null, msg);
	}

}


