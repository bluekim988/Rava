package day11;

public class Test01_01 {
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();
		
		t1.num = 10;
		t2.num = 20;
		t3.num = 30;
		
		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num);
		// static������ �������� ���ȴ�.
		// ���� t3�� �����ͷ� ��� ��ü�ȴ�.
		System.out.println(Test01.num);
		System.out.println(Math.PI);
	}
}
