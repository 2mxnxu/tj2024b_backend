package day18.step2_JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 {
	public static void main(String[] args) {
		
		// [1] DB 연동
		try {
			// 1. mySQL JDBC 클래스 존재하는지 로드/불러오기, Class.forName() : 클래스 로드 함수, 일반 예외처리
			Class.forName("com.mysql.cj.jdbc.Driver");
			// com.mysql.cj.jdbc : 패키지 경로 , Driver : 클래스
			// mysql : com.mysql.cj.jdbc.Driver
			// oracle : oracle.jdbc.driver.OracleDriver
			//2. db서버와 연동 시도
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0103", "root", "1234");
				// DriverManager : DB서버와 연동하는 클래스, import java.sql
					// -> 연동 함수 : .getConnectin("DB서버URL", "DB계정명", "DB비밀번호");
					// --> 로컬 getConnection("jdbc:mysql://localhost:3306/DB명", "root", "1234");
			System.out.println("[DB연동성공]");
		} catch (ClassNotFoundException e) {
			System.out.println("프로젝트내 jbdc 드라이버가 존재하지 않습니다." + e);
		} catch (SQLException e) {
			System.out.println("DB연동 실패 : " + e);
		}
		
		
	}
}
