package day06;
	/*
	 	자바 과제 4 : 키오스크 프로그램
	 	- 문법 : 변수, 입출력함수, 연산자, 제어문(조건문/반복문)
	 	- 제품은 콜라, 사이다, 환타 3개가 존재
	 	- 각 제품의 재고는 초기에 10개씩 존재
	 	- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원
	 	- 메뉴] 1콜라 2사이다 3환타 4 결제
	 	1선택시 - 콜라 재고 1 차감하고 장바구니에 담음
	 	2선택시 - 사이다 재고 1 차감하고 장바구니에 담음
	 	3선택시 - 환타 재고 1 차감하고 장바구니에 담음
	 	4선택시 - 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력
	 	
	 */

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int colaOut = 10;
		int sidarOut = 10;
		int hantaOut = 10;
		int colaIn = 0;
		int sidarIn = 0;
		int hantaIn = 0;
		int pay = 0;

		while(true) {
			System.out.println("메뉴를 선택해주세요 : 1. 콜라 2. 사이다 3. 환타 4.결제하기");
			Scanner sc = new Scanner(System.in);
			int 선택메뉴 = sc.nextInt();
			
			if(선택메뉴 == 1) {
				System.out.println("콜라 선택하셨습니다");
				colaOut--;
				colaIn++;
				if(colaOut <0) {
					System.out.println("재고가 없습니다");
					colaIn--;
				}
			}
			if(선택메뉴 == 2) {
				System.out.println("사이다 선택하셨습니다");
				sidarOut--;
				sidarIn++;
				if(sidarOut <0) {
					System.out.println("재고가 없습니다");
					sidarIn--;
				}
			}
			if(선택메뉴 == 3) {
				System.out.println("환타 선택하셨습니다");
				hantaOut--;
				hantaIn++;
				if(hantaOut <0) {
					System.out.println("재고가 없습니다");
					hantaIn--;
				}
			}
			if(선택메뉴 == 4) {
				pay = (colaIn*1000) + (sidarIn*1500) + (hantaIn*2000);
				System.out.println("결제하기 콜라 : " + colaIn + "사이다 : " + sidarIn + "환타 : " + hantaIn + "총금액 : " + pay );
			}
			
			
		}

	}

}
