package day24;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		
		// [1] 변수 : 2개, 자료 :1 개
		int a = 3;
		int b = 3;
		System.out.println(a == b);
		// 즉] 서로 다른 두 변수는 같은 자료를 참조한다.
		
		// [2] 변수 : 2개 , 자료 : 1개
		int c = 5;
		int d = c;
		System.out.println(c == d);
		// 즉] c가 참조하는 5를 d에 대입
		
		// [3] 변수 : 2개, 자료 : 2개(3, newInteget(인스턴스))
		Integer value1 = 3;
		Integer value2 = new Integer(3); // 취소선 : 권장하지 않음 뜻
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		
		// [4] String 클래스
		// 1. 배열을 이용한 문자열 표현
		char[] str1 = new char[] {'유','재','석'};
		// 2. "" 리터럴 이용한 문자열
		String str2 = "유재석";
		// 3. 생성자 이용한 문자열
		String str3 = new String("유재석");
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		String str4 = "유재석";
		System.out.println(str2 == str4);
		
		// [5] String 주요 메소드
			// 1.
		String str5 = "자바".concat("프로그래밍");
		System.out.println(str5);
			// 2.
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
			// 3.
		String str6 = String.format("%s %s", "자바", "프로그래밍");
		System.out.println(str6);
			// 4. 
		String str7 = "";
		str7 += "자바";
		str7 += "프로그래밍";
		System.out.println(str7);
			// 5. charAt(인덱스)
		char gender = "012345-1230123".charAt(7);
		System.out.println(gender);
			// [활용] .nextChar() 없는 이유는 .next.charAt(0) : 한글자 입력
		//Scanner scan = new Scanner(System.in);
		// char ch = scan.next().charAt(0); // 입력받은 문자열의 첫글자 추출
		
			// 6. .length()
		System.out.println("012345-1230123".length());
		// [활용] 반복문 : 변수명.length()-1 [마지막 인덱스]
		// for(int index = 0; index <= 변수명.length()-1; index++) {}
		
		// 7. .replace(기존문자열, 새로운문자열);
		String str8 = "자바프로그래밍".replace("자바", "JAVA");
		System.out.println(str8); 
			// [활용] html(<br/>) --> java(\n)
		// 8. .subString(시작인덱스, [끝인덱스]) : 
		String str9 = "012345-1230123".substring(0,6);
		System.out.println(str9);
		
		String str10 = "012345-1230123".substring(7);
		System.out.println(str10);
		
		// 9. .split() : 
		String [] str11 = "012345-1230123".split("-");
		System.out.println(str11[0]);
		System.out.println(str11[1]);
		
		// 10. indexOf("찾을문자열")
		int findIndex = "자바 프로그래밍 언어".indexOf("자바");
		System.out.println(findIndex); //0
		
		// 11. contains("찾을문자열")
		boolean findBool = "자바 프로그래밍 언어".contains("자바");
		System.out.println(findBool); // true
		
		// 12. .getBytes()
		byte[] str12 = "자바 프로그래밍 언어".getBytes();
		System.out.println(str12);
		System.out.println(Arrays.toString(str12));
		
		System.out.println("ab".getBytes().length);
		System.out.println("가나".getBytes().length);
	}
}
