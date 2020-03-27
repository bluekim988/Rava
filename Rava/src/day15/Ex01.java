package day15;
/*
 	¹®Á¦ 1]
 	
 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
 		ÀÌ¸ŞÀÏ Çü½ÄÀº 
 			¾ËÆÄºª°ú ¼ıÀÚ·Î 8ÀÚ ÀÌ»óÀ¸·Î ÇÏ°í  @ µµ¸ŞÀÎÁÖ¼Ò·Î Ã³¸®ÇÏ¼¼¿ä.
 		Âü°í]
 			ÇÑ±Û Ã³¸® : [°¡-ÆR]	- ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö ¸¶¼¼¿ä.
 */

import java.util.regex.*;
import javax.swing.*;

public class Ex01 {
	
	public Ex01() {
		pw();
	}
	
	public void pw() {
		String pw = JOptionPane.showInputDialog("ÆĞ½º¿öµå¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		Pattern pt = Pattern.compile("^(?=.*[\\W])(?=.*[a-zA-Z])(?=.*[\\d])[\\Wa-zA-Z\\d]{8,}$");
		Matcher mt = pt.matcher(pw);
		
		String str = "Àß¸øµÈ pw Çü½ÄÀÔ´Ï´Ù.";
		if(mt.matches()) {
			str = "ÆĞ½º¿öµå°¡ ÀÔ·ÂµÇ¾îÁ³½À´Ï´Ù";
		}
		
		JOptionPane.showMessageDialog(null, str);
		
	}
	
	public void id() {
		String id = JOptionPane.showInputDialog("¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		Pattern pt = Pattern.compile("^([a-z\\d_-]{5,15})$");
		Matcher mt = pt.matcher(id);
		
		String str = "Àß¸øµÈ id Çü½ÄÀÔ´Ï´Ù.";
		if(mt.matches()) {
			str = "¾ÆÀÌµğ°¡ ¸¸µé¾îÁ³½À´Ï´Ù";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}
	public void email() {
		String mail = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä");
		Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([\\da-z]+)\\.([a-z\\.]{2,6}$)");	
		Matcher matcher = pattern.matcher(mail);
		
		String str = "Àß¸øµÈ ÀÌ¸ŞÀÏ Çü½ÄÀÔ´Ï´Ù";
		if(matcher.matches()) {
			str = "ÀÌ¸ŞÀÏÀÌ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
