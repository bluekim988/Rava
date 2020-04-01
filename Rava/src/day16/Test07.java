package day16;
import java.util.*;
public class Test07 {

	public Test07() {
		Vector vec = new Vector(20);
		System.out.println("vec.capacity() : "+vec.capacity());
		for(int i=0; i< 11; i++) {
			vec.add(i);
		}
		for(Object o : vec) {
			System.out.println((int)o);
		}
		System.out.println("vec.capacity() : "+vec.capacity());
		
		for(int i=0; i<10; i++) {
			vec.add(i);
		}
		System.out.println("vec.capacity() : "+vec.capacity());
	}

	public static void main(String[] args) {
		new Test07();

	}

}
