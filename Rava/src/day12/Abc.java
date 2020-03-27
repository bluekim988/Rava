package day12;

class A {
	public void abc() {
		System.out.println("a");
	}
}

class Ab extends A{
	public void abc() {
		System.out.println("ab");
	}
}


public class Abc extends Ab{

	public void xyz() {
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		A a = new Abc();
		a.abc();
		((Abc)a).xyz();
	}

}
