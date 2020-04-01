package day16;
import java.util.*;
public class Test08 {

	public Test08() {
		Vector vec = new Vector();
		
		// 모든 종류의 데이터 담기
		vec.add("abcd");
		vec.add(new String("abcd"));
		vec.add(10);
		vec.add(3.14);
		vec.add(new int[] {1,2,3});
		
		// 데이터 꺼내기
		for(Object i : vec) {
			Object o = i;
			if(o instanceof String) {
				System.out.println((String)o);
			} else if(o instanceof Number) {
				System.out.println(((Number) o).doubleValue());
			} else if(o instanceof int[]) {
				System.out.println(Arrays.toString((int[])o));
			}
		}
		System.out.println("----------toStirng------------");
		for(Object i : vec) {
		if(i instanceof int[]) {
			System.out.println(Arrays.toString((int[])i));
			break;
		}
			System.out.println(i.toString());
		}
	}

	public static void main(String[] args) {
		new Test08();

	}

}
