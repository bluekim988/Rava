package day14;

public class Test01_main {
	String name;
	int age;
	Test01_01 t;
	
	public Test01_main() {
		t = new Test01_01();
		Test01 t1 = t.t1;
		t1.name = "È«±æµ¿";
		t1.age = 17;
		System.out.println(t1.toString());
	}
	
	public Test01_main(int age, String name) {
		this.age = age;
		this.name = name;
		t = new Test01_01(this);
		System.out.println(t.t1.toString());
	}

	public static void main(String[] args) {
		Test01_main ttt = new Test01_main(15, "½ºÄ±");
		new Test01_main(20, "Å·");

	}

}
