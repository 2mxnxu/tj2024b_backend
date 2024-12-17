package day07;

import java.util.Scanner;

public class BoardProgram2 {

	public static void main(String[] args) {
		Board board1 = new Board();
		Board board2 = new Board();
		Board board3 = new Board();
		
		while(true) {
		
			System.out.println("1.등록 2.출력 :");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			if(choose == 1) {
				System.out.println("등록 선택했습니다.");
				System.out.println("제목 :");
				String title = sc.next();
				System.out.println("내용 :");
				String content = sc.next();
				System.out.println("작성자 :");
				String writer = sc.next();
				if(board1.title == null) {
					board1.title = title;
					board1.content = content;
					board1.writer = writer;
				}else if(board2.title == null) {
					board2.title = title;
					board2.content = content;
					board2.writer = writer;
				}else if(board3.title == null) {
					board3.title = title;
					board3.content = content;
					board3.writer = writer;
				}
			}else if(choose == 2) {
				System.out.println("출력 선택했습니다.");
				if(board1.title != null) {
					System.out.println("제목 :" +board1.title + "내용 :" +board1.content+ "작성자 :" + board1.writer);
				}
				if(board2.title != null) {
					System.out.println("제목 :" +board2.title + "내용 :" +board2.content+ "작성자 :" + board2.writer);
				}if(board3.title != null) {
					System.out.println("제목 :" +board3.title + "내용 :" +board3.content+ "작성자 :" + board3.writer);
				}
			}
		}
	}

}
