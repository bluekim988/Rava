package day04;

/*
 	���� 3]
 		2x + 4y = 10 �� �溡���� ����� ����ϼ���.
 		��, x, y �� ��� 0�̻� 10������ ���� 
 */

public class Ex03 {

	public Ex03() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((2*i) + (4*j) == 10)
					System.out.println("2x + 4y = 10 �϶� x�� y�� ���ϱ�\n"+"x : " + i + "\t y : " + j);
			}
		}
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
