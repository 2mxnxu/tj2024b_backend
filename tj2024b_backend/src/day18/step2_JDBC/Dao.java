package day18.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class Dao {

	// + DB 연동 정보
	private String DBURL = "jdbc:mysql://localhost:3306/mydb0103";
	private String DBID = "root";
	private String DBPW = "1234";
	// + JDBC 인터페이스
	private Connection conn;
	// + 싱글톤
	// 1. 디폴트 생성자를 private 한다.
	private Dao() { 
		// *JDBC 연동*
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB서버와 연결 시도
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("[DB연동 성공]");
			
		} catch (ClassNotFoundException e) {
			System.out.println(">> JDBC드라이버가 없습니다" + e);
		} catch(SQLException e) {
			System.out.println(">>DB연동 실패" + e);
		}
	}

		// 2. private static 인스턴스 생성
		private static Dao instance = new Dao();
		// 3. 싱글톤 반환 함수
		public static Dao getInstance() {return instance;}
		
		// 1. insert 함수
		public void insert() {
			
			try {
				// (1) SQL 작성
				String sql = "insert into user(uname, uage) values('유재석', '30')";
				// (2) SQL 기재, prepared , Statement 기재 : 연동된 db에 SQL을 기재하고 기재된 SQL 객체 반환
				PreparedStatement ps =  conn.prepareStatement(sql);
				// (3) 기재된 SQL 실행 .executeUpdate() : 현재 기재된 SQL을 실행하고 처리한 레코드 수 반환 함수. int 반환
				ps.executeUpdate(); // - ctrl + enter 역할
				// (4) SQL 실행 결과 반환 받기
				int count = ps.executeUpdate();
				// (5) 반환 결과 조작
				if(count == 1) {
					System.out.println("[insert 성공]");
					return;
				}
				
			} catch (SQLException e) {
				System.out.println(e);
				System.out.println("[insert 실패]");
			}
		}
		// 2. select 함수
		public void select() {
			
			try {
				// (1) SQL 작성
				String sql = "select * from user";
				// (2) SQL 기재
				PreparedStatement ps = conn.prepareStatement(sql);
				// (3) 기재된 SQL 실행 , .executeQuery() : 현재 기재된 SQL을 실행하고 조회 결과를 조작 가능한 인스턴스 반환 함수. ResertSet 반환
				ps.executeQuery();
				// (4) SQL 실행 결과 반환 받기
				ResultSet rs = ps.executeQuery();
				// (5) 반환 결과 조작 .next() : 조회 결과에서 다음 레코드로 이동 함수, 다음레코드가 존재하면 true 없으면 false 반환
				//rs.next(); // 즉] 3개의 레코드가 존재하면 .next() 함수는 3번 실행 가능하다.
				while(rs.next()) { // 첫번째 레코드부터 마지막 레코드까지 다음 레코드로 하나씩 이동
					// rs.get타입("속성명"); // 현재 레코드의 속성 값 반환 함수. 타입 일치해야 함.
					System.out.printf("%d \t %s \t %s \n", 
							rs.getInt("uno"), rs.getString("uname"), rs.getInt("uage"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			}			
		}
		
		// 3. update 함수
		
		// 4. delete 함수
	
}
