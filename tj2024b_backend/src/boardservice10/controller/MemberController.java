package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// + 싱글톤
		private static MemberController instance = new MemberController();
		private MemberController() {}
		public static MemberController getInstance() {return instance;}
		
	// 1. 회원가입 컨트롤러
		public int signup(MemberDto memberDto) {
			// * 다양한 유효성검사 넣을 예정
			// 1. 아이디 최대, 최소 길이 체크 : 사용자로부터 입력받은 아이디의 길이가 5미만 이거나 30을 초과하면 실패
			if(memberDto.getMid().length()<5 || memberDto.getMid().length() > 30) {
				return 1;
			}
			// 2. 아이디 중복 검사
			if(MemberDao.getInstance().check("mid", memberDto.getMid())) {
				return 7;
			}
			// 3. 비밀번호 길이 검사
			if(memberDto.getMpwd().length() < 5 || memberDto.getMpwd().length() > 30) {
				return 2;
			}
			// 4. 이름 길이 검사
			if(memberDto.getMname().length() < 2 || memberDto.getMname().length() > 20) {
				return 3;
			}
			// 5. 연락처 - 검사, 길이검사
			//if(memberDto.getMphone().split("-").length == 3) {
			String [] phones = memberDto.getMphone().split("-");
			if(phones.length != 3 || memberDto.getMphone().length() != 13) {
				return 4;
			}
			// 6. 연락처 중복검사
			if(MemberDao.getInstance().check("mphone", memberDto.getMphone())) {
				return 7;
			}
			
			boolean result = MemberDao.getInstance().signup(memberDto);
			if (result) return 5;
			else {return 6;}
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
		public boolean update(MemberDto memberDto) {
			memberDto.setMno(loginMno);
			boolean result = MemberDao.getInstance().update(memberDto);
			return result;
		}
		
		
		
}