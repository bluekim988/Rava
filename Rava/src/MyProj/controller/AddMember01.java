package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;

public class AddMember01 {

	public AddMember01() {
		// 회원 한명을 추가해 보자.
		// 회원 데이터는 VO 에 담아서 넘겨주기로 작성했다.
		MemberVO mVO = new MemberVO();
		mVO.setName("김종형");
		mVO.setId("blue");
		mVO.setPw("12345");
		mVO.setMail("blue@increpas.com");
		mVO.setGen("M");
		mVO.setTel("010-7755-7979");
		mVO.setAno(12);
		
		// 데이터가 준비되었으니 데이터베이스 처리함수를 호출하자
		MemberDAO mDao = new MemberDAO();
		
		// 데이터베이스 처리함수를 호출해준다.
		int cnt = mDao.addMember(mVO);
		
		if(cnt > 0) { 
			JOptionPane.showMessageDialog(null, mVO.getName() + " 가입 성공!");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getName() + " 가입 실패!");
			
		}
	}

	public static void main(String[] args) {
		new AddMember01();

	}

}
