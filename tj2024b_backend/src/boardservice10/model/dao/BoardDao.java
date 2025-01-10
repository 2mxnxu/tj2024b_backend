package boardservice10.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.model.dto.BoardDto;

public class BoardDao extends Dao {
	private static BoardDao instance = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return instance;
	}
	// 전체 게시물 SQL 처리 코드
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		// 조회된 레코드 하나씩 저장하여 여러개 레코드를 저장하는 리스트 객체
		try {
			String sql = "select b.* , c.cname , m.mid "
					+ " from board as b inner join category as c on b.cno = c.cno "
					+ " inner join member as m on b.mno = m.mno";
			PreparedStatement ps;
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				int bview = rs.getInt("bview");
				String bdate = rs.getString("bdate");
				int mno = rs.getInt("mno");
				int cno = rs.getInt("cno");
				BoardDto boardDto = new BoardDto(bno, btitle, bcontent, bview, bdate, mno, cno);
				// 생성된 객체를 리스트에 담기
				boardDto.setCname(rs.getString("cname"));
				boardDto.setCname(rs.getString("mid"));
				
				list.add(boardDto);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}
	// 개별출력 select * from board where bno =?;
	public BoardDto findById(int bno) {
		try {
			String sql = "select b.* , c.cname , m.mid "
					+ " from board as b inner join category as c on b.cno = c.cno "
					+ " inner join member as m on b.mno = m.mno "
					+ " where b.bno = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				BoardDto boardDto = new BoardDto(
						rs.getInt("bno") , rs.getString("btitle") , 
						rs.getString("bcontent") , rs.getInt("bview") ,
						rs.getString("bdate") , rs.getInt("mno"),
						rs.getInt("cno" ));
				boardDto.setCname( rs.getString("cname" ) );
				boardDto.setMid( rs.getString("mid") );
				
				return boardDto;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return null;
	}
}
