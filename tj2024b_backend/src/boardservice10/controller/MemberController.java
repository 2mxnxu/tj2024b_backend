package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// + 싱글톤
		private static MemberController instance = new MemberController();
		private MemberController() {}
		public static MemberController getInstance() {return instance;}
		
	// 1. 회원가입 컴트롤러
		public boolean signup(MemberDto memberDto) {
			boolean result = MemberDao.getInstance().signup(memberDto);
			return result;
		}
}