package day19;
import java.io.*;
import javax.swing.*;

/*
 	���� 5]
 		1. day19/etc �� �����ϳ��� ������ �����.
 			day19/etc/snue
 		2. ��λ� ���� �������� �Ѳ����� �����
 			day19/etc/zzz/abc
 			
 		3. ������� ������ �ϳ��� �����Ѵ�.
 			(���� �� ���� ����, ���ϵ� ���� ����)
 			
 		4. Ư�� ������ �̸��� �ٸ� �̸����� ��������.
 */
public class Test05 {

	public Test05() {
		// ����� ���� ����(��� ��� ����) ����Ŭ������ ������
		// 1
//		File file = new File("src/day19/etc/snue");
//		file.mkdir();
		
		// 2
		/*
		File file = new File("src/day19/etc/zzz/abc");
		boolean bool = file.mkdirs();
		if(bool == true) {
			JOptionPane.showMessageDialog(null, "�����Ϸ�");
		}
		*/
		
		// 3
		/*
		File file = new File("src/day19/etc/zzz/abc");
		file.delete();
		*/
		
		// 4
		File ofile = new File("src/day19/etc/sample.txt");
		File nfile = new File("src/day19/etc/sample.increpas");
		ofile.renameTo(nfile);
		
	}

	public static void main(String[] args) {
		new Test05();

	}

}
