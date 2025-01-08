package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// + 싱글톤
		private static MemberController instance = new MemberController();
		private MemberController() {}
		public static MemberController getInstance() {return instance;}
		
	// 1. 회원가입 컨트롤러
		public boolean signup(MemberDto memberDto) {
			boolean result = MemberDao.getInstance().signup(memberDto);
			return result;
		}
		
		// 2. 로그인 컨트롤러 메소드
		private int loginMno = 0;
		public int getLoginMno() {
			return loginMno;
		}
		
		public boolean login(MemberDto memberDto) {
			int result = MemberDao.getInstance().login(memberDto);
			// boolean --> int 변경한 이유 : 로그인 성공한 회원번호를 내부적으로 저장하기 위해
			if(result > 0) {
				loginMno = result;
				return true;
			}else {
			return false;
		}
		}
		public void logout() {
			loginMno = 0;
		}
		
		public String findId(MemberDto memberDto) {
			String result = MemberDao.getInstance().findId(memberDto);
			return result;
		}
		public String findPwd(MemberDto memberDto) {
			String result = MemberDao.getInstance().findPwd(memberDto);
			return result;
		}

		public MemberDto myInfo() {
			MemberDto result = MemberDao.getInstance().myInfo(loginMno);
			return result;
		}
		public void delete() {
			MemberDao.getInstance().delete(loginMno);
			
		}
		
		
		
}