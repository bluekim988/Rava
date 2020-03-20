package day06;
/*
 ����3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
	������ ������ �迭�� �����,
	����ϴ� ���α׷��� �ۼ��ϼ���.
	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] sum = new int[8];
		String[] str = {"��   ", "��õ", "õ   ", "����", "��   ", "����", "��   ", "��   "};
		
		int no = 79456;
		
		for(int i=0; i<coin.length; i++) {
			sum[i] = (no/coin[i]);
			no = no % coin[i];
			
		}
		for(int j=0; j<sum.length; j++) {
			System.out.printf("%s",str[j]);
			System.out.printf("%4d",sum[j]);
			System.out.println();
		}
	}
}
