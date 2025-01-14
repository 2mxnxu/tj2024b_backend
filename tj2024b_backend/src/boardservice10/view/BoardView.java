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
				write();
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
			while(true) {
				System.out.println("1. 뒤로가기 2. 댓글작성(구현X) 3.수정 4.삭제 : ");
				int choose = scan.nextInt();
				if(choose == 1) {break;}
				else if(choose == 2) {}
				else if(choose == 3) {update(result.getBno());}
				else if(choose == 4) {delete(result.getBno());}
			}
	}
	public void update(  int bno ) { 
		System.out.println("새로운 제목 : "); 	String btitle = scan.next();
		System.out.println("새로운 내용 : ");	String bcontent = scan.next();
		BoardDto boardDto = new BoardDto();
		boardDto.setBno( bno );
		boardDto.setBtitle(btitle); boardDto.setBcontent(bcontent);
		boolean result = BoardController.getInstance().update( boardDto );
		if( result ) { System.out.println("수정 성공");}
		else { System.out.println("수정 실패");}
	} 
	
	// 6. 게시물 삭제 작성 화면 
	public void delete( int bno  ) { 
		boolean result =  BoardController.getInstance().delete( bno );
		if( result ) { System.out.println("삭제 성공"); }
		else { System.out.println("삭제 실패");}
	}
	public void write( ) { 
		categoryAll( ); 
		System.out.print("카테고리 번호 : ");		int cno = scan.nextInt();
		System.out.print("제목 : ");				String btitle = scan.next();
		System.out.print("내용 : ");				String bcontent = scan.next();
		BoardDto boardDto = new BoardDto();
		boardDto.setCno(cno); 
		boardDto.setBtitle(btitle); 
		boardDto.setBcontent(bcontent);
		boolean result = BoardController.getInstance().write( boardDto );
		if( result ) { System.out.println("글쓰기 성공"); }
		else { System.out.println("글쓰기 실패"); }
	}
	public void categoryAll() {
		ArrayList<BoardDto> result = BoardController.getInstance().categoryAll();
		for(int index = 0; index <= result.size()-1; index++) {
			BoardDto boardDto = result.get(index);
			System.out.printf("번호 : %d 카테고리명 : %s \n", boardDto.getCno(), boardDto.getCname());
		}
	}
}
