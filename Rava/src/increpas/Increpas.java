package increpas;

import java.util.ArrayList;
import java.util.Scanner;

class PhoneBook {
	String name;
	String num;
	public PhoneBook(String name, String num) {
		this.name = name;
		this.num = num;
	}
	public void showInfo() {
		System.out.println("INCREPAS  MEMBER");
		System.out.println("name : " + name);
		System.out.println("number : " + num);
	}
}
class WrongException extends Exception {
	public WrongException() {
		super();
	}
	public void showWrong() {
		System.out.println("잘못된 검색입니다.");
	}
}
class BookManager {
	ArrayList<PhoneBook> user = new ArrayList<PhoneBook>();
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public void inputData() {
		System.out.println("정보 입력을 시작합니다");
		System.out.print("name : ");
		String name = sc.nextLine();
		System.out.print("number : ");
		String num = sc.nextLine();
		
		user.add(new PhoneBook(name, num));
		System.out.println("정보 입력이 완료되었습니다");
	}
	public void searchData() {
		
		System.out.println("정보 검색을 시작합니다");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		try {
			if(user.isEmpty()) 
				throw new WrongException();
			
			for(PhoneBook i : user) {	
				if(i.name.equals(name)) {
					i.showInfo();
				}	else {
					System.out.println("잘못된 검색입니다.");
					return;
				}
			}
		}
		catch(WrongException e)	{
				e.showWrong();
		}		
	}
	public void deleteData() {
		System.out.println("정보 삭제를 시작합니다.");
		System.out.print("이름 : ");
		String name = sc.nextLine();

		try {
			if(user.isEmpty()) 
				throw new WrongException();
			
			for(int i=0; i<user.size();	i++) {
				if(user.get(i).name.equals(name)) {
					user.remove(i);
				} else {
					System.out.println("잘못된 검색입니다.");
					return;
				}
			}
		}
		catch(WrongException e) {
			e.showWrong();
		}
	}
}

class InitMenu {
	public static void showInitMenu() {
		System.out.println("프로그램을 시작합니다");
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 검색");
		System.out.println("3. 정보 삭제");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
	}
}

public class Increpas {

	public static void main(String[] args) {
		BookManager manager = new BookManager();
		
		while(true) {
			InitMenu.showInitMenu();
			int no = manager.sc.nextInt();
			manager.sc.nextLine();
			
			switch(no) {
			case 1 :
				manager.inputData();
				break;
			case 2 :
				manager.searchData();
				break;
			case 3 :
				manager.deleteData();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}
}
