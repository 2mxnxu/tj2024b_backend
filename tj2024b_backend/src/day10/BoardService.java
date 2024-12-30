package day10;

import java.util.Scanner;

public class BoardService {
		// 1. 등록함수, 실행조건 : 주메뉴에서 1 입력시 매개변수 : 입력객체 , 반환값 : 없음
	void boardAdd(Scanner sc, Board [] boards) {
		System.out.println("제목");
		String title = sc.next();
		System.out.println("내용");
		String content = sc.next();
		System.out.println("작성자");
		String writer = sc.next();
		//--------생성자를 이용한 객체 생성----------------
		Board board = new Board(title, content, writer);
		for (int i = 0; i<= boards.length-1; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
		// 2. 출력함수, 실행조건 : 주메뉴에서 2입력시 매개변수 : 게시물 목록 , 반환값 : 없음
	void boardPrint(Board [] boards) {
		for (int i = 0; i<= boards.length-1; i++) {
			if(boards[i] == null) {
				System.out.println("순번 : " +(i+1)+ "제목 :" +boards[i].title+ "내용 :" +boards[i].title+"작성자 :" + boards[i].writer);
			}
		}
	}
}
