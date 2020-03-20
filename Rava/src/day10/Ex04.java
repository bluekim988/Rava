package day10;
/*
 	dessert ]									*
*												*
*	최근 5년동안의 기온을 배열에 담아서 관리하려고 한다.			*
*	int[][] gion = new int[5][2];				*
*												*
*	로 만들고										*
*	첫번째 방에는 기온을 랜덤하게 입력하고					*
*	두번째 방에는 순위를 1 ~ 5까지 인덱스증가값으로 채워넣으세요.
 */
public class Ex04 {

	public static void main(String[] args) {
		int[][] gion = new int[5][3];
		
		int no1 = 2020; //년도 변수
		for(int i=0; i<gion.length; i++) {
			int no = (int)(Math.random() * (60 + 1)) - 20; //기온 변수
			gion[i][1] = no;
			gion[i][2] = 1;
			gion[i][0] = no1--;
		}
		
		// 순위 부여
		for(int i=0; i<gion.length; i++) {
			for(int j=0; j<gion.length; j++) {
				if(gion[i][1] > gion[j][1]) {
					gion[i][2] += 1;
				}
			}
		}
		
		// 순위기준으로 정렬
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
