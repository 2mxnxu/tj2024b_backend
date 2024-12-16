package day06;

public class Example4 {

	public static void main(String[] args) {
		
		// [1] 클래스 정의하기, 객체를 만들기 위한 일종의 틀 만들기
		// ==> 생활속에서 틀/설계도
		// * 객체 설계도 클래스는 main함수가 없어도 된다.
		// * 클래스 생성하는 방법 : class 클래스명{ }
		
		// [2] 객체 생성하기, 클래스 기반으로 메모리 할당하기. , 인스턴스
		// ==> 붕어빵 2개 주세요. ==> 객체 2개 생성
		// * 객체 생성하는 방법 : new 클래스명(); , 클래스명 변수명 = new 클래스명();
		
		new 붕어빵틀(); // 붕어빵1 생성
		new 붕어빵틀(); // 붕어빵2 생성
		붕어빵틀 붕어빵1 = new 붕어빵틀(); // 붕어빵3 생성하고 변수에 담았다.
		붕어빵틀 붕어빵2 = new 붕어빵틀(); // 붕어빵4 생성하고 변수에 담았다.
		// [3] 객체 멤버의 접근하기, .(접근연산자)를 이용한 멤버변수 사용한다.
		붕어빵1.내용물 = "슈크림";
		붕어빵2.내용물 = "팥";
		
		//[1] 클래스 정의하기, 자동차
			// - 객체가 가질수 있는 속성들을 구성하여 클래스에 코드로 작성한다.
		
		//[2] 객체 생성하기, 클래스 기반
			// - new 클래스명();
		new Car(); // 객체 생성후 변수에 대입하지 않으면 사라진다.
		Car car1 = new Car(); // 주로 객체 생성과 동시에 변수에 담는다. * 변수타입은 객체의 클래스(타입)으로 한다.
		Car car2 = new Car();
		//[3] 객체의 멤버변수 접근하기, 동일한 설계도/클래스로 서로 다른 객체 2개 생성
		car1.차량주인 = "유재석";
		car2.차량주인 = "유재석";
		
		// - 생각해보기 : 클래스(붕어빵/자동차 제외)를 하나 생성하고 객체 2개 이상 선언하는 코드 작성
		Pet pet1 = new Pet();
		Pet pet2 = new Pet();
		
		pet1.petName = "뽀삐";
		pet2.petName = "우유";
	}

}
