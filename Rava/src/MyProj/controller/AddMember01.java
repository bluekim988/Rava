package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;

public class AddMember01 {

	public AddMember01() {
		// ȸ�� �Ѹ��� �߰��� ����.
		// ȸ�� �����ʹ� VO �� ��Ƽ� �Ѱ��ֱ�� �ۼ��ߴ�.
		MemberVO mVO = new MemberVO();
		mVO.setName("������");
		mVO.setId("blue");
		mVO.setPw("12345");
		mVO.setMail("blue@increpas.com");
		mVO.setGen("M");
		mVO.setTel("010-7755-7979");
		mVO.setAno(12);
		
		// �����Ͱ� �غ�Ǿ����� �����ͺ��̽� ó���Լ��� ȣ������
		MemberDAO mDao = new MemberDAO();
		
		// �����ͺ��̽� ó���Լ��� ȣ�����ش�.
		int cnt = mDao.addMember(mVO);
		
		if(cnt > 0) { 
			JOptionPane.showMessageDialog(null, mVO.getName() + " ���� ����!");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getName() + " ���� ����!");
			
		}
	}

	public static void main(String[] args) {
		new AddMember01();

	}

}
