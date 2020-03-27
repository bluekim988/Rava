package day14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TriangleExec {
	ArrayList<Triangle> list = new ArrayList<Triangle>();

	public TriangleExec() {
		
		try {
			setTriangleInst();
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			JOptionPane.showMessageDialog(null, "실행이 종료됩니다.");
		}
		
		JOptionPane.showMessageDialog(null,"1번 " + list.get(0).toString() );
		JOptionPane.showMessageDialog(null,"2번 " + list.get(1).toString() );
		
		String str = "삼각형1과 삼각형2는  " + (list.get(0).equals(list.get(1)) ? "같은 삼각형 입니다." : "다른 삼각형 입니다." );
		
		JOptionPane.showMessageDialog(null, str);
		
		
	}
	
	public void setTriangleInst() throws NumberFormatException{
		for(int i = 0; i < 2; i++) {
			String numStr = JOptionPane.showInputDialog("밑변을 입력하세요");
			String numStr2 = JOptionPane.showInputDialog("높이를 입력하세요");
			int num = Integer.parseInt(numStr);
			int num2 = Integer.parseInt(numStr2);
			
			if(num < 0 || num2 < 0) {
				throw new NumberFormatException("첫번쨰 입력" + num + "두번쨰 입력  " + num2);
			}
			
			list.add(new Triangle(num, num2));
		}
	}
	public static void main(String[] args) {
		new TriangleExec();

	}

}
