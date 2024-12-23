package day11;

// (2) 게시물정보를 갖는 객체의 설계 클래스
public class BoardDto {

	// * 클래스 멤버
	
	// 1. 멤버변수, 접근제한자, 객체 속성
	private String title;
	private String content;
	private String writer;
	
	// 2. 생성자, 객체 생성시 초기화 담당 역할, new 생성자()
		// + 디폴트 생성자 규칙 : 클래스명과 동일, 매개변수와 인수값 타입/개수 일치
	public BoardDto() {} 
	public BoardDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	} 
	
	// 3. 메소드// 멤버함수, 객체가 실행할 함수 정의
		// getter(호출) and setter(저장) : private 멤버변수를 다른 클래스로부터 간접접근 제공
	public String getTitle() { return this.title; }
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() { return this.content; }
	public void setContent(String content) {this.content = content;}
	
	public String getWriter() { return this.writer; }
	public void setWriter(String writer) {this.writer = writer;}

}
