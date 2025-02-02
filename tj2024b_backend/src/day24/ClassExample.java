package day24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		// [1] .getClass() 메소드
				String s = new String();
				Class c = s.getClass();
				System.out.println(c);
				Integer i = 3;
				Class c1 = i.getClass();
				System.out.println(c1);
				
				Class c2 = String.class;
				System.out.println(c2);

				try {
					Class.forName("java.lang.String");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {

				}
				// 클래스 정보(클래스 = 멤버변수/생성자/메소드)를 반환 함수.
				Field[] fields =  c.getFields();
				for(int index = 0; index<= fields.length -1; index++) {
					System.out.println(fields[index]);
				}
				Constructor[] constructors = c.getConstructors();
				for(int index = 0; index<=constructors.length-1; index++) {
					System.out.println(constructors[index]);
				}
				Method[] methods = c.getMethods();
				for(int index = 0; index <= methods.length-1; index++) {
					System.out.println(methods[index]);
				}
				
	}	
}
