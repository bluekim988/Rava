package day02;
/*
	���� 2]
	 		0 ~ 255 ������ ���ڸ� �����ϰ� �����
	 		�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
	 		�ش� ���ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
	 		��, ���� �����ڸ� ����ؼ� ó���ϼ���.
*/
public class Ex02 {
	
	public Ex02() {
		char ch = (char)(Math.random() * (255 + 1));
		
		what(ch);
	}
	
	public void what(char ch) {
		String result = (ch >= 'A' && ch <= 'Z') ? 
				(ch + " ������ ") : (ch  >= 'a' && ch <= 'z') ? (ch + "������") : (ch +" �����ڰ� �ƴմϴ�.");
				System.out.println(result);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
