package day15;

public class Test01 {

	public Test01() {
		Member hw = new Member();
		setMembData(hw);
		System.out.println(hw);
	}
	
	// Member�� �����͸� ä���ִ� �Լ�
	
	public void setMembData(Member m) {
		m.setMno(1242);
		m.setName("Woo");
		m.setId("whw");
		m.setMail("woo@increpas.com");
	}
	public static void main(String[] args) {
		new Test01();
		
	}
	
	

}
