package day17;

import java.io.*;


public class MyTest01 {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("D:\\class\\Java\\git\\Rava\\Rava\\doc\\test0331.txt"));

		out.write("������ ���� 70%���� ���ݼ� ������ �̷����� ������� ó���Դϴ�.");
		out.newLine();
		out.write("�����ҵ� 150%����, 1400�� ������ 3500�� ���� ����Դϴ�.");
		out.newLine();
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("D:\\class\\Java\\git\\Rava\\Rava\\doc\\test0331.txt"));
		
		String str;
		while(true) {
			str = in.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
	}

}
