package day10;

import java.util.Scanner;

import day10.Join.Login;

public class Example4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Join join = new Join();
		Join.Login login = join.new Login();
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