package day08;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
���� 4]
	�ݾ��� �Է��ϸ�
	�ݾ׸�ŭ�� �ζǰ����� ������ִ� ���α׷��� �ۼ��ϼ���.
	�ζ� �Ѱ����� 1000���̰�, ���忡�� 5������ ����.
	�Է��� �ݾ��� 1000�������� �ϱ�� �Ѵ�.
	��, �ζ� ��ȣ�� �������� �����ؼ� �����ϼ���.
	
*/
public class Ex05 {

	public static void main(String[] args) {
		String wonstr = JOptionPane.showInputDialog("�ݾ��� �Է� : ");
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
