package day08;

import javax.swing.JOptionPane;

/*
 문제 4]
	금액을 입력하면
	금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요.
	로또 한게임은 1000원이고, 한장에는 5게임이 들어간다.
	입력한 금액은 1000원단위로 하기로 한다.
	단, 로또 번호는 오름차순 정렬해서 저장하세요.
	
 */
public class Ex04 {
	public static void main(String[] args) {

		String num0 = JOptionPane.showInputDialog("금액을 입력하세요 : ");
		Integer int1 = new Integer(num0);
		int num = int1.intValue();
		int coin = num / 1000;
		int frame = ((coin - 1) / 5) + 1;
		int co = coin;
		int so = 0;

		int[][][] pan = new int[frame][5][6];
		lo: while (true) {
			int zo = 0;
			if (co / 5 > 0) {
				zo = 5;
			} else {
				zo = (co + 5) % 5;
			}

			switch (zo) {
			case 5:
				for (int x = so; x == so++; x++) { // 프레임(5개씩 1종이) 배열을 위한 반복문
					for (int i = 0; i < zo; i++) { // 코인(1천원당 한판) 배열을 위한 반복문
						ot: for (int j = 0; j < 6; j++) { // 추첨숫자(숫자6개)배열을 위한 반복문
							int no = (int) (Math.random() * 45) + 1;
							for (int y = 0; y < j; y++) { // 동일한 수 점검
								if (no == pan[x][i][y]) {
									j--;
									continue ot;
								}
							}
							pan[x][i][j] = no; // 5줄씩만 담기
						}
					}
					if (co - 5 > 0) {
						co = co - 5;
						continue lo;
					} else {
						for(int q=0; q<pan.length; q++) {
							for(int q1 =0; q1<pan[q].length; q1++) {
								for(int q2=0; q2<pan[q][q1].length; q2++) {
									System.out.print(pan[q][q1][q2] + "  ");
								}
								System.out.println();
							}
							System.out.println("======================");
						}
						return;
					}
				}
			default:
				for (int z = so; z == so++; z++) { // 프레임(5개씩 1종이) 배열을 위한 반복문
					for (int i = 0; i < zo; i++) { // 코인(1천원당 한판) 배열을 위한 반복문
						ot: for (int j = 0; j < 6; j++) { // 추첨숫자(숫자6개)배열을 위한 반복문
							int no = (int) (Math.random() * 45) + 1;
							for (int y = 0; y < j; y++) { // 동일한 수 점검
								if (no == pan[z][i][y]) {
									j--;
									continue ot;
								}
							}
							pan[z][i][j] = no; // 5줄씩만 담기
						}
					}
					for(int q=0; q<pan.length; q++) {
						for(int q1 =0; q1<pan[q].length; q1++) {
							for(int q2=0; q2<pan[q][q1].length; q2++) {
								if(pan[q][q1][q2] == 0) {
									return;
								}
								System.out.print(pan[q][q1][q2] + "  ");
							}
							System.out.println();
						}
						System.out.println("======================");
					}
					return;
				}
			}
		}

	}
}
