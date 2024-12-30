package day07;
	

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Product p1 = new Product(); p1.name = "콜라"; p1.price = 1000; p1.stock = 10;
		Product p2 = new Product(); p2.name = "사이다"; p2.price = 1500; p2.stock = 10;
		Product p3 = new Product(); p3.name = "환타"; p3.price = 2000; p3.stock = 10;
		
		while(true) {
			System.out.println("메뉴를 선택해주세요 : 1. 콜라 2. 사이다 3. 환타 4.결제하기");
			Scanner sc = new Scanner(System.in);
			int 선택메뉴 = sc.nextInt();
			
			if(선택메뉴 == 1) {
				System.out.println("콜라 선택하셨습니다");
				p1.stock--;
				p1.cart++;
				if(p1.stock <0) {
					System.out.println("재고가 없습니다");
					p1.cart--;
				}
			}
			if(선택메뉴 == 2) {
				System.out.println("사이다 선택하셨습니다");
				p2.stock--;
				p2.cart++;
				if(p2.stock <0) {
					System.out.println("재고가 없습니다");
					p2.cart--;
				}
			}
			if(선택메뉴 == 3) {
				System.out.println("환타 선택하셨습니다");
				p3.stock--;
				p2.cart++;
				if(p3.stock <0) {
					System.out.println("재고가 없습니다");
					p2.cart--;
				}
			}
			if(선택메뉴 == 4) {
				int pay = (p1.price*p1.cart) + (p2.price*p2.cart) + (p3.price*p3.cart);
				System.out.println("결제하기 콜라 : " + p1.cart +"\n"+ "사이다 : " + p2.cart +"\n"+ "환타 : " + p3.cart +"\n"+ "총금액 : " + pay );
				p1.cart = 0; p2.cart = 0; p3.cart= 0;
			}
			
			
		}

	}

}
