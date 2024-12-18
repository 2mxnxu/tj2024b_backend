package day07;

import java.util.Scanner;


public class Example1 { // class start 
	public static void main(String[] args) { // main start
		
		Wait phone1 = new Wait();
		Wait phone2 = new Wait();
		Wait phone3 = new Wait();
		while( true ) { // [1] while 반복문 , while(true){} 무한반복문 , 대기명단을 등록과출력을 24시간 하기 위해서 무한루프 사용했다.
			System.out.print("\n\n>>>>1.대기 등록 2.대기 현황 : "); // [2] 출력함수 , print() , 사용자에게 등록과 출력 메뉴를 보여준다.
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();// [3] 입력함수 , Scanner객체필요 , nextInt()함수 이용하하여 정수타입을 입력받아 정수타입 변수에 저장했다
			// [4] 조건문 , if(흐름조건) , 입력받은 값(메뉴선택)에 따른 흐름제어(1이면 , 2이면 )
			if( choose == 1 ) { System.out.println(">>> 대기명단 등록 >>>");
				// [5] 각 사용자에게 필요한 데이터 입력받기. 
				System.out.print(">> 전화번호 : ");	String phone = scan.next();
				System.out.print(">> 인원수 : ");		int count = scan.nextInt();
				// [6] 만약에 비어 있는 명단이 있으면 각 입력받 데이터를 비어 있는 곳에 대입하기 , 비어있다 , 문자열이면 null , 숫자이면 0 판단 , 임의 판단 
				if( phone1.phone1 == null ) { phone1.phone1 = phone; phone1.count1 = count; }
				else if( phone2.phone2 == null ) { phone2.phone2 = phone; phone2.count2 = count; }
				else if( phone3.phone3 == null ) { phone3.phone3 = phone; phone3.count3 = count; }	
			}else if( choose == 2 ) {System.out.println(">>> 대기명단 현황 >>>");
				// [7] 만약에 비어 있지 않으면(명단이 있으면) 각각 변수값 출력하기. 
				if( phone1.phone1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , phone1.count1 , phone1.phone1 ); }
				if( phone2.phone2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , phone2.count2 , phone2.phone2 ); }
				if( phone3.phone3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , phone3.count3 , phone3.phone3 ); }
			}
		} // while end 
	} // main end 
} // class end 