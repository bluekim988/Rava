package day07;
/*
 ����1]
	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ� ����ϰ�,
	���� �迭�� �ҹ��ڷ� ������ �� �� �迭�� ����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		int[] ch = new int[10];
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = ((int)(Math.random()*('Z' - 'A' +1))+'A');
		}
		
		int[] ch2 = ch;
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = ch[i] + ('a'-'A');
		}
		
		for(int i : ch) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i : ch2) {
			System.out.print((char)i + " ");
		}
	}

}
