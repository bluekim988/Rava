package day09;
/*
 	1���� �迭�� 
 	'A' ~ 'E' ���� �ʱ�ȭ ���ִ� �Լ��� �����ؼ�
 	�������� ch �� �ʱ�ȭ�� ���ְ�
 	
 	�빮�ڸ� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ����
 	ch�� ���ڸ� �ҹ��ڷ� ��� ���� �ϼ���.
 	
 	
 	��ȭ�н�]
 		���ڹ迭�� �Է��ϸ�
 		���ڹ迭�� 'A' ~ 'E' �ʱ�ȭ���ִ� ����� ���� �Լ��� �ۼ��ϰ�
 		�����ؼ� ����ϼ���.
 */

public class Test03 {
	char[] ch;
	char[] test = new char[5];
	
	public Test03() {
		// ch �迭 �ʱ�ȭ
		setCh();
		
		// ����غ���
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		// toSo�޼ҵ带 ȣ���� ���� ��ȯ�ϱ�
		for(int i=0; i<ch.length; i++) {
			ch[i] = toSo(ch[i]);
		}
		// �ٹٲ�
		System.out.println();
		
		// ����غ���
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		
		// ��ȭ����
		setArr(test);
		
		System.out.println();
		System.out.println("\n-------��ȭ����---------");
		
		//����غ���
		for(char c : test) {
			System.out.printf("%2c | ", c);
		}
	}
	// ��ȭ���� �޼ҵ�
	public void setArr(char[] ar) {
		for(int i=0; i<ar.length; i++) {
			ar[i] = (char)('A' + i);
		}
	}
	
	// ���ڹ迭 �ʱ�ȭ��Ű�� ����� �Լ�
	public void setCh() {
		ch = new char[5];
		for(int i = 0; i<ch.length; i++) {
			ch[i] = (char)('A' + i);
		}	
	}
	
	// �빮�ڸ� �ҹ��ڷ� ��ȯ���ִ� �Լ�
	public char toSo(char c) {
		char result = (char)(c + ('a' - 'A'));
		return result;
	}
	public static void main(String[] args) {
		new Test03();
		
	}

}
