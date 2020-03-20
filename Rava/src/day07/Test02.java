package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;
/*
 	±Ì¿∫∫πªÁ
 */
public class Test02 {
	public Test02() {
		exec1();
		exec2();
	}
	public static void main(String[] args) {
		new Test02();
	}
	public void exec1() {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num2 = new int[20];
		
		System.arraycopy(num1, 5, num2, 10, num1.length-5);
		
		num1[7] = 77;
		String msg = "num1\t: "+Arrays.toString(num1) + "\nnum2\t: " + Arrays.toString(num2);
		JOptionPane.showMessageDialog(null, msg);		
		}
	
	public void exec2() {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num2 = new int[20];
		
		for(int i=0; i<5; i++) {
			num2[10+i] = num1[5+i];
		}
		num1[7] = 77;
		String msg = "num1\t: "+Arrays.toString(num1) + "\nnum2\t: " + Arrays.toString(num2);
		JOptionPane.showMessageDialog(null, msg);
	}
}
