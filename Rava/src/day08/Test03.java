package day08;

public class Test03 {

	public static void main(String[] args) {
		// 2���� �迭�� �����. �迭�� ������ ������ 3���� �ϰ�, �� �迭�� ��� ������ ������ 7���� �Ѵ�.
		char[][] ch = new char[8][11];
		
		int no = 4;
		int no2 = 6;
		ch[0][5] = '*';
		for(int i=1; i<6; i++) {
			for(int j=no; j>no-1; j--) {
				ch[i][j] = '*';
			}
			no--;
			for(int y=no2; y < no2+1; y++) {
				ch[i][y] = '*';
			}
			no2++;
		}
		
		for(char[] ch1 : ch) {
			for(char i : ch1) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
