package day16;

import java.text.ChoiceFormat;

import javax.swing.JOptionPane;

public class Test03 {

	
	public Test03() {
		double[] limits = {0, 60, 70, 80, 90};
		// limits를 만들때 주의사항
		// 반드시 오름차순 정렬되어야 한다.
		String[] formats = {"F", "D", "C", "B", "A"};
		// 이때 반드시 limits와 갯수를 일치 시켜야 한다.
		
		ChoiceFormat c = new ChoiceFormat(limits, formats);
		
		// 점수를 입력받아 학점을 처리해보기
		while(true) {
			String str = JOptionPane.showInputDialog("점수 입력\n종료는 q입력");
			if(str.equals("q"))
				break;
			int score = 0;
			try {
				score = Integer.parseInt(str);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "다시 입력하세요");
				continue;
				
			}
			String grade = c.format(score);
			JOptionPane.showMessageDialog(null, "점수 " + score + "\n학점 " + grade);
		}	
	}
	
	
	public static void main(String[] args) {
		new Test03();
		
	}

}
