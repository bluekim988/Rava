package day10;

import java.util.Arrays;

/*
 ���� 2]
	10���� ������ ������ �Է��� �迭�� �����
	�� �迭�� ��� ������
	����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.
 */

public class Ex02 {

	
	public static void main(String[] args) {
		int[] st1 = new int[10];
		
		Cls1 cls = new Cls1(st1);
		
		cls.setSum(st1);
		
		System.out.println(Arrays.toString(st1));
		cls.showVal();
		

	}

}
