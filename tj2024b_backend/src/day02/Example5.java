package day02;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//[지문1] 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오.
		
		System.out.println("국어 점수를 입력하세요");
		int ko = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int en = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int mh = scan.nextInt();
		
		int sum = ko+en+mh;
		System.out.println("총점" + sum);
		double avg = sum/3;
		System.out.println("평균" + avg);
		
		// [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
		
		System.out.println("반지름을 입력하세요");
		int round = scan.nextInt();
		double width = round * round * 3.14;
		System.out.println("원넓이 : " +width);
		
		// [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
		
		System.out.println("두 실수를 입력해주세요");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		
		double rst = d1 / d2 * 100.0;
		System.out.println(rst + "%");
		
		// [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
		
		System.out.println("정수 입력");
		int int1 = scan.nextInt();
		String result =  int1 %2 != 0 ? "true" : "false";
		System.out.println(result);
		
		// [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
		
		System.out.println("정수 입력");
		int int2 = scan.nextInt();
		String result1 =  int1 %7 == 0 ? "true" : "false";
		System.out.println(result1);
		
		// [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오. 
		System.out.println("정수 입력");
		int int10 = scan.nextInt();
		String result10 =  int10 %2 != 0 && int1 %7 == 0 ? "true" : "false";
		System.out.println(result10);
		
		// [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
		System.out.println("금액입력");
		int l1 = scan.nextInt();
		int l2 = l1/100000;
		int l3 = (l1-l2* 100000)/10000;
		int l4 = (l1-l2* 100000 - l3*10000)/1000;
		
		System.out.println("100000원짜리" +l2+ "장이고 10000원짜리" +l3+ "장이고 1000짜리" +l4+ "장입니다.  \n");
		
		// [지문8] 1차점수 와 2차점수 각각 입력받아서 
		
		System.out.println("1차 시험 입력");
		int int1st = scan.nextInt();
		System.out.println("2차 시험 입력");
		int int2nd = scan.nextInt();
		int sum1 = int1st + int2nd;
		String pass = sum1>150 ? "합격" : "불합격";
		System.out.println(pass); 
	}

}

// [지문1] 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오. 0

// [지문2] 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오. 0

// [지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오. 0

// [지문4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.0

// [지문5] 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오. 0

// [지문6] 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오. 0

// [지문7] 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
    // -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장 

// [지문8] 1차점수 와 2차점수 각각 입력받아서 
   // -> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오. 0