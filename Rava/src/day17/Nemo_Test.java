package day17;

import java.util.*;

public class Nemo_Test {

	public Nemo_Test() {
		TreeSet<Nemo> set = new TreeSet<Nemo>(new Nemo_Comp());
		
		Random rnd = new Random();
		
		for(int i=0; i<10; i++) {
			int hor = rnd.nextInt(16)+5;
			int ver = rnd.nextInt(16)+5;
			set.add(new Nemo(hor, ver));
		}
		
		Iterator<Nemo> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getArea());
		}

	}

	public static void main(String[] args) {
		new Nemo_Test();

	}

}
