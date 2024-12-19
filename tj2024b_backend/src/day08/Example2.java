package day08;

public class Example2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// 내가 만든 add함수에 num1값과 num2값을 인수로 전달하고 반환값을 sum변수에 대입
		int sum = add(num1,num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");

	}
	//(1) 함수 정의하기, 반환타입int, 함수명 add, 매개변수 int n1, int n2
	private static int add(int n1, int n2) {
		int result = n1 + n2;	// 반환값 : 함수가 종료되면서 현재 함수를 호출했던곳으로 반환값
		return result;
	}

}
