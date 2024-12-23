package day11;

import java.util.Scanner;

public class BoardService {
	
	// 1. 멤버변수 
	// 2. 생성자
	// 3. 메소드
	// 3-1 게시물 등록
	public void boardAdd( Scanner sc, BoardDto[] boards) {
		System.out.println("제목 : "); String title = sc.next();
		System.out.println("내용 : "); String content = sc.next();
		
	// 생성자를 이용하여 객체 생성
		BoardDto boardDto = new BoardDto(title, content);
		// * 배열에 저장
		boolean saveState = false;
		for(int i = 0; i <= boards.length-1; i++) {
			if(boards[i] == null) {
				boards[i] = boardDto;
				saveState = true;
				break;
			}
		}
		if(saveState) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
	}
	// 3-2 게시물 출력
	public void boardPrint(BoardDto[] boards, JoinInfo [] joinArr) {
		for(int i = 0; i <= boards.length-1; i++) {
			if(boards[i] != null) {
				System.out.println("제목 :" + boards[i].getTitle() + "내용 :" +boards[i].getContent()+ "작성자 :" + joinArr[i].getId());
			}
		
		}
	}
}
