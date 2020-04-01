package exam;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
 	JOptionPane 으로 숫자를 입력받아서
 	배열을 만들고
 	배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서
 	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
 	단, 합을 구하는 기능은 함수를 만들어서 처리하세요.
 */

public class Ex01 {
	ArrayList<Integer> sum = new ArrayList<Integer>();

	public Ex01() {

		for (int i = 0; i < 5; i++) {
			try {
				String strNum = JOptionPane.showInputDialog((i + 1) + " 번쨰 번호 입력");
				sum.add(addNum(strNum));

			} catch (NumberFormatException e) {
				e.printStackTrace();
				i--;
			}
		}
		summer(sum);
	}

	public int addNum(String str) throws NumberFormatException {
		int num = Integer.parseInt(str);
		return num;

	}

	public void summer(List<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i).intValue();
		}

		System.out.println("총 합 : " + sum);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
