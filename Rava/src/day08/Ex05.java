package day08;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
문제 4]
	금액을 입력하면
	금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요.
	로또 한게임은 1000원이고, 한장에는 5게임이 들어간다.
	입력한 금액은 1000원단위로 하기로 한다.
	단, 로또 번호는 오름차순 정렬해서 저장하세요.
	
*/
public class Ex05 {

	public static void main(String[] args) {
		String wonstr = JOptionPane.showInputDialog("금액을 입력 : ");
		Integer won = new Integer(wonstr);
		int panOr = won.intValue() / 1000;
		int pan = panOr;
		int cnt3 = 0;
		int paper = panOr-1 / 5 + 1;
		
		int [][][] lo = new int[paper][5][6];
		
		ot :
		while(true) {
			if(pan / 5 > 0) {
				for(int i=0; i<5; i++) {
					bt :
					for(int j=0; j<6; j++) {
						int no = (int)(Math.random() * 45) + 1;
						for(int x=0; x<j; x++) {
							if(no == lo[cnt3][i][x]) {
								j--;
								continue bt;
							}
						}
						lo[cnt3][i][j] = no;
					}
				}		
				pan = pan - 5;
				cnt3++;
				continue ot;
			}
			
			if(pan / 5 == 0) {
				for(int i=0; i<pan; i++) {
					bt :
					for(int j=0; j<6; j++) {
						int no = (int)(Math.random() * 45) + 1;
						for(int x=0; x<j; x++) {
							if(no == lo[cnt3][i][x]) {
								j--;
								continue bt;
							}
						}
						lo[cnt3][i][j] = no;
					}
				}
				break ot;
			}
		}
	
		ot :
		for(int i=0; i<lo.length; i++) {
			StringBuffer str = new StringBuffer();
			bt :
			for(int j=0; j<lo[i].length; j++) {
					if(lo[i][j][0] == 0) {
						continue bt;
					} 	
				str.append(Arrays.toString(lo[i][j]) + "\n");
			}
//			str.append("========================\n");
			
			JOptionPane.showMessageDialog(null, str);
		}
		
	}

}
