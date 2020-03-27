package day13.figure;

import java.util.ArrayList;
import java.util.Iterator;

public class ExecFigure {

	public static void main(String[] args) {
		ArrayList<Figure> f1 = new ArrayList<Figure>();
		
		
		for(int i=0; i<10; i++) {
			int no = RandomNum.randomInit();
			
			if(no == 1) {
				f1.add(new Circle());
			} else if(no ==2) {
				f1.add(new Triangle());
			} else if(no == 3) {
				f1.add(new Square());
			}
			
			f1.get(i).setArea();
		}
		
		Iterator<Figure> itr = f1.iterator();		
		
		int no = 1;
		while(itr.hasNext()) {
			Figure inst = itr.next();
			
			System.out.println();
			System.out.print(no++ + " ¹ø ");
			inst.toPrint();
		}
		
		/*
		for(Figure f : f1) {
			System.out.println();
			System.out.print(no++ + " ¹ø ");
			f.toPrint();
		}
		*/

	}

}
