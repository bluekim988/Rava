package day08;
/*
 ���� 3]
	"PengSoo Good!"
	�̶�� ���ڿ��� �� ���ھ� ������
	�迭�� �����ϰ�
	�ϳ��� ������ ����ϼ���.
 */

public class Ex03 {

	public static void main(String[] args) {
		String str = "PengSoo Good!";
		
		char[] ch = new char[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		for(char j : ch) {
			System.out.print(j + " ");
		}
	}

}
