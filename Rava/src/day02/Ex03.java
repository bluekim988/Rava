package day02;
/*
 ���� 3]
 		ȭ��(Fahrenheit) �µ� 100���� 
 		����(Celcius) �µ� ����� �˾ƺ��� ���α׷��� �ۼ��ϼ���.
 		
 		����]
 			�����µ� = 5 / 9 X (ȭ���µ� - 32)
 			
 */
public class Ex03 {

	public Ex03() {
		double num = 100.;
		celcius(num);
	}
	
	public void celcius(double no) {
		double sum1 = 5. / 9. * (no - 32.);
		int result = (int)sum1;
		System.out.println("ȭ�� " + (int)no + " �� �� ���� " + result + " �� �Դϴ�.");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
