package day07;
import javax.swing.*;
public class Test03 {
	public static void main(String[] args) {
		//"현우"를 기억할 문자열 변수를 만들고 각 변수를 비교하세요.
		
		String str1 = "현우";
		String str2 = "현우";
		
		String str3 = new String("현우");
		String str4 = new String("현우");
		
		JOptionPane.showMessageDialog(null, "str1 == str2 : "+(str1==str2)+
											"\nstr1 == str3 : "+(str1==str3)+
											"\nstr3 == str4 : "+(str3==str4));	
		
		
	}
}
