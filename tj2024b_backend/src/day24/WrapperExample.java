package day24;

public class WrapperExample {
	public static void main(String[] args) {
		// [1] 100을 저장하는 방법
		int value1 = 100;
		Integer value2 = 100;
		double value3 = 3.14;
		Double value4 = 3.14;
		// 차이점 : 기본 VS 참조(멤버/생성자/메소드)
		//System.out.println(value1.); 오류
		System.out.println(value2.BYTES); // 4바이트
		
		// [3] 오토박싱, 언박싱
		// 오토박싱 : 기본타입을 참조타입으로 변환
		Integer value5 = value1;	// Integer = int
		// 언박싱 : 참조타입을 기본타입으로 변환
		int value6 = value2;	// int = Integer
		
		// 문자열 타입 --> 기본타입 변환
		int val1= Integer.parseInt("100");
		double val2 = Double.parseDouble("3.14");
		
		// 기본 타입 --> 문자열 반환
		String str1 = 100 + ""; // (리터럴)자료 + ""
		String str2 = String.valueOf(100);
		
	}
}
