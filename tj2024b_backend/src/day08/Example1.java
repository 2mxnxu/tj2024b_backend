package day08;

import java.util.Scanner;

import day08.Board;


public class Example1 { 
	public static void main(String[] args) { 
		int[] arr1 = new int[100];
		Wait[] waitArray = new Wait[100];
		
		while( true ) { 
			System.out.print("\n\n>>>>1.대기 등록 2.대기 현황 : "); 
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) { System.out.println(">>> 대기명단 등록 >>>");
				System.out.print(">> 전화번호 : ");	String phone = scan.next();
				System.out.print(">> 인원수 : ");		int count = scan.nextInt();
				
				Wait wait = new Wait();
				wait.phone = phone;
				wait.count = count;
				boolean state = false;
				
				for(int i = 0; i <= waitArray.length-1; i++) {
					if(waitArray[i] == null) {
						waitArray[i] = wait;
						state = true;
						break;
					}
				}
				if (state == true) {
					System.out.println("명단 등록 완료");
				}
				else {
					System.out.println("명단 등록 실패");
				}
			}
			else if(choose == 2) {
				for(int i = 0; i <= waitArray.length-1; i++) {
					if(waitArray[i] != null) {
						Wait wait = waitArray[i];
						System.out.printf("순번 : %d, 전화번호 : %s, 인원수 : %d\n", i+1, wait.phone, wait.count);
					}
				}
			}
		}

	}

}

		