package day09;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WaitProgram wt = new WaitProgram();
		Wait [] waitArr = new Wait[100];

		while(true) {	
		System.out.println("1.등록 2.출력 : ");
		int choose = sc.nextInt();
		
		if(choose == 1) {
			wt.waitAdd(sc, waitArr);
		}else if(choose ==2) {
			wt.waitPrint(waitArr);
		}
	}

}
}
