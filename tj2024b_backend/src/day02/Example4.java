package day02;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		// [콘솔입력]
		// JS : prompt, document.querySelector().value
		// Java : Scanner
		
		// 1. 입력 객체 만들기, 객체 생성 방법 : new 클래스명()
		// Scanner 타입으로 'scan' 변수 선언, 'scan' 변수에 Scanner 객체(주소) 대입
		Scanner scan = new Scanner(System.in);
		// 2. 입력객체로 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수 제공
			// - 객체란? 고유한 속성/데이터 과 이벤트/함수를 가지는 실체물
			// 객체.nextXXX();
			// 엔터 기준으로 하나의 (next) 입력 마침 처리한다
		// [1] 문자열 입력받기
		System.out.println("문자열 입력하세요 : ");
		String str1 = scan.next();
		System.out.println(str1);
		
		// [2] 변수명.nextLine(), nextLine()은 다른 nextXXX()코드와 사용시 앞전 nextXXX()의 엔터를 포함하므로 하나로 인식한다.
		// - 해결방안 : 의미없는 nexxt.Line() 사용하므로 실사용할 nextLine() 구분하기
		System.out.print("[2] .nextLine() 문자열 입력 :");
		scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println("[2] .nextLine() 문자열 결과 :" + str2);
		
		// [3] 변수명.nextInt(), 키보드로 부터 입력받은 데이터를 int 타입으로 변환 함수, 허용번위 넘어가면 오류
		System.out.println("정수입력하세요");
		int i1 = scan.nextInt();
		System.out.println(i1);

		// [4] 변수명.nextByte(), byte 타입으로 변환 함수
		System.out.println("정수입력하세요");
		Byte i2 = scan.nextByte();
		System.out.println(i2);
		
		// [5] 변수명.nextShort(), Short 타입으로 변환 함수
		System.out.println("정수입력하세요");
		Short i3 = scan.nextShort();
		System.out.println(i3);

		// [6] 변수명.nextLong(), Short 타입으로 변환 함수
		System.out.println("정수입력하세요");
		Long i4 = scan.nextLong();
		System.out.println(i4);
		
		// [7] 변수명.nextFloat(), Float 타입으로 변환 함수
		System.out.println("값을 입력하세요");
		Float i5 = scan.nextFloat();
		System.out.println(i5);
		
		// [8] 변수명.nextDouble(), Double 타입으로 변환 함수
		System.out.println("값을 입력하세요");
		Double i6 = scan.nextDouble();
		System.out.println(i6);

		// [9] 변수명.Boolean(), Boolean 타입으로 변환 함수
		System.out.println("값을 입력하세요");
		boolean b1 = scan.nextBoolean();
		System.out.println(b1);
		

		// + 오류 : 지정한 함수의 반환타입과 입력한 데이터 허용범위 벗어나면 InputMismatchException
		
	}

}
