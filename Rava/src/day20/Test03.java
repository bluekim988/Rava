package day20;

import java.util.*;
import java.sql.*;
import javax.swing.*;

/*
 	ȸ������
 		�̸�, ���̵�, ����, �ƹ�Ÿ��ȣ
 	�� ��ȸ�ؼ� �����ּ���.
 */
public class Test03 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Test03() {
		dbInit();
		
		String sql = "SELECT name, id, gen , ano FROM member WHERE isshow = 'Y' ";
		StringBuffer buff = new StringBuffer();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				buff.append(rs.getString("name") + " | ");
				buff.append(rs.getString("id") + " | ");
				buff.append(rs.getString("gen") + " | ");
				buff.append(rs.getInt("ano") + " \n ");
			}
			
			// ��� ���
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void dbInit() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
