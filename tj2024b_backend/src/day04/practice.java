package day04;

import java.io.IOException;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) throws IOException {
		/*
		System.out.println("연산자 입력");
		char operator = (char)System.in.read();
		
		int num1 = 10;
		int num2 = 2;
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}else if(operator == '*') {
			System.out.println(num1*num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
		}else if(operator == '/') {
			System.out.println(num1/num2);
		}*/
		/*
		System.out.println("연산자 입력");
		Scanner sc = new Scanner(System.in);
		char operator = sc.next().charAt(0);
		
		int num1 = 10;
		int num2 = 2;
		
		if(operator=='+') {
			System.out.println(num1+num2);
		}else if(operator == '*') {
			System.out.println(num1*num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
		}else if(operator == '/') {
			System.out.println(num1/num2);
		}
		
		switch(operator) {
	      case '+' : System.out.println(num1+num2);
	      break;
	      case '-' : System.out.println(num1-num2);
	      break;
	      case '*' : System.out.println(num1*num2);
	      break;
	      case '/' : System.out.println(num1/num2);
	      }
		*/
		
		/*
		for(int dan = 2; dan<=9; dan++) {
			for(int multi = 1; multi<=9; multi++) {
				if (dan %2== 0) {
					System.out.println(dan+"*"+multi+"="+ dan*multi);
					continue;
				}
				
			}
		}*/
		/*
		for(int dan = 2; dan<=9; dan++) {
			for(int multi = 1; multi<=9; multi++) {
				if(dan>=multi) {
					System.out.println(dan+"*"+multi+"="+ dan*multi);
					continue;
			}
			}
			}
		}*/
		/*
		for(int line = 1; line <8; line +=2) {
		for(int s=5; s>=line; s-=2) {
			System.out.print(" ");
		}
			for(int s = 1; s<=line; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
	
		
	}

}
