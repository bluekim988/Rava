package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	����]
 		�ζ� �� ������ ���� �迭�� ���
 		���� ��ȣ���� �����ؼ�
 		��� �����͸� ����غ���.
 		
 		�ζ� �� ������
 			1 ~ 45 ������ ���ڰ� 6�� �ʿ��ϴ�.
 */
public class ArraySoft01 {

	public static void main(String[] args) {
		// ���� ���� �迭 6�� ����
		int[] lotto = new int[6];
		//���� ���� 6�� �����ؼ� ���;
		ot :
		for(int i=0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45-1+1))+1;
			// �������� ������ ã�ƺ���
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue ot;
				}
			}
			// ���� ���ڰ� ���� ���ڿ� ���� ������ �迭�� ��� ���� �ʱ�ȭ��Ű��
			lotto[i] = no;
		}
		//��ȣ Ȯ���غ���
		JOptionPane.showMessageDialog(null, Arrays.toString(lotto));
	
		//�������� �����ϱ�
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println();
		//���ĵ� ���� ����ϱ�
		JOptionPane.showMessageDialog(null,  "<html><b style=\"color: red;\">�ڡڡ� ��÷ ���� ��ȣ �ڡڡ�</b></html>\n\t"+Arrays.toString(lotto), "*********", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
