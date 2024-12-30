package day10;

import java.util.Scanner;

public class BoardProgram5 {

	public static void main(String[] args) {
		
		Board [] boards = new Board[100];
		BoardService bs = new BoardService();

		while(true) {
			System.out.println("1.등록 2.출력 : ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			if(choose == 1) {
				bs.boardAdd(sc, boards);
			}else if (choose == 2) {
				bs.boardPrint(boards);
			}
		}
	}

}
