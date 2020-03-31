package day17;

import java.util.Comparator;

public class Nemo_Comp implements Comparator<Nemo> {

	@Override
	public int compare(Nemo o1, Nemo o2) {
		
		return o1.getArea() - o2.getArea();
	}

	

}
