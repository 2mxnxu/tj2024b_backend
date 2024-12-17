package day07;

import java.util.Scanner;

/*
 	주제 : 회원 서비스 구현하기
 	- 회원 총 3명까지 저장
 	- 회원정보 아이디, 비밀번호, 닉네임
 	- 회원클래스 정의 회원객체 활용하여 구현
 	- 1회원가입 2로그인
 */
public class Example3 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberInfo member1 = new MemberInfo();
	    member1.id = null;
	    member1.pw = null;
	    member1.name = null;
	    MemberInfo member2 = new MemberInfo();
	    member2.id = null;
	    member2.pw = null;
	    member2.name = null;
	    MemberInfo member3 = new MemberInfo();
	    member3.id = null;
	    member3.pw = null;
	    member3.name = null;
	    
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int menu = sc.nextInt();
			if(menu == 1) {
				
				System.out.println("회원가입");
				System.out.println("id를 입력해주세요");
				String id = sc.next();
				System.out.println("비밀번호를 입력해주세요");
				String pw = sc.next();
				System.out.println("닉네임을 입력해주세요");
				String name = sc.next();
				if(member1.id == null) {
					member1.id = id;
					member1.pw = pw;
					member1.name = name;
					System.out.println("회원가입 완료");
				}else if(member2.id == null) {
					member2.id = id;
					member2.pw = pw;
					member2.name = name;
					System.out.println("회원가입 완료");

				}else if(member3.id == null) {
					member3.id = id;
					member3.pw = pw;
					member3.name = name;
					System.out.println("회원가입 완료");

				}
			}
			else if(menu == 2) {
				System.out.println("로그인");
				System.out.println("id를 입력해주세요");
				String LoginId = sc.next();
				System.out.println("비밀번호를 입력해주세요");
				String LoginPw = sc.next();
				
				if (member1.id != null && member1.id.equals(LoginId) && member1.pw.equals(LoginPw)) {
                    System.out.println(member1.name + "님, 로그인 성공!");
                } else if (member2.id != null && member2.id.equals(LoginId) && member2.pw.equals(LoginPw)) {
                    System.out.println(member2.name + "님, 로그인 성공!");
                } else if (member3.id != null && member3.id.equals(LoginId) && member3.pw.equals(LoginPw)) {
                    System.out.println(member3.name + "님, 로그인 성공!");
                } else {
                    System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.");
                }
			}
			
			
			
		}

	}

}
