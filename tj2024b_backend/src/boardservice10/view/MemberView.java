package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {
	// + 싱글톤
	private static MemberView instance = new MemberView();
	private MemberView() {}
	public static MemberView getInstance() {
		return instance;
	}
	private Scanner scan = new Scanner(System.in);
	// 0. (로그인하기 전)메인메뉴 함수
	public void run() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기 :");
			int choose = scan.nextInt();
			if(choose == 1) {				
				signup();
			}else if(choose == 2) {
				login();
			}else if(choose == 3) {
				findId();
			}else if(choose == 4) {
				findPwd();
			}
		}
	}
	public void signup() {
		System.out.println("아이디 입력 : ");
		String mid = scan.next();
		System.out.println("비밀번호 입력 : ");
		String mpwd = scan.next();
		System.out.println("이름 입력 : ");
		String mname = scan.next();
		System.out.println("전화번호 입력 : ");
		String mphone = scan.next();
		MemberDto memberDto = new MemberDto(mid, mpwd, mname, mphone);
		boolean result = MemberController.getInstance().signup(memberDto);
		if(result) {
			System.out.println("[회원가입 성공]");
		}else {
			System.out.println("[회원가입 실패]");
		}
	}
	// 2. 로그인 화면 메소드 // 입력 -> 객체화 -> 컨트롤러에게 전달하고 응답결과 받기 -> 컨트롤러의 결과에 따른 처리
	public void login() {
		System.out.println("아이디 입력 : ");
		String mid = scan.next();
		System.out.println("비밀번호 입력 : ");
		String mpwd = scan.next();
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMpwd(mpwd);
		boolean result = MemberController.getInstance().login(memberDto);
		if(result) {
			System.out.println("로그인 성공");
			//BoardView 메인 메뉴 메소드 호출
			BoardView.getInstance().index();
		}else {
			System.out.println("로그인 실패");
		}
	}
	// 2-2. 로그아웃 화면 메소드
	public void logout() {
		MemberController.getInstance().logout();
		System.out.println("로그아웃 되었습니다.");
	}
	// 3. 아이디찾기 화면 메소드
	public void findId() {
		System.out.println("이름 :");
		String mname = scan.next();
		System.out.println("전화번호 :");
		String mphone = scan.next();
		// 객체화 // 데이터포장(view 에서 controller 이동)
		//MemberDto memberDto = new MemberDto(mname, mphone); // 오류 new 키워드 뒤로 생성자가 오는데 클래스에 선언된(매개변수가 일치한) 생성자만 가능
			// 1. 클래스에서 매개변수 2개의 생성자 만듬
			// 2. 디폴트 생성자로 인스턴스 생성후 setter로 값을 넣는다
		MemberDto memberDto = new MemberDto();
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		// 컨트롤러에게 전달(request/요청/매개변수) 하고 응답(response/응답/리턴) 결과 받기 
		String result = MemberController.getInstance().findId(memberDto);
		// 컨트롤러의 결과에 따른 결과 처리
		if(result != null) {
			System.out.println("찾은아이디 : " + result);
		}else {
			System.out.println("동일한 회원 정보가 없습니다.");
		}
	}
	// 4. 비밀번호찾기 화면 메소드
	public void findPwd() {
		System.out.println("아이디 :");
		String mid = scan.next();
		System.out.println("전화번호 :");
		String mphone = scan.next();
		// 객체화 // 데이터포장(view 에서 controller 이동)
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMphone(mphone);
		// 컨트롤러에게 전달
		String result = MemberController.getInstance().findPwd(memberDto);
		// 컨트롤러의 결과에 따른 결과 처리
		if(result != null) {
			System.out.println("찾은비밀번호 : " + result);
		}else {
			System.out.println("동일한 회원 정보가 없습니다.");
		}
	}
	// 6. 내정보 보기
	public int myInfo() {
		//받는곳 = MemberController.getInstance().myInfo(주는곳);
		MemberDto result = MemberController.getInstance().myInfo();
		System.out.println("========= 마이 페이지 =========");
		System.out.println("mid" + result.getMid());
		System.out.println("mname" + result.getMname());
		System.out.println("mphone" + result.getMphone());
		System.out.println("mdate" + result.getMdate());
		
		while(true) {
		System.out.println("1.회원수정 2.회원탈퇴 3.뒤로가기 : ");
		int choose2 = scan.nextInt();
		if( choose2 == 1 ) { }
		else if( choose2 == 2 ) { 
			int state = delete();
			if( state == 0 ) { return 0; }
			} 
			else if( choose2 == 3 ) { break; } // 메뉴에서 무한반복 탈출 // w end -> f end 
		} 
		return 1;
	} 
	// 7. 회원탈퇴
	public int delete() {
		System.out.println("정말 회원 탈퇴 하실건가요? 예 : 0, 취소 : 1");
		int choose2 = scan.nextInt();
		if(choose2 == 0) {
			MemberController.getInstance().delete();
			return 0; // 탈퇴함
			
		}
		return 1; // 탈퇴 안함
	}
	
}

	