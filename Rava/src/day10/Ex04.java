package day10;
/*
 	dessert ]									*
*												*
*	�ֱ� 5�⵿���� ����� �迭�� ��Ƽ� �����Ϸ��� �Ѵ�.			*
*	int[][] gion = new int[5][2];				*
*												*
*	�� �����										*
*	ù��° �濡�� ����� �����ϰ� �Է��ϰ�					*
*	�ι�° �濡�� ������ 1 ~ 5���� �ε������������� ä����������.
 */
public class Ex04 {

	public static void main(String[] args) {
		int[][] gion = new int[5][3];
		
		int no1 = 2020; //�⵵ ����
		for(int i=0; i<gion.length; i++) {
			int no = (int)(Math.random() * (60 + 1)) - 20; //��� ����
			gion[i][1] = no;
			gion[i][2] = 1;
			gion[i][0] = no1--;
		}
		
		// ���� �ο�
		for(int i=0; i<gion.length; i++) {
			for(int j=0; j<gion.length; j++) {
				if(gion[i][1] > gion[j][1]) {
					gion[i][2] += 1;
				}
			}
		}
		
		// ������������ ����
		for(int i=0; i<gion.length; i++) {
			for(int j=i; j<gion.length; j++) {
				if(gion[i][2] > gion[j][2]) {
					int[] cnt = gion[i];
					gion[i] = gion[j];
					gion[j] = cnt;
				}
			}
		}
		
		for(int[] i : gion) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
