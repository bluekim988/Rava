package day03;
/*
 	���� 1]
 		�Խ��ǿ� ���� ���������� 15�� ���� ǥ���� �� �ִ�.
 		�Խù��� ������ �����ϰ� 0 ~ 100 �߻��� ��
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 		��, �Խù� ���� 0�� ���� 1�������� �ʿ��� ������ �Ѵ�.
 		
 */

public class Ex02 {
	public Ex02() {
		int no = random();
		search(no);
	}
	public int random() {
		
		int result = (int)(Math.random()*(100)); 
		
		return result;
	}
	public void search(int no) {
		switch ((no-1)/15) {
		case 5 :
			System.out.println(no + " �� 6������ �Դϴ�.");
			break;
		case 4 :
			System.out.println(no + " �� 5������ �Դϴ�.");
			break;
		case 3 :
			System.out.println(no + " �� 4������ �Դϴ�.");
			break;
		case 2 :
			System.out.println(no + " �� 3������ �Դϴ�.");
			break;
		case 1 :
			System.out.println(no + " �� 2������ �Դϴ�.");
			break;
		case 0  :
			System.out.println(no + " �� 1������ �Դϴ�.");
			break;
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
