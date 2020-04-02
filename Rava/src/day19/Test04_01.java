package day19;
import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	���� 4]
 		������ �����غ���.
 */
public class Test04_01 {

	public Test04_01() {
		//�⺻ ��Ʈ�� �ΰ��� �غ��Ѵ�.
		FileInputStream in = null; // ����
		FileOutputStream out = null; //���纻
		
		try {
			// �⺻ ��Ʈ�� �ΰ��� ����.
			in = new FileInputStream("src/day19/etc/sample.txt");
			out = new FileOutputStream("src/day19/etc/sample_clone.txt");
			// ��� �о�� ���� ���� ���� �۾��� �ݺ��Ѵ�
			byte[] buff = new byte[1024];
		
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = in.read(buff);
				if(len == -1) {
					break;
				}
				out.write(buff,0,len);
			}
		
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
		new Test04_01();

	}

}
