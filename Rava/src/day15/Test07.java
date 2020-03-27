package day15;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test07 {

	public Test07() {
		File f = new File("D:\\class\\Java\\git\\Rava\\Rava\\doc\\day15_src");
		
		Scanner sc = null;
		String str = "";
		try {
			sc = new Scanner(f);
			str = sc.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
		StringTokenizer token = new StringTokenizer(str, "1");
		
		int count = token.countTokens();
		System.out.println("자른 갯수" + count);
		
		/*
		for(int i=0; i<count; i++) {
			String tmp = token.nextToken();
			System.out.println("분리된 문자 : " + tmp);
		}
		*/
		
		while(token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("분리된 문자 : " + tmp);
		}

	}

	public static void main(String[] args) {
		new Test07();

	}

}
