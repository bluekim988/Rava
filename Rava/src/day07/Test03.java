package day07;
import javax.swing.*;
public class Test03 {
	public static void main(String[] args) {
		//"����"�� ����� ���ڿ� ������ ����� �� ������ ���ϼ���.
		
		String str1 = "����";
		String str2 = "����";
		
		String str3 = new String("����");
		String str4 = new String("����");
		
		JOptionPane.showMessageDialog(null, "str1 == str2 : "+(str1==str2)+
											"\nstr1 == str3 : "+(str1==str3)+
											"\nstr3 == str4 : "+(str3==str4));	
		
		
	}
}
