package day16;

import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		Calendar cal = Calendar.getInstance();
		String curTime = getStr(cal.getTime());
		JOptionPane.showMessageDialog(null, curTime);
	}
	
	// Date Ÿ���� �����͸� �Է��ϸ� ���Ŀ� �µ��� ���ڿ��� ��ȯ���ִ� �Լ�
	public String getStr(Date d) {
		String result = "";
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd�� E���� \n a hh�� mm�� ss�� \nM�� W�����Դϴ� \nȭ����~~~~~!");
		result = form.format(d);
		return result;
	}

	public static void main(String[] args) {
		new Test02();

	}

}
