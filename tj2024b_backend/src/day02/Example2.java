package day02;

public class Example2 {

	public static void main(String[] args) {

		// 자동(자료/타입)형 변환, 묵시적 (자료/타입) 형 변환
			// - 1. 메모리 크기가 작은 것 부터 큰 순으로 변환
			// - 2. 데이터의 손실이 없다.
			// byte -> short, char -> int -> long -> float -> double
		byte byteValue = 10;
		short shortValue = byteValue;
		int intValue = shortValue;
		long longValue = intValue;
		float floatValue = longValue;
		double doubleValue = floatValue;
		
		System.out.println(doubleValue);
		
		//연산중에 묵시적 형변환 , 연산시 피연산자중에 더 큰 타입으로 결과 반환
		// 예외 - byte와 short 연산 결과는 무조건 int로 간다
		// byte + byte = int
		// byte + short = int
		// int + int = int
		// int + long = long
		// int + float = float
		// fploat + double = double
		
		byte b1 = 10; byte b2 = 20; short s1 = 30;  int i1 = 40;
		float f1 =3.14F; double d1 = 3.14;
		int result1 = b1 + b2;
		int result2 = b1 + s1;
		float result3 = i1 + f1;
		double result4 = f1 + d1;
		
		// 2. 강제(자료/타입)형 변환, 명시적 (자료/타입)형 변환, 캐스팅
			// -1. 메모리 크기가 큰 값 부터 작은 순으로 변환
			// -2. 데이터의 (허용범위 외)손실이 있을 수도 있다
			// - double -> float -> long -> int -> short, char -> byte
		double value1 = 3.14;
		float value2 = (float)value1;
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println(value6); // 3.14 -> 3 (데이터 손실)
		
		// +++자바특징중에 다형성(다양한 형식/타입을 가지는 성질)은 형변환으로 부터 표현할 수 있다.
		
		int result5 = (int)3.14 + 3;
		
		int a = 10;
		double b = 2.0;
		double result10 = a + b;
		System.out.println(result10);
		
		char 문자 = '글';
		int 문자정수1 = 문자;
		System.out.println(문자정수1);

		
	}

}
