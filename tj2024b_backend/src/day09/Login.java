package day09;

import java.util.Scanner;

public class Login {
	void loginStart(Scanner sc, JoinInfo [] joinArr) {
		System.out.println("로그인");
		System.out.println("id를 입력해주세요");
		String LoginId = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String LoginPw = sc.next();
		
		for(int i = 0; i<= joinArr.length-1; i++) {
			if(joinArr[i] != null) {
				
			if(LoginId .equals(joinArr[i].id) && LoginPw .equals(joinArr[i].pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
		}
	}
}
}