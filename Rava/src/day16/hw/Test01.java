package day16.hw;

import java.util.ArrayList;


public class Test01 {
	ArrayList<IncrepasIO> cls = new ArrayList<IncrepasIO>();

	public Test01() {
		inputIO();
		
		System.out.println("리스트 사이즈 : " + cls.size());
		for(IncrepasIO i : cls) {
			System.out.println(i.toString());
		}
		
		cls.removeIf(increpasio -> increpasio.getGroup().equals("A"));
		System.out.println("=======removeIf==========");
		System.out.println("리스트 사이즈 : " + cls.size());
		for(IncrepasIO i : cls) {
			System.out.println(i.toString());
		}
		
		
		
	}

	public void inputIO() {
		IncrepasIO inst1 = new IncrepasIO();
		inst1.setName("김종형");
		inst1.setNum("010-1111-1111");
		inst1.setGroup("A");
		cls.add(inst1);
		
		IncrepasIO inst2 = new IncrepasIO();
		inst2.setName("반장님");
		inst2.setNum("010-2222-2222");
		inst2.setGroup("A");
		cls.add(inst2);
		
		IncrepasIO inst3 = new IncrepasIO();
		inst3.setName("팀장님");
		inst3.setNum("010-3333-3333");
		inst3.setGroup("B");
		cls.add(inst3);
		
		

	}

	public static void main(String[] args) {
		new Test01();

	}

}
