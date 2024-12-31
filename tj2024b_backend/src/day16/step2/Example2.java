package day16.step2;

class 상위클래스{
	int value1 = 10;
	int value3 = 30;
}
class 하위클래스 extends 상위클래스{
	int value1 = 100;
	int value2 = 200;
}

public class Example2 {
	public static void main(String[] args) {
		// 상위클래스 인스턴스 생성
		상위클래스 obj1 = new 상위클래스();
		System.out.println(obj1.value1); // 본인 인스턴스의 멤버변수 호출 // 단 하위클래스의 멤버변수 접근 불가능
		// 하위클래스 인스턴스 생성
		하위클래스 obj2 = new 하위클래스();
		System.out.println(obj2.value1);
		System.out.println(obj2.value2); // 만일 상위클래스와 하위클래스의 멤버변수가 같으면 현재 클래스의 멤버변수가 우선순위
		System.out.println(obj2.value3); // 하위클래스의 인스턴스는 상위클래스의 멤버변수 호출 가능

		
	}
}
