package day13.sub;

import java.util.ArrayList;

public class ExecSub {

	public static class RandomMaker {
		public static int randomNum() {
			return (int)(Math.random() * 50) + 1;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Moyang> exe1 = new ArrayList<Moyang>();
		
		exe1.add(new Samgak());
		exe1.add(new Sagak());
		exe1.add(new Dongle());
		
		for(Moyang m : exe1)  {
			m.toPring();
		}

	}

}
