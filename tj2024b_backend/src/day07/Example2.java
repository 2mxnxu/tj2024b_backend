package day07;
	

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Cola cola1 = new Cola();
		Sidar sidar1 = new Sidar();
		Hanta hanta1 = new Hanta();
		kiosk kiosk1= new kiosk(); 
		

		while(true) {
			System.out.println("메뉴를 선택해주세요 : 1. 콜라 2. 사이다 3. 환타 4.결제하기");
			Scanner sc = new Scanner(System.in);
			int 선택메뉴 = sc.nextInt();
			
			if(선택메뉴 == 1) {
				System.out.println("콜라 선택하셨습니다");
				cola1.colaOut--;
				cola1.colaIn++;
				if(cola1.colaOut <0) {
					System.out.println("재고가 없습니다");
					cola1.colaIn--;
				}
			}
			if(선택메뉴 == 2) {
				System.out.println("사이다 선택하셨습니다");
				sidar1.sidarOut--;
				sidar1.sidarIn++;
				if(sidar1.sidarOut <0) {
					System.out.println("재고가 없습니다");
					sidar1.sidarIn--;
				}
			}
			if(선택메뉴 == 3) {
				System.out.println("환타 선택하셨습니다");
				hanta1.hantaOut--;
				hanta1.hantaIn++;
				if(hanta1.hantaOut <0) {
					System.out.println("재고가 없습니다");
					hanta1.hantaIn--;
				}
			}
			if(선택메뉴 == 4) {
				kiosk1.pay = (cola1.colaPrice*cola1.colaIn) + (sidar1.sidarPrice*sidar1.sidarIn) + (hanta1.hantaprice*hanta1.hantaIn);
				System.out.println("결제하기 콜라 : " + cola1.colaIn +"\n"+ "사이다 : " + sidar1.sidarIn +"\n"+ "환타 : " + hanta1.hantaIn +"\n"+ "총금액 : " + kiosk1.pay );
				cola1.colaIn = 0; sidar1.sidarIn = 0; hanta1.hantaIn= 0;
			}
			
			
		}

	}

}
