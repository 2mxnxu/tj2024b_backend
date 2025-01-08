package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sound.midi.MidiChannel;

import boardservice10.model.dto.MemberDto;



public class MemberDao {
	private Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	//+ 싱글톤
	private static MemberDao instance = new MemberDao();
	private MemberDao() {
		try {
			// 1. JDBC 클래스 드라이버 로드 , Class.forName() * 예외처리 try{}catch(){}
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 설정한 경로/계정/비밀번호 로 DB 서버 연동 시도 하고 결과를 ( 구현체 ) 반환 
			conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch (Exception e) {
			System.out.println("[DB 연동 실패]" + e );
		}
	}
	public static MemberDao getInstance() { return instance;} 
	
	// 1. 회원가입 SQL처리 메소드
		public boolean signup(MemberDto memberDto) {
			try {
			// [1] SQL 작성
			String sql = "insert into member(mid, mpwd, mname, mphone) values('"+memberDto.getMid()+"','"+memberDto.getMpwd()+"','"+memberDto.getMname()+"','"+memberDto.getMphone()+"')";
			// [2] DB와 연동된 곳에 SQL기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// [3] 기재된 SQL을 실행 후 결과 받기
			int count = ps.executeUpdate(); 
			// [4] 결과에 따른 처리 및 반환
			if (count == 1 ) {return true;}
			}catch(SQLException e) {
				System.out.println(e);
			}
			return false;
		}
		public String findId(MemberDto memberDto) {
			try { // mname = '유재석' ---> mname = ? : mname는 어떤 값이 들어갈지 정해져 있지 않다. 매개변수
			String sql = "select mid from member where mname = ? and mphone = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				// 매개변수값 대입
				ps.setString(1, memberDto.getMname());
				ps.setString(2, memberDto.getMphone());
			ResultSet rs = ps.executeQuery(); 
			if (rs.next() ) {
				String findMid = rs.getString("mid");
				return findMid;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
			return null;
		}
		public String findPwd(MemberDto memberDto) {
			try {
				String sql = "select * from member where mid = ? and mphone = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, memberDto.getMid());
					ps.setString(2, memberDto.getMphone());
				ResultSet rs = ps.executeQuery(); 
				if (rs.next() ) {
					String findMpwd = rs.getString("mpwd");
					return findMpwd;
				}
			}catch(SQLException e) {
				System.out.println(e);
			}
				return null;
			}
		public int login(MemberDto memberDto) {
			try {
				String sql = "select mno from member where mid = ? and mpwd = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, memberDto.getMid());
					ps.setString(2, memberDto.getMpwd());
				ResultSet rs = ps.executeQuery(); 
				if(rs.next()) {
					int mno = rs.getInt("mno");
					return mno;
				}
			}catch(SQLException e) {
				System.out.println(e);
			}
				return 0;
			}
		public MemberDto myInfo(int loginMno) {
				try {
				String sql = "select * from member where mno = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, loginMno);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					MemberDto memberDto = new MemberDto();
					memberDto.setMid(rs.getString("mid"));
					memberDto.setMname(rs.getString("mname"));
					memberDto.setMdate(rs.getString("mdate"));
					return memberDto;
				}
		} catch(SQLException e) {
			System.out.println(e);
		}
				return null;
		}
			
		public void delete(int loginMno) {
			try {
			String sql = "delete from member where mno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, loginMno);
			int count = ps.executeUpdate();
		} catch(SQLException e) {
			return;
		}
		}
		
		
}

	
