package day08;

public class Test03 {

	public static void main(String[] args) {
		// 2차원 배열을 만든다. 배열을 관리할 갯수는 3개로 하고, 각 배열에 담길 숫자의 갯수는 7개로 한다.
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
