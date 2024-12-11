package day03;

public class Example1 {

	public static void main(String[] args) {
		int age = 24;
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 70;
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore/3.0;
		System.out.println(avgScore);
		
		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		System.out.println(num);
		
		int num2 = 10;
		int value2;
		value2= ++num2;  // num2 값이 1증가 한 후에 value2 변수에 대입
		System.out.println(value2); // num2 = 11, value2 = 11
		value2 = num2++; // value2 변수에 기존 num2 값이 먼저 대입한 후 num2 값이 1증가
		System.out.println(value2); // num2 = 12, value2 = 11
		value2 = --num2; // num2 값이 1감소한 후에 value2 변수에 대입
		System.out.println(value2); // num2 = 11, value2 = 11
		value2 = num2--; // value2 변수에 기존 num2 값이 먼저 대입한후 num2값이 1감소
		System.out.println(value2); // num2 = 10, value2 = 11
		
		int x = 10;
		int y = x-- +5 + --x;
			// 연산순서
			// 1. x-- +5 --> 10 + 5 = 15 [x는 +연산 후 1차감] x = 9
			// 2. 15 + --x -> 15 + 8 = 23 [x는 +연산 전 1차감] x = 8
		System.out.println(x);
		System.out.println(y);

		int myAge = 26;
		boolean value = (myAge>25);
		System.out.println(value);
		
		int num1 =10;
		int i = 2;
		
		boolean value3 = ((num1 = num1 + 10)<10) && ((i = i+2)<10);
		System.out.println(value3);
		
		value3 = ((num1 = num1 + 10)>10) || ((i = i+2)<10);
		System.out.println(value3);
		
		int n = 0;
		int n1 = 1;
		n += 5;
		n *= n1;
		System.err.println(n);
		
		int father = 45;
		int mother = 47;
		
		char ch;
		ch = (father>mother) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}

}
