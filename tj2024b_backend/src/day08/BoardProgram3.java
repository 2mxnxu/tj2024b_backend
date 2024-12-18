package day08;

import java.util.Scanner;

public class BoardProgram3 {

	public static void main(String[] args) {
		int[] arr1 = new int[100];
		Board[] boardArray = new Board[100];
		
		while(true) {
			System.out.println("1.등록 2.출력 :");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if(choose == 1) {
				System.out.println("등록선택 하셨습니다.");
				
				System.out.println("제목 : "); String title = sc.next();
				System.out.println("내용 : "); String content = sc.next();
				System.out.println("작성자 : "); String writer = sc.next();
				
				Board board = new Board();
				board.title = title;
				board.content = content;
				board.writer = writer;
				
				for(int i = 0; i<=boardArray.length-1; i++) {
					if( boardArray[i] == null) {
						boardArray[i] = board;
						System.out.println("등록성공");
					}else {
						System.out.println("등록실패");
					}
				}
				
			}else if(choose == 2) {
				System.out.println("출력선택 하셨습니다.");
				
				for(int i = 0; i<=boardArray.length-1; i++) {
					if( boardArray[i] != null ) {
						Board board = boardArray[i];
						System.out.printf("순번 : %d , 제목 : %s , 내용 : %s , 작성자 : %s \n" ,
								i  , board.title , board.content , board.writer );
					}
				}
				}
			}
		}

	}


