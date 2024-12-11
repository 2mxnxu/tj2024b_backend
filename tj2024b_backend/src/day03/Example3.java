package day03;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int age = 61;
		int charge = 0;
		
		if(age<8) {
			charge = 1000;
			System.out.println("취학전 아동입니다.");
		}else if(age<14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age<20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}else if(age>60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		else {
			 charge = 3000;
			 System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "입니다");

		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		char grade;
		
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(score);
		System.out.println(grade);
	}
	
	
}
