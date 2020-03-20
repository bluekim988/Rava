package day05;

import java.util.Random;

public class Hw12 {

	public static void main(String[] args) {
		Random num = new Random();
		
		for(int i=0; i<6; i++) {
			int no = num.nextInt(44)+1;
			System.out.println(no);			
		}
	}

}
