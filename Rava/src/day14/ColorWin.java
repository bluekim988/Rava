package day14;

/**
 * �� Ŭ������ JButton�� �̺�Ʈ ó���� �� �� ����ϴ� ���� ���� Ŭ������ ���� ������ Ŭ���� 
 * @
 * @author	������
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
 	�ڹٿ��� GUI �� ����� �ִ� ������ ���� �ϰ� �ִµ�
 	javax.swing ��Ű���� java.awt ��Ű�� �̴�.
 	
 	�� Ŭ���������� Windows�� â�� ������ִ� JFrame �� ����ؼ� â�� �����
 	���ο� JPannel�� �̿��ؼ� ä����
 	JPannel�� ������ �����ϰ� 
 	�׸��� JButton�� ����� �ο��غ����� �Ѵ�.
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
		String title = JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���");
		main.frame.setTitle(title);
	}
	
}
