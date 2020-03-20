package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;
/*
 * 	**�ڵ� ����**
 	1. 45 ~ 1�� ��� �迭�� �����.
 	2. �迭�� �ε����� �����ϰ� �߻����� �迭�� ������ �����ϰ� ������ ���̴�.
 		���� �迭�� �ε�����ŭ�� ������ �����ϰ� �߻���Ų��.
 	3. ����� �������ε����� �迭�� ������ 6�� �ݺ��Ͽ� ����Ѵ�.
 */
public class Ex00 {

	public static void main(String[] args) {
		
		// 45 ~ 1 �� ��� �迭 �����
		int[] num = new int[45];
		int no = 45;
		for(int i=0; i<num.length; i++) {
			num[i] = no--; 
		}
		
		int[] randomIndex = new int[6]; // ���������� �ε��� ���� �迭
		String str = "";	// �߻��� �� ��Ƶ� ���ڿ�
		
		// 6�� �ݺ��� �ݺ���
		ot :
		for(int i=0; i<6; i++) {
			//�ε��� �����ϰ� �߻���Ű�� �ε��� �迭�� ���
			randomIndex[i] = (int)(Math.random()*num.length);
			//�ߺ� ��ȣ �����ϱ�
			for(int j=0; j<i; j++) {
				if(randomIndex[i] == randomIndex[j]) {
					i--; 
					continue ot;
				}
			}
			
			//�߻��� �ε����� �迭���� �ϳ��� ���
			str += i+1 + "��° : "+num[randomIndex[i]] + "\n";
		}
		// �����غ���
		JOptionPane.showMessageDialog(null, str);

	}

}
