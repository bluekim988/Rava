package day14;

/**
 * 이 클래스는 JButton의 이벤트 처리를 할 때 사용하는 무명 내부 클래스의 사용법 연습용 클래스 
 * @
 * @author	김종형
 * @since	2020.03.26
 * @version	v.1.0
 * @see
 * 			JFrame, JPanel, JButton, ActionListener
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorWin {
/*
 	자바에서 GUI 를 만들수 있는 도구를 제공 하고 있는데
 	javax.swing 패키지와 java.awt 패키지 이다.
 	
 	이 클래스에서는 Windows에 창을 만들어주는 JFrame 을 사용해서 창을 만들고
 	내부에 JPannel을 이용해서 채운후
 	JPannel의 색상을 변경하고 
 	그리고 JButton에 기능을 부여해보도록 한다.
 */
	
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;
	
	public ColorWin() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Blue");
		
		pan1 = new JPanel();
		pan1.setBackground(Color.lightGray);
		pan2 = new JPanel();
		pan2.setBackground(Color.WHITE);
		
		cBtn = new JButton("Color");
		eBtn = new JButton("EXIT");
		tBtn = new JButton("Title");
		
		TitleEvt evt1 = new TitleEvt(this);
		tBtn.addActionListener(evt1);
		
		eBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		cBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int red = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				
				Color color = new Color(red, green, blue);
				
				pan1.setBackground(color);
				pan2.setBackground(color);
			}
		});
		
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new ColorWin();

	}

}

class TitleEvt implements ActionListener {
	ColorWin main;
	public TitleEvt() {}
	public TitleEvt(ColorWin main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String title = JOptionPane.showInputDialog("타이틀을 입력하세요");
		main.frame.setTitle(title);
	}
	
}
