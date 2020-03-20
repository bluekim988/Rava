package day03;

class EJin {
	String str = "";
	
	public String abc(int no) {
		
		str += no % 2;
		if(no > 1) {
		return abc(no / 2);
		} 
		return str;
	}
}

public class Hw02 {

	public static void main(String[] args) {
		EJin bl = new EJin();
		 bl.abc(10);
		 String result = "0000000" + new StringBuffer(bl.str).reverse().toString();
		System.out.printf("%8s",result);
	}
}
