package day04;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		switch(ranking){
			case 1 : medalColor = 'G';
					break;
			case 2 : medalColor = 'S';
					break;
			case 3 : medalColor = 'B';
					break;
			default : medalColor = 'A';
			
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		
		int month = 10;
		int day;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31;
		break;
		case 4 : case 6 : case 9 : case 11 : day = 30;
		break;
		case 2 : day = 28;
		break;
		
		}
		
		String medal = "Gold";
		switch(medal) {
		case "Gold" :
			System.out.println("금메달 입니다.");
			break;
		case "Silver" :
			System.out.println("은메달 입니다.");
			break;
		case "Bronze" :
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
	}
		/* if는 조건결과의 논리(t/f) 제어, switch는 조건결과의 값(value case) 제어
		int score = 80;
		switch(score>=80) {
		
		} 조건문에 논리연산, 비교연산에 따른 논리 결과 케이스가 아니다. 값만 제어하는거
		*/
		System.out.println("층수 입력하세요");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		switch(floor) {
		case 1 : 
			System.out.println(floor + "층 약국입니다");
			break;
		case 2 : 
			System.out.println(floor + "층 정형외과입니다");
			break;
		case 3 : 
			System.out.println(floor + "층 피부과입니다");
			break;
		case 4 : 
			System.out.println(floor + "층 치과입니다");
			break;
		case 5 : 
			System.out.println(floor + "층 헬스 클럽입니다");
			break;
		}
		
	}
}
