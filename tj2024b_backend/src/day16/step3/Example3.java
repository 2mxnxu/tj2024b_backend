package day16.step3;

class Parent{
	String filed1;
	
	public void method1() {
		System.out.println("Parent method1");
	}
	public void method2() {
		System.out.println("Parent method2");
	}
}

class Child extends Parent{
	String filed2;
	public void method3() {
		System.out.println("Parent method3");
	}
	// 물려받은 메소드를 재정의/코드변경 = 오버라이딩
		// 주의할점 : 메소드의 선언부는 동일하게 작성, { } 안에 있는 코드만 재정의
	@Override // 오버라이딩 어노테이션 // 생략 가능하다. 
	//멤버변수가 동일하면 this/super, 메소드명이 동일하면 this/super X 
	//이유 : 멤버변수는 인스턴스마다 할당, 메소드는 모든 인스턴스가 하나의 메소드를 공유해서 사용하기 때문
	public void method1() {
		System.out.println("Child method1");
	}
	public void method2() {
		System.out.println("Child method2");
	}
}

public class Example3 {
	public static void main(String[] args) {
		// 1. 자식 인스턴스 생성
		Child child = new Child();
		child.method1(); // 자식의 인스턴스는 부모클래스의 메소드를 사용할 수 있다. 단] 오버라이딩 메소드인 경우 현 인스턴스의 메소드가 호출 즉] 오버라이딩이 최우선 호출대상
		child.method2();
		child.method3();
		
		// 2. 자식 클래스의 인스턴스가 부모 클래스로 타입 변환
		Parent parent = child; // 타입변환
		parent.method1();	   // 타입이 변환된다고 해서 인스턴스 바뀌는건 아니다.
		parent.method2();
		// parent.method3();   // 타입변환시 하위 타입의 멤버에 접근할 수 없다.
		
		// 3. 부모클래스의 타입에서 자식클래스의 타입 변환
		Child child2 = (Child)parent;
		child2.method1();
		child2.method2();
		child2.method3();
		
		// 4. 부모 클래스의 인스턴스 생성
		Parent parent2 = new Parent();
		parent2.method1();
		//Child child3 = (Child)parent2; // 부모타입 --> 자식타입 fail // 태생이 child 아니라서
		// * 태생검사
		if (parent2 instanceof Child) { // parent2 변수가 가리키는 인스턴스가 Child 타입을 참조하고 있어?
			Child child3 = (Child)parent2;
		}else{
			System.out.println("타입을 반환할 수 없습니다.");
		}
	}
}
/*
 	- 원래 코드는 메소드/생성자 명을 동일하게 정의할 수 없다. (메소드명/생성자명 중복 불가능)
 	- 공통점 : 동일한 메소드명으로 여러개 메소드를 정의할 수 있도록 지원하는 문법
 	- 차이점 
 	* 오버라이딩 
 	- 상속관계에 있어서 상위클래스의 메소드명과 동일하게 선언이 가능하다.
 	- 목적 : 상위 클래스의 메소드를 재정의 하기 위해
 	- 전제조건 : 반환타입 메소드명 매개변수가 모드 동일하게 작성해야 한다.
 	- 주사용처 : 상속 extends
 	
 	class A {void method(){}}
 	class B extends A {void method(){}}
 	
 	* 오버로딩 
 	- 동일한 메소드/생성자 명으로 여러개 선언이 가능하다.
 	- 전제조건 : 매개변수의 개수, 매개변수 순서, 매개변수 타입 3가지의 차이점이 존재하면 동일한 메소드명으로 선언이 가능하다.
 	- 목적 : 다양한 상황에따라 초기값을 제공하기 위해
 	- 주사용처 : 생성자, 메소드
 	member(int a) {	}
 	member(int a, int b) {	}
 */

