package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {
	// + 싱글톤
	private static BoardController instance = new BoardController();
	private BoardController() {};
	public static BoardController getInstance() {
		return instance;
	}
	// 1. 전체 게시물 컨트롤러 메소드
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		return result;
	}
	public BoardDto findById(int bno) {
		BoardDto boardDto = BoardDao.getInstance().findById(bno);
		return boardDto;
	}
	public boolean write( BoardDto boardDto ) {
		// 현재 로그인 회원의 번호 넣어주기.
		int loginMno = MemberController.getInstance()
				.getLoginMno(); // 현재 로그인된 회원번호 호출 
		
		boardDto.setMno( loginMno ); // dto 에 넣어주기 
		return BoardDao.getInstance().write( boardDto );
	} 
	public ArrayList<BoardDto> categoryAll( ){
		return BoardDao.getInstance().categoryAll();
	}
	public boolean update(BoardDto boardDto) {
		// + 유효성 검사 : 현재 로그인된 작성자가 작성한 글인지 체크
		int loginMno = MemberController.getInstance().getLoginMno(); // 현재로그인된 회원
		int currentBno = boardDto.getBno();
		boolean result = BoardDao.getInstance().writeCheck(currentBno, loginMno);
		if(result == false) {
			return false;
		}
		boolean result2 = BoardDao.getInstance().update(boardDto);
		return result2;
	}
	public boolean delete( int bno ) {
		int loginMno = MemberController.getInstance().getLoginMno();
		boolean result = BoardDao.getInstance().writeCheck(bno, loginMno);
		if( result == false ) { return false; }
		boolean result2 = BoardDao.getInstance().delete( bno );
		return result2;
	}
	
	
	
} 
