package day17;

import java.util.Comparator;

public class HwSort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Samgak s1 = (Samgak) o1;
		Samgak s2 = (Samgak) o2;
		
		int result = (int)(s1.getArea() - s2.getArea());
		return result;
	}

}
