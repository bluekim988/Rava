package day10;
/*
 ���� 2]
	10���� ������ ������ �Է��� �迭�� �����
	�� �迭�� ��� ������
	����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.
 */
public class Cls1 {

	int sum;
	double avg;
	
	public Cls1(int[] a) {
		for(int i=0; i<a.length; i++) {
			int no = (int)(Math.random() * (100-40+1))+40;
			a[i] = no;
		}
	}
	
	public void setSum(int[] a) {
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		avg = sum/10;
	}
	public void showVal() {
		System.out.printf("���� : %3d \n���: %.2f \n",sum, avg);
	}
}
