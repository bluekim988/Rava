package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test02 {
	
	public static void main(String[] args) {
		Random rand1 = new Random(2);
		
		for(int i=0; i<10; i++) {
			int no = rand1.nextInt(100);
			System.out.println(no);
		}
	}

}
