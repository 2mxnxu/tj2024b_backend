package day09;

import java.util.Scanner;

public class BoardProgram4 {

	public static void main(String[] args) {
		
		Boardservice bs = new Boardservice();
		
		while(true) {	
		System.out.println("1.등록 2.출력 : ");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		if(choose == 1) {
			bs.boardAdd();
		}else if(choose == 2) {
			bs.boardPrint();
		}

	}
	}
}
