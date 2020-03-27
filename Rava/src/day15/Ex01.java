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

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä");
		
		Pattern pattern = Pattern.compile("^[\\w._%+-]+@[a-zA-Z]+\\.[a-zA-Z]+\\.[a-zA-Z]{2,6}$");
		
		Matcher matcher = pattern.matcher(mail);
		
		String str = "Àß¸øµÈ ÀÌ¸ŞÀÏ Çü½ÄÀÔ´Ï´Ù";
		if(matcher.matches()) {
			str = "ÀÌ¸ŞÀÏÀÌ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.";
		}
		
		JOptionPane.showMessageDialog(null, str);
	}

}
