package day07;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		// [1] 배열 사용, 학번 10개 저장하는 코드
		int [] StudentIDs = new int [10];	
		// [2] 배열 초기화 하기
		//1. 개수가 생략
		int [] StudentIDs2 = new int [] {101,102,103};
		//2. 오류 발생
		//int [] StudentIDs3 = new int [3] {101,102,103};
		int [] StudentIDs4 =  {101,102,103};
		int [] StudentIDs5;
		StudentIDs5 = new int [] {101,102,103};
		
		int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(num); // 배열 주소값
		System.out.println(num[0]); //값 1개 출력
		System.out.println(Arrays.toString(num)); //전체배열 출력
		
		int [] num1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0; i<= num1.length-1; i++) {
			sum += num[i];
		}
		System.out.println(sum);
	}

}
