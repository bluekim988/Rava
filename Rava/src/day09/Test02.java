package day09;
/*
 	���� �ΰ��� �Է��ϸ�
 	�� ���ڸ� ����������ִ� �Լ����� �����
 	������ �ؼ� 
 	������ ����ϰ�
 	������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Test02 {

	public Test02() {
		// �Լ��� ��ȯ���� ������ ��Ƽ�
		int num1 = plus(3, 7);
		int num2 = minus(6, 7);
		int num3 = namuji(7, 7);
		int num4 = gop(1000, 2000);
		int num5 = nanugi(1, 1);
		
		// ������ش�.
		System.out.println("plus(3, 7) : " + num1 );
		System.out.println("minus(6, 7) : " + num2 );
		System.out.println("namuji(7, 7) : " + num3 );
		System.out.println("gop(1000, 2000) : " + num4 );
		System.out.println("nanugi(1, 1) : " + num5 );
		
	}
	
	// ���ϱ� ����
	public int plus(int no1, int no2) {
		int sum = no1 + no2;
		return sum;
	}
	public int minus(int no1, int no2) {
		int result = no1 - no2;
		return result;
	}
	public int gop(int no1, int no2) {
		int result = no1 * no2;
		return result;
	}
	public int namuji(int no1, int no2) {
		int result = no1 % no2;
		return result;
	}
	public int nanugi(int no1, int no2) {
		int result = no1 / no2;
		return result;
	}
	public static void main(String[] args) {
		new Test02();

	}

}
