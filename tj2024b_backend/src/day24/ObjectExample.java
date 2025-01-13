package day24;

class Book{}

public class ObjectExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = 3;
		Object obj3 = 3.14;
		Object obj4 = "유재석";
		Object obj5 = new int[] {3,10,20};
		Object obj6 = new Book();
		
		System.out.println(obj6.toString());
		System.out.println(obj1 == obj2);
		Object obj7 = obj6;
		System.out.println(obj7 == obj6);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj7.equals(obj6));
		
		System.out.println(obj1.hashCode()); // 객체의 위치를 정수로 표현
		System.out.println(obj6.hashCode());
		System.out.println(obj7.hashCode());
	}
	
}
