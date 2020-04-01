package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 	President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
	He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.
	
	
	�ܾ������ ���ڿ��� �߶�
	�ܾ���̰� ���� �� �ܾ��� ���ڼ��� �ܾ ����ϼ���.
	
	��, ,�� ., - �׸��� ? �� �ܾ�� �����Ѵ�.
 */
public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("D:\\class\\Java\\git\\Rava\\Rava\\doc\\trump.txt");
		Scanner sc = new Scanner(in);
		
		
		String str = sc.nextLine();
		System.out.println(str);
		
		String str2 = str.replaceAll("\\.", "").replace("?", "").replace(",", "").replace("-", "");
		System.out.println(str2);

		
		
		
		StringTokenizer token = new StringTokenizer(str2);
		ArrayList<String> strList = new ArrayList<String>();
		while(token.hasMoreTokens()){
			strList.add(token.nextToken());
		}

		int maxLen = 0;
		String maxStr = "";
		
		for(int i=0; i<strList.size(); i++) {
			
			String str3 = strList.get(i);
			int len = strList.get(i).length();
			if(maxLen < len) {
				maxLen = len;
				maxStr = str3;
			}
		}
		System.out.println("���� : " + maxLen );
		System.out.println("�ܾ� : " + maxStr);
	
		
	}

}
