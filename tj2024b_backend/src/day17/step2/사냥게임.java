package day17.step2;

// 키보드 인터페이스를 사냥게임 클래스가 구현
public class 사냥게임 implements 키보드 {
	// class 클래스명 implements 인터페이스명
	
	// 추상메소드 구현, 오버라이딩
	@Override
	public void aKey() {
		System.out.println("[공격]");
	}
	@Override
	public void bKey() {
		System.out.println("[방어]");
	}
}
