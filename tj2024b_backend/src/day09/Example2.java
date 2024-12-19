package day09;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Join join = new Join();
		Login login = new Login();
		JoinInfo [] joinArr = new JoinInfo[100];

		while(true) {
			System.out.println("1. 회원가입 2. 로그인 : ");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				join.joinAdd(sc,joinArr );
			}else if(choose == 2) {
				login.loginStart(sc, joinArr );
			}
		}
	}

}
