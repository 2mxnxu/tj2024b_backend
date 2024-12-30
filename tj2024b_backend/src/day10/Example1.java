package day10;

public class Example1 {

	public static void main(String[] args) {

		Student s1= new Student();
		s1.studentID =1;
		s1.studentName = "유재석";
		s1.koreanScore = 98;
		s1.MathScore = 98;
		s1.koreanSubject = "국어";
		s1.MathSubject = "수학";
		
		Student s2= new Student();
		s2.studentID =1;
		s2.studentName = "유재석";
		s2.koreanScore = 98;
		s2.MathScore = 98;
		s2.koreanSubject = "국어";
		s2.MathSubject = "수학";
		
		Student2 s3 = new Student2();
		s3.studentID = 3;
		s3.studentName = "신동엽";
			Subject sub1 = new Subject();
			sub1.subjectName = "수학";
			sub1.scorePoint = 80;
			s3.korean = sub1;
			Subject sub2 = new Subject();
			sub1.subjectName = "국어";
			sub1.scorePoint = 70;
			s3.math = sub2;
			
	}

}
