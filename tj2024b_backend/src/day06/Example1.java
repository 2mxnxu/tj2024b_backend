package day06;
/*
		자바 과제3 : (식당) 대기번호 발행 프로그램
		- 문법 : 변수, 입출력함수, 연산자, 제어문(조건문/반복문)
		- 전화번호, 인원수 를 입력받아서 저장 및 출력 구현
		- 총 대기명단은 3개까지 가능. 대기명단 1개당 전화번호,인원수 저장소(변수) 2개 필요 , 대기명단 3개
 */

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
			int no = 0;
			int pNum1 = 0;
			int person1 = 0;
			int pNum2 = 0;
			int person2 = 0;
			int pNum3 = 0;
			int person3 = 0;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("1.대기등록 2.대기현황 :");
				int 선택메뉴 = sc.nextInt();
				
				if(선택메뉴 == 1 ) {
				if(no == 0) {
					System.out.println("전화번호 입력하세요 :");
					pNum1 = sc.nextInt();
					System.out.println("인원수를 입력해주세요");
					person1 = sc.nextInt();
					no ++;
					System.out.println("대기번호" + no + "번째 입니다");
				}
				else if(no == 1) {
					System.out.println("전화번호 입력하세요 :");
					pNum2 = sc.nextInt();
					System.out.println("인원수를 입력해주세요");
					person2 = sc.nextInt();
					no ++;
					System.out.println("대기번호" + no + "번째 입니다");
				}else if(no == 2) {
					System.out.println("전화번호 입력하세요 :");
					pNum3 = sc.nextInt();
					System.out.println("인원수를 입력해주세요");
					person3 = sc.nextInt();
					no ++;
					System.out.println("대기번호" + no + "번째 입니다");
				}else {
					System.out.println("더이상 대기번호를 받을 수 없습니다.");
					break;
				}
				}
				else if(선택메뉴 == 2) {
					System.out.println("대기현황" + no + "팀" );
				}
				
				
			}
		
	}

}
