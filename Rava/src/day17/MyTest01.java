package day17;

import java.io.*;


public class MyTest01 {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("D:\\class\\Java\\git\\Rava\\Rava\\doc\\test0331.txt"));

		out.write("전국의 국민 70%에게 현금성 지원이 이뤄지긴 헌정사상 처음입니다.");
		out.newLine();
		out.write("중위소득 150%까지, 1400만 가구의 3500만 명이 대상입니다.");
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
