package day16;

import java.text.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		//ChoiceFormat을 만들때 limits, formats를 하나로 만들 수도 있다.
		/*
		  	만드는 형식
		  		60#D	( 60 >= ) 의 의미
		  		70<C	( 70 > ) 의 의미
		  		
		  		이것을 | 을 이용해서 연결해 사용하면 된다.
		 */
		
		String pattern = "0#F | 60#D | 70#C | 80#B | 90#A";
		// 60#D의 의미는 60 보다 크거나 같으면 다음 숫자(70)보다는 작은 경우는 D로 처리한다.
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		while(true) {
			String sno = JOptionPane.showInputDialog("점수를 입력하세요! \n종료: q");
			if(sno.equals("q"))
				break;
			
			int score = 0;
				score = Integer.parseInt(sno);
			try {
				
			} catch(Exception e ) {
				JOptionPane.showMessageDialog(null, "잘못된 점수입니다");
				continue;
			}
			
			String grade = form.format(score);
			
			JOptionPane.showMessageDialog(null, "점수: " + score + "\n학점: " + grade);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}
}
