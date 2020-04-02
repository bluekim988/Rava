package day19;
import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	���� 4]
 		������ �����غ���.
 */
public class Test04 {

	public Test04() {
		//�⺻ ��Ʈ�� �ΰ��� �غ��Ѵ�.
		FileInputStream in = null; // ����
		FileOutputStream out = null; //���纻
		
		try {
			// �⺻ ��Ʈ�� �ΰ��� ����.
			in = new FileInputStream("src/day19/Test04.java");
			out = new FileOutputStream("src/day19/Test04_01.java");
			// ��� �о�� ���� ���� ���� �۾��� �ݺ��Ѵ�
			byte[] buff = new byte[1024];
			String str = "";
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = in.read(buff);
				if(len == -1) {
					break;
				}
				str += new String(buff, 0, len);
			}
			// ���ڿ��� �ٽ� �迭�� �ٲ� ���Ͽ� ��������
			byte[] obuff = str.getBytes();
			out.write(obuff);
			JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				out.close();
				in.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
