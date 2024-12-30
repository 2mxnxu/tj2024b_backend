package day06;

import java.util.Scanner;

public class BoardProgram1 {

	public static void main(String[] args) {
		String 제목1 = null; // null 값 넣으면 .equals(String)에서 nullPointerException 예외 발생
		String 내용1 = null;
		String 작성자1 = null;
		String 제목2 = null; 
		String 내용2 = null;
		String 작성자2 = null;
		String 제목3 = null; 
		String 내용3 = null;
		String 작성자3 = null;

		while(true) {
			System.out.println("===== 게시판 프로그램====");
			System.out.println("1.등록 2.출력 3.수정 4.삭제 :");
			Scanner scan = new Scanner(System.in);
			int 선택메뉴 = scan.nextInt();
			
			if(선택메뉴 == 1 ) {
				System.out.println("1. 등록 선택했습니다.");
				System.out.println("제목 :");
				String title = scan.next();
				System.out.println("내용 :");
				String content = scan.next();
				System.out.println("작성자 :");
				String writer = scan.next();
				if(제목1 == null) {
					제목1 = title; 
					내용1 = content;
					작성자1 =  writer;
				}else if(제목2 == null) {
					제목2 = title; 
					내용2 = content;
					작성자2 =  writer;
				}
				else if(제목3 == null) {
					제목3 = title; 
					내용3 = content;
					작성자3 =  writer;
				}else {
					System.out.println("등록실패");
				}
			}
			
			else if(선택메뉴 == 2) {
				System.out.println("2. 출력 선택했습니다.");
				if(제목1 != null) {
					System.out.println("제목1 : "+ 제목1 + "내용1 : " + 내용1 + "작성자1 : " +작성자1);
				}
				if(제목2 != null) {
					System.out.println("제목2 : "+ 제목2 + "내용2 : " + 내용2 + "작성자2 : " +작성자2);
				}
				if(제목3 != null) {
					System.out.println("제목3 : "+ 제목3 + "내용3 : " + 내용3 + "작성자3 : " +작성자3);
				}
				
				
			}
			
			
		}
	}

}
