package DB;
/**
 * 	�� Ŭ������ �����ͺ��̽� �۾��� ���� JDBC�� ó���� �� �ʿ��� �������� ����� �����ϱ� ���� Ŭ�����̴�.
 * @author		������
 * @since		2020.04.03
 * @version		v.1.0
 * @see			java.sql.*
 */

import java.sql.*;

public class ORCLJDBC {
	
	/*
	 	�� Ŭ������ new ��Ű�� ���� 
	 	�⺻������ ���� �ʿ��� ����̹��ε��� Ŀ�ؼ� ��� �۾��� ���ÿ� ������ ���̴�.
	 */
	
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user;
	private String pw;
	
	public ORCLJDBC() {
		this("hello", "hello");
	}
	
	public ORCLJDBC(String user, String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.user = user;
			this.pw = password;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Connection
	public Connection getCon() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//Statement
	public Statement getSTMT() {
		Statement stmt = null;
		
		try {
			stmt = getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	// PreparedStatement
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = getCon().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// close�Լ�
	public <T>void close(T o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();				
			} else if(o instanceof Statement) {
				((Statement)o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet)o).close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
