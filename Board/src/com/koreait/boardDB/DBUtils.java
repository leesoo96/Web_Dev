package com.koreait.boardDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

	public static Connection getConn() throws ClassNotFoundException, SQLException{
//		localhost -> 내 컴퓨터
		final String URL = "jdbc:mysql://localhost:3306/board_1?serverTimezone=UTC";
		final String USER = "root";
		final String PW = "koreait2020";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 로딩 목적

		Connection conn = null;

		conn = DriverManager.getConnection(URL, USER, PW);
		
		System.out.println("데이터베이스 연결 성공");
		
		return conn;
	}

//	자원 해제
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(conn != null) {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		if(pstmt != null) {
			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		close(conn, pstmt);
		
		if(rs != null) {
			try {rs.close();} catch (Exception e) {e.printStackTrace();}
		}
	}
}
