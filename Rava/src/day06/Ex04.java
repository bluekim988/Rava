package day06;

/*
 ����4]
	������ 5���� ����� �迭�� �����
	
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ���� 
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	��, ��� ���´�
	
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
			
		�� ���·� ��µǰ� �ϼ���.
 */

public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		double[] area = new double[5];
		double[] around = new double[5];
		
	
		for(int i=0; i<ban.length; i++) {
			ban[i] = (int)(Math.random()*(30-2+1)+2);
			area[i] = ban[i] * 2 * Math.PI;
			around[i] = ban[i] * ban[i] * Math.PI;
		}
		for(int j=0; j<ban.length; j++) {
			System.out.printf("������ : %d , ���� �ѷ� : %.2f , ���� ���� : %.2f",ban[j], +area[j] ,around[j]);
			System.out.println();
		}
	}

}
