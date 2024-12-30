package day09;

import java.util.Scanner;

public class Boardservice {
	// 1. 멤버변수
	
	// 2. 메소드/멤버함수 - 반환타입 넣어야됨, void = 반환타입이 없다
	void boardAdd(Scanner sc, Board[] boards) {
		System.out.println("> 게시물 등록합니다.");
		System.out.println("제목 : ");
		String title = sc.next();
		System.out.println("내용 : ");
		String content = sc.next();
		System.out.println("작성자 : ");
		String writer = sc.next();
		// 객체 생성
		Board board = new Board();
		board.title = title;
		board.content = content;
		board.writer = writer;
		//객체를 배열에 저장
		boolean saveState = false;
		for(int i = 0; i <= boards.length-1; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				saveState = true;
				break;
			}
		}
				if(saveState) {
					System.out.println("등록성공");
				}else {
					System.out.println("등록 실패");
				}
	}
	void boardPrint(Board[] boards ) {
		System.out.println("> 게시물 출력합니다.");
		for(int i = 0; i <= boards.length-1; i++) {
			Board board = boards[i];
			if(board != null) {	
			System.out.println("제목" + board.title + "내용 : " + board.content + "작성자 : " + board.writer);
		}
	}
	}
}
