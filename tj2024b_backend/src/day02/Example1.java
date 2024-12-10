/*
 main 함수 - 스레드가 내장된 함수
 - 스레드 : 번역된 코드를 읽어드리기 위한 실행 흐름
  */
package day02;

public class Example1 {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println("MAX_NUM" + MAX_NUM); 
		System.out.println("MIN_NUM" + MIN_NUM);
		
		int num1 = 3;
		int num2 = num1;
		
		char str1 = 'a';
		char str2 = 'a';
	}

}
