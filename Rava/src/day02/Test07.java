package day02;

public class Test07 {
/*
 	�ܼ�â�� ����ϴ� ����� ���� �Լ�
 		1. println(����)	- ������ ��������� �ٹٲ����ִ� �Լ�
 		2. print(����)	- ������ ����ϰ� �ٹٲ��� ���� �ʴ� �Լ�
 		3. printf(����, ����, ����, ...) - ������ ���Ŀ� �°� ������ִ� �Լ�
 */
	public Test07() {
		System.out.println("#############");
		System.out.println("#############");
		
		System.out.print("#############");
		System.out.print("#############\n");
		System.out.println("******\t*****");
		System.out.println("----------------------------------------");
		System.out.printf("-----%5d-----", 10);
		System.out.printf("*****%.2f*****%n", 3.141592 );
		
		System.out.printf("%5s", "ȫ�浿");
	}

	public static void main(String[] args) {
		new Test07();
	}

}