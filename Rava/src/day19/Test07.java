package day19;

import java.io.*;
import javax.swing.*;

/*
 	������ ���Ͽ� �����ϴ� ���α׷��� �ۼ��ϼ���.
 	��, ������Ʈ�� Bufferd ��Ʈ���� ����ϼ���.
 */

public class Test07 {

	public Test07() {
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		
		try {
			out = new FileOutputStream("src/day19/etc/buffer_test.txt");
			bout = new BufferedOutputStream(out);
			
			String str = "���۽�Ʈ���� �׽�Ʈ �մϴ�.";
			byte[] buff = str.getBytes();
			bout.write(buff);
			// ���۰� ���� ���� �� ������ ������ ������ ������
			// ���۵� ��Ʈ���� ����� ��� ���������� flush()�� ��������
			bout.flush();
			JOptionPane.showMessageDialog(null, "����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test07();

	}

}
