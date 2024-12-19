package day09;

import java.util.Scanner;

public class Join {

	void joinAdd(Scanner sc, JoinInfo [] joinArr) {
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		System.out.println("닉네임 : ");
		String name = sc.next();
		
		JoinInfo join = new JoinInfo();
		join.id = id;
		join.pw = pw;
		join.name = name;
		
		boolean idExists = false;
	    for (int i = 0; i < joinArr.length; i++) {
	        if (joinArr[i] != null && joinArr[i].id.equals(id)) {
	            idExists = true;
	            break;
	        }
	    }

	    if (idExists) {
	        System.out.println("아이디 중복입니다.");
	        return; 
	    }
		
		boolean saveState = false;
		for(int i = 0; i <= joinArr.length-1; i++) {
			if(joinArr[i] == null) {
				joinArr[i] = join;
				saveState = true;
				break;
			}
			
		}
		if(saveState) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
	}
}
