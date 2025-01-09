package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;

import boardservice10.controller.BoardController;
import boardservice10.model.dto.BoardDto;

//0. (로그인했을 때)메인메뉴 함수
public class BoardView {
	private static BoardView instance = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	public void index() {
		while(true) {
			findAll();
			System.out.print("1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기");
			int choose = scan.nextInt();
			if( choose == 1 ) { MemberView.getInstance().logout(); break; }
			else if( choose == 2 ) { 
				int state = MemberView.getInstance().myInfo();
				if( state == 0 ) 
				{ return; }
			}else if(choose ==3 ) {
				
			}else if(choose ==4 ) {
				findById();
			}
		}
	}
	// 1. 전체 게시물 조회 화면
	public void findAll() {
		// 1. 컨틀롤러 에게 요청하고 결과 받기
		ArrayList<BoardDto> result = BoardController.getInstance().findAll();
		// 2. 결과에 따른 출력
		System.out.println("번호\t카테고리\t작성자\t작성일\t제목");
		for(int index = 0; index <= result.size()-1; index++) {
			BoardDto boardDto = result.get(index); // index 번째의 요소 객체를 꺼내기
			System.out.print(boardDto.getBno()+ "\t");
			System.out.print(boardDto.getCno()+ "\t");
			System.out.print(boardDto.getMno()+ "\t");
			System.out.print(boardDto.getBdate()+ "\t");
			System.out.print(boardDto.getBtitle()+ "\n");
		}
	}
	public void findById() {
		System.out.println("게시물 번호 : ");
		int bno = scan.nextInt();
		// 1. 컨트롤러에게 요청하고 결과 받기
		BoardDto result = BoardController.getInstance().findById(bno);
		// 2. 결과
		System.out.println(result.getBtitle()+ "\n");
		System.out.println(result.getCno()+ "\t"+ result.getMno() + "\t"+ result.getBview()+"\t"+ result.getBdate());
		System.out.println(result.getBcontent()+ "\t");
			// -- 추후에 댓글 출력되는 코드
		
	}
}
