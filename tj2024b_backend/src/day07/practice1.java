package day07;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] score = new int [5];
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i <= score.length-1; i++) {
			System.out.println("점수를 입력하세요");
			score[i] = sc.nextInt();
			sum += score[i];
			avg = sum/5;
		}
		System.out.println("합계" + sum + "평균" + avg);
	}

}
