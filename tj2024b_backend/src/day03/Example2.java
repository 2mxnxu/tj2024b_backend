package day03;

public class Example2 {

	public static void main(String[] args) {

		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge = teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		int num1;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		int n1 = 10;
		int n2 = 20;
		boolean result;
		
		result = ((n1>10)&&(n2>10));
		System.out.println(result);
		result = ((n1>10)||(n2>10));
		System.out.println(result);
		System.out.println(!result);
		
		int nu = 8;
		System.out.println(nu += 10);
		System.out.println(nu -= 10);
		System.out.println(nu >> 2);
		
		int num3 = 10;
		int num4 = 20;
		int result1 = (num3>=10) ? num4+10 : num4-10;
		System.out.println(result1);
		

		
	}

}
