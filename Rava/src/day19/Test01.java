package day19;
import java.io.*;
import java.util.Arrays;
/*
 	���� 1 ]
 		Ű���带 �̿��ؼ� ���ڸ� �Է� �޾ƺ���.
 		
 		����]
 			Ű���� ���� �ܺ���ġ�̴�.
 			���� ����ϴ� �ܺ� ��ġ�̱� ������
 			�̹� ��Ʈ������ �غ��� ������ �����Ѵ�.
 			
 				System.in
 			
 */
public class Test01 {

	public Test01() {
		System.out.print("�� ���ڸ� �Է��� �ּ��� : ");
		//���� ����
		int ch = 0;
		
		try {
			// ��� 1]
//			ch = System.in.read();
//			System.out.println("�Է��� ����: " + (char)ch);
			
			// ���2]
//			byte[] buff = new byte[256];
			// �迭�� ũ�⿡ ���� �ѹ��� �д� �������� ���� ��������.
//			int len = System.in.read(buff); // ���� ������ ������ ��ȯ���ش�.
			// ���� ����� ���ڷ� ��ȯ�ؼ� �������.
//			String str = new String(buff, 0, len);
//			System.out.println("���� ���� : " + str);
			

			//��� 3]
			// �ַ� ��Ʈ��ũ ó���� �� �� ���� ����ϴ� ���
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte) 'A'); // �迭�� ��� �����͸� 'A'�� ä���.
//			System.out.println(Arrays.toString(buff));
			int len = System.in.read(buff, 10, 3);
			//�غ�� �迭 buff�� 11��° (10���ε���) ����� 100���� �д´�.
			// �ٽø��� 100�ڸ� �Է¹��� �� �ִ�.
			String str = new String(buff, 10, 3);
			str = str.replaceAll("\r\n", "*");
			System.out.println("�Է��� ���ڿ� : " + str);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}
}
