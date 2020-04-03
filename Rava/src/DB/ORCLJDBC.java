package DB;
/**
 * 	이 클래스는 데이터베이스 작업을 위한 JDBC를 처리할 때 필요한 공통적인 기능을 제공하기 위한 클래스이다.
 * @author		김종형
 * @since		2020.04.03
 * @version		v.1.0
 * @see			java.sql.*
 */

import java.sql.*;

public class ORCLJDBC {
	
	/*
	 	이 클래스를 new 시키는 순간 
	 	기본적으로 가장 필요한 드라이버로딩과 커넥션 얻는 작업을 동시에 실행할 것이다.
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
	
	// close함수
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
