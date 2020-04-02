package day19;
/*
 	���� 6]
 		doc �������� ������ ����� �˾Ƴ���.
 */
import java.io.*;
import javax.swing.*;

public class Test06 {

	public Test06() {
		// 1. ����� �˾Ƴ������ ������ ���Ϸ� �����.
		File dir = new File("doc");
		
		/*
		String[] list = dir.list();
		
		for(int i = 0; i<list.length; i++) {
			String fname = list[i];
			System.out.println(fname);
		}
		*/
		
		/*
		File[] flist = dir.listFiles();
		for(int i=0; i<flist.length; i++) {
			File fileInfo = flist[i];
			String fileName = fileInfo.getName();	// ���� �̸� ������
			long len = fileInfo.length();			// ���� ũ�� ������
			String folder = fileInfo.getParent();	// ���� ������
			
			//����ϱ�
			System.out.println(fileName+" | "+ folder + " | " + len);
			
		}
		*/
		
		// Ư�� ������ �ִ� ���� �߿��� Ȯ���ڰ� txt�� ���ϸ� ��� ����غ���.
		// �̷��� ��쿡�� ���ϸ���� ������ �� ���͸� �Է������ �ϴµ�
		// �� ���ʹ� ������� ������ ���� ���ݾ� �޶��� ���̴�.
		// ���� ���ʹ� �������̽��� ������ ���ְ� �ִ�.
		String[] fileList = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// �Ű������� ����
				// File dir : ���� ������ ������ �˷��ش�.
				// String name : ���� ������ �̸��� �˷��ش�.
				// �� �Լ��� �ڵ� ȣ��Ǵ� �Լ��̴�.
				// ����� ���ϴ� ������ �ϳ��� �߰��� ������ �� �Լ��� ȣ��ȴ�.
				// ���� �� �Լ��� ��ȯ���� true �̸� ��Ͽ� ���Խ�Ű��
				// ��ȯ���� false �̸� ��Ͽ��� ���ܸ� ��Ų��.
				
				return name.endsWith("txt");
			}
		});
		String str = "";
		int cnt = 0;
		for(String s : fileList) {
			str += s+"\r\n";
			cnt++;
		}
		JOptionPane.showMessageDialog(null, str);
		JOptionPane.showMessageDialog(null, "���� �� : " + cnt);
		
	}
	public static void main(String[] args) {
		new Test06();
	}
}
