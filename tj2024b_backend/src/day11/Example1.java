package day11;

import java.util.Scanner;

import day11.Join.Login;

/*
 	자바과제 11 : 회원제 게시판 
 	- 초기메뉴는 로그인과 회원가입만 제공
 	- 게시판은 로그인 성공 시 게시물 등록 및 게시물 출력 가능
 		- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
 	
 	
 */
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Join join = new Join();
		Login login = join.new Login();
		JoinInfo [] joinArr = new JoinInfo[100];
		BoardDto[] boards= new BoardDto[100];
		BoardService bs = new BoardService();

		while(true) {
			System.out.println("1. 회원가입 2. 로그인 : ");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				join.joinAdd(sc,joinArr);
			}else if(choose == 2) {
				boolean isLoggedIn = login.loginStart(sc, joinArr); ;
				if(isLoggedIn) {
					while(true) {
						System.out.println("1. 등록 2. 출력 : ");
						int choose1 = sc.nextInt();
		
						if(choose1 == 1) {
							bs.boardAdd(sc, boards);
						}else if(choose1 ==2 ) {
							bs.boardPrint(boards, joinArr);
						}
					}
				}
			}
			
		}
		
		
	}
			

	}

