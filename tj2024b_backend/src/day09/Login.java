package day09;

import java.util.Scanner;

public class Login {
	void loginStart(Scanner sc, JoinInfo [] joinArr) {
		System.out.println("로그인");
		System.out.println("id를 입력해주세요");
		String LoginId = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String LoginPw = sc.next();
		
		boolean login = false;
		
		for(int i = 0; i<= joinArr.length-1; i++) {
			if(joinArr[i] != null) {
			if(LoginId .equals(joinArr[i].id) && LoginPw .equals(joinArr[i].pw)) {
				login = true;
				break;
			}

		}
	}
		if(login) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
}
}

// String 비교할때는 무조건 .equals() 제발!!!!!!