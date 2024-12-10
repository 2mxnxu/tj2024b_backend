package day02;

public class Example3 {

	public static void main(String[] args) {
		
		// [콘솔 출력]
		System.out.println();
		// System : 시스템 관련 기능 제공하는 클래스/설계도
		// out : 출력관련 객체 반환 vs in : 입력관련 객체 반환
		// print() : 출력함수
		// .(접근/도트) : 객체 또는 클래스내 속성/필드 접근하는 연산자
		
		// \n : 줄바꿈 , \t 들여쓰기 
		
		// 1. println() : 인수값을 CONSOLE 출력 후 줄바꿈 처리하는 함수
		System.out.println("JAVA1");
		System.out.println("JAVA2");
		
		// 1. print() : 인수값을 CONSOLE 출력 후 줄바꿈 처리하지 않는 함수
		System.out.print("JAVA3");
		
		// 3. printf("형식문자", 형식대입값) : 인수값에 형식 문자를 이용하여 수식을 출력하는 함수
		/*
		 형식문자, printf() 함수에서 사용되는 의미가 담긴 문자
		 %s : 문자열, %d : 정수, %c : 문자, %f : 실수
		 자리수 맞추기 %자리수d : 자리수 만큼 자리수 차지, 만일 비어 있으면 공백처리, 오른쪽정렬
		 */
		System.out.printf("%s", "JAVA4");
		String name = "유재석"; int age = 40;
		System.out.printf("저는 %s이고 나이는 %d 입니다 \n", name, age);
		System.out.println("저는 "+name+"이고 나이는 "+age+"입니다 \n");
		System.out.printf("저는 %s이고 나이는 %6d 입니다 \n", name, age);
		System.out.printf("저는 %s이고 나이는 %-6d 입니다 \n", name, age);
		System.out.printf("저는 %s이고 나이는 %06d 입니다 \n", name, age);
		System.out.printf("저는 %s이고 나이는 %5.2f 입니다 \n", name, 188.257);
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

}
