package day04;

/*
 	�� ����� ����� �ϴµ�
 	�� ����� ���� ����� 0.54m/s �����߰�
 	�ѻ���� ���󿡼� 1.07m/s �������� �����ߴ�.
 	
 	���� ���̰� 7564m��� �����ϰ�
 	�� ����� ������ �ð��� ��� ���� �������� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	�ӵ� = �ð�/�Ÿ�
 	
 	0.54 x �ð�  + 1.07 x �ð� = 7564
 */
public class Hw04 {

	public Hw04() {
		double sNum = sec();
		System.out.println(sNum);
		System.out.println(0.54*sNum + "m");
		double min = (sNum/60);
		sNum = sNum - (int)min*60;
		System.out.println((int)min + "��" + (int)sNum +"��" );
		
	}
	public double sec() {
		double xNum = 0.54;
		double yNum = 1.07;
		double sum = 0;
		
		for(double i=1;true;i++) {
			sum = xNum*i + yNum*i;
			if(sum >= 7564) {
				return i;
			}
		}
	}
	

	public static void main(String[] args) {
		new Hw04();

	}

}
