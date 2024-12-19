package day08;

public class Student { // 객체를 만들기위한 설계 클래스
	// 클래스의 구성멤버 : 멤버변수, 멤버함수(메소드), 생성자
	// 1. 멤버변수 : 객체가 가질수 있는 고유한 성질/특성/값 * 상태
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 2. 메소드(멤버함수) : 객체가 행위 할 수 있는 명령어 집합/묶음 *행위
	// 현재 객체의 학생명을 호출했던곳으로 반환하는 함수
		// - 메소드 정의/만들기 : String : 반환타입 , getStudentName : 함수명, (	) : 매개변수생략, {	} : 실행코드, return : 함수종료 및 반환값	
	public String getStudentName() {
		return studentName; 
	}
	// 매개변수로 받은 새로운학생명을 객체의 학생명에 저장/대입 하는 함수
	public void setStudentName(String name) { // void : 반환값 없다, setStudentName : 함수명, (String name) : 매개변수 1개, {	} : 실행코드, return : 생략
		studentName = name;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
