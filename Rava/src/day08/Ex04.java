package day08;

import javax.swing.JOptionPane;

/*
 ���� 4]
	�ݾ��� �Է��ϸ�
	�ݾ׸�ŭ�� �ζǰ����� ������ִ� ���α׷��� �ۼ��ϼ���.
	�ζ� �Ѱ����� 1000���̰�, ���忡�� 5������ ����.
	�Է��� �ݾ��� 1000�������� �ϱ�� �Ѵ�.
	��, �ζ� ��ȣ�� �������� �����ؼ� �����ϼ���.
	
 */
public class Ex04 {
	public static void main(String[] args) {

		String num0 = JOptionPane.showInputDialog("�ݾ��� �Է��ϼ��� : ");
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
				for (int x = so; x == so++; x++) { // ������(5���� 1����) �迭�� ���� �ݺ���
					for (int i = 0; i < zo; i++) { // ����(1õ���� ����) �迭�� ���� �ݺ���
						ot: for (int j = 0; j < 6; j++) { // ��÷����(����6��)�迭�� ���� �ݺ���
							int no = (int) (Math.random() * 45) + 1;
							for (int y = 0; y < j; y++) { // ������ �� ����
								if (no == pan[x][i][y]) {
									j--;
									continue ot;
								}
							}
							pan[x][i][j] = no; // 5�پ��� ���
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
				for (int z = so; z == so++; z++) { // ������(5���� 1����) �迭�� ���� �ݺ���
					for (int i = 0; i < zo; i++) { // ����(1õ���� ����) �迭�� ���� �ݺ���
						ot: for (int j = 0; j < 6; j++) { // ��÷����(����6��)�迭�� ���� �ݺ���
							int no = (int) (Math.random() * 45) + 1;
							for (int y = 0; y < j; y++) { // ������ �� ����
								if (no == pan[z][i][y]) {
									j--;
									continue ot;
								}
							}
							pan[z][i][j] = no; // 5�پ��� ���
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
