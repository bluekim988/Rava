package day09;

/*
 String str = "GitHub is built for collaboration. 
 				Set up an organization to improve the way your team works together, 
 				and get access to more features."
 				
 	1. str ������ �� �������� �и��ؼ� �迭�� ��������. ('.'���� �и�)
 		String[] str1 = new String[];
 	2. �ܾ����ŭ�� ũ�⸦ ������ �迭�� �����
 		�迭�� �ܾ �Է��ϼ���.
 */
public class Ex00 {

	public static void main(String[] args) {
		// 1��
		String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		String strRe = str;
		String strRe2 = str;
		int ct = 0;
		char ch = '.';
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ch) {
				ct += 1;
			}
		}
		String[] str1 = new String[ct];

		for (int i = 0; i < ct; i++) {
			int no = strRe.indexOf('.');
			str1[i] = strRe.substring(0, no + 1);
			strRe = strRe.substring(no + 1);
		}
		for (String j : str1) {
			System.out.println(j);
		}

		System.out.println("==============================================");
		// 2 ��
		int ct2 = 0;
		char ch2 = ' ';
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ch2) {
				ct2 += 1;
			}
		}

		String[] str2 = new String[ct2+1];
		ot :
		for (int i = 0; i < ct2+1; i++) {
			if(i < ct2) {
			str2[i] = strRe2.substring(0, strRe2.indexOf(' ') + 1);
			strRe2 = strRe2.substring(strRe2.indexOf(' ') + 1);
			continue ot;
			}
			str2[i] = strRe2;
		}

		for (String j : str2) {
			System.out.println(j);
		}

	}

}
