package day07;
	

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		kiosk kiosk1 = new kiosk();
		

		while(true) {
			System.out.println("메뉴를 선택해주세요 : 1. 콜라 2. 사이다 3. 환타 4.결제하기");
			Scanner sc = new Scanner(System.in);
			int 선택메뉴 = sc.nextInt();
			
			if(선택메뉴 == 1) {
				System.out.println("콜라 선택하셨습니다");
				kiosk1.colaOut--;
				kiosk1.colaIn++;
				if(kiosk1.colaOut <0) {
					System.out.println("재고가 없습니다");
					kiosk1.colaIn--;
				}
			}
			if(선택메뉴 == 2) {
				System.out.println("사이다 선택하셨습니다");
				kiosk1.sidarOut--;
				kiosk1.sidarIn++;
				if(kiosk1.sidarOut <0) {
					System.out.println("재고가 없습니다");
					kiosk1.sidarIn--;
				}
			}
			if(선택메뉴 == 3) {
				System.out.println("환타 선택하셨습니다");
				kiosk1.hantaOut--;
				kiosk1.hantaIn++;
				if(kiosk1.hantaOut <0) {
					System.out.println("재고가 없습니다");
					kiosk1.hantaIn--;
				}
			}
			if(선택메뉴 == 4) {
				kiosk1.pay = (kiosk1.colaIn*1000) + (kiosk1.sidarIn*1500) + (kiosk1.hantaIn*2000);
				System.out.println("결제하기 콜라 : " + kiosk1.colaIn +"\n"+ "사이다 : " + kiosk1.sidarIn +"\n"+ "환타 : " + kiosk1.hantaIn +"\n"+ "총금액 : " + kiosk1.pay );
				kiosk1.colaIn = 0; kiosk1.sidarIn = 0; kiosk1.hantaIn= 0;
			}
			
			
		}

	}

}
