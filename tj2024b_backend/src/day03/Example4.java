package day03;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// 문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
		System.out.println("성적을 입력하세요");
		int score1 = sc.nextInt();
		
		if(score1>=90) {
			System.out.println("A등급");
		}else if(score1>=80) {
			System.out.println("B등급");
		}else if(score1>=70) {
		System.out.println("C등급");
		}else {
			System.out.println("재시험");
		}
		//문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		System.out.println("정수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("정수를 입력하세요");
		int j = sc.nextInt();
		System.out.println("정수를 입력하세요");
		int k = sc.nextInt();
		
		if(i>j) {
			System.out.println(i);
		}else if(i>k) {
			System.out.println(i);
		}else if(j>k) {
			System.out.println(j);
		}else {
			System.out.println(k);
		} 
		
		// 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
		
		
		String strResultABC;
		
		// 2. 사용자로부터 입력받기
		System.out.print("첫 번째 정수 입력 : ");
		String strA = sc.next();
		
		System.out.print("두 번째 정수 입력 : ");
		String strB = sc.next();
		
		System.out.print("세 번째 정수 입력 : ");
		String strC = sc.next();
		
		int nA = Integer.parseInt(strA);
		int nB = Integer.parseInt(strB);
		int nC = Integer.parseInt(strC);
		
		
		if (nA > nB){
			if (nA > nC){
				if (nB > nC){
					strResultABC = strC + strB + strA;
				}
				else{
					strResultABC = strB + strC + strA;
				}
			}else{
				strResultABC = strB + strA + strC;
			}
		}else{
			if (nB > nC){
				if (nA > nC){
					strResultABC = strC + strA + strB;
				}else{
					strResultABC = strA + strC + strB;
				}
			}else{
				strResultABC = strA + strB + strC;
			}
		}
		
		System.out.println(strResultABC);  /*
		
	

		/* 문제5 : 가위바위보 게임 구현하기.
	      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
	      - 승리자 판단과 무승부 경우의수를 출력하시오.
	       [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
	      [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.*/
		 int scissors = 0;
		 int rock = 1;
		 int paper = 2;
		 
		 System.out.print("가위바위보 입력 : ");
			int p1 = sc.nextInt();
		 System.out.print("가위바위보 입력 : ");
			int p2 = sc.nextInt();
			
			if (p1 == p2) {
				System.out.println("무승부");
			}else if (p1 == (p2+1)%3) {
				System.out.println("플레이어1 승리");
			}else {
				System.out.println("플레이어2 승리");
			}
		 
		
		/* 문제6 : 윤년/평년 판단하기
   		   [ 입력조건 ] 하나의 연도를 입력 받습니다.
		   [ 윤년/평년 조건 ]
		   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
		   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
		   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
		   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.*/
				 
			System.out.println("연도를 입력해주세요");
			int year = sc.nextInt();
			
			if(year%4 ==0 && year%100 !=0 || year %400 ==0 ) {
				System.out.println("평년");
			}else {
				System.out.println("윤년");
			}
			
			
		/*문제7 : 주차 사용요금 계산하기
   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다. 
   - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오. 
   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
   - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오. */
		
			int 시 = 9;  int 분 = 30;
			System.out.println("출차시간의 시를 입력해주세요");
			int outH = sc.nextInt();
			System.out.println("출차시간의 분를 입력해주세요");
			int outM = sc.nextInt();
			int start = 시*60 + 분;
			
			int outHM = (outH-시) * 60;
			int outMM = outHM + (outM-분);
			
			int money = outMM * 1000;
			
			if(outMM<start) {
				System.out.println("출차시간 오류");
			}else {
				System.out.println(money);

			} 
			
		
		/*문제8 : 로그인 처리
   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
   [처리출력 조건]
   1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
   2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
   3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
   [ 참고 ]
   1. 문자열 비교시에는 == 같다 연산자 대신에 .equals() 함수를 이용해주세요.
   예] 
      String name = scan.next();
      name =="admin" 대신에 name.equals( "admin" ) 사용.*/
		
		String name = "admin";
		String pw = "1234";
		
		
		System.out.println("ID를 입력하세요");
		String name1 = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw1 = sc.next();
		
		if(name.equals( name1 ) && pw.equals( pw1) ) {
			System.out.println("로그인성공");
		}else if(name != name1 && pw.equals( pw1)){
			System.out.println("아이디 정보가 일치하지 않습니다.");
		}else if(name.equals( name1 ) && pw != pw1){
			System.out.println("비밀번호 정보가 일치하지 않습니다.");
		}
		
		/*문제9 : 당첨번호 개수  찾기
   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.*/
		int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
		
		System.out.println("정수입력");
		int 공11 = sc.nextInt();
		System.out.println("정수입력");
		int 공12 = sc.nextInt();
		System.out.println("정수입력");
		int 공13 = sc.nextInt();
		
		int count = 0;
		if(공11 == 공1 || 공11 == 공2 || 공11 == 공3) {
			count++;
		}
		if(공12 == 공1 || 공12 == 공2 || 공12 == 공3) {
			count++;
		}
		if(공13 == 공1 || 공13 == 공2 || 공13 == 공3) {
			count++;
		}
		System.out.println(count);
			
		
		
	}

}
/*
[ 구현 문제 , FOR문 없이 풀이 ] 



*/