package boardservice10.view;

import java.util.Scanner;

//0. (로그인했을 때)메인메뉴 함수
public class BoardView {
	private static BoardView instance = new BoardView();
	private BoardView() {}
	public static BoardView getInstance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	public void index() {
		while(true) {
			System.out.println("1.로그아웃 2.내정보 3.게시물작성 4.게시물상세보기");
			int choose = scan.nextInt();
			if(choose ==1 ) {
				MemberView.getInstance().logout();break;
			}else if(choose ==2 ) {
				MemberView.getInstance().myInfo();
			}else if(choose ==3 ) {
				
			}else if(choose ==4 ) {
				
			}
			
		}
	}
}
