package day04;

public class Example2 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum +=i; // sum = sum + i
			i++;	  // i = i + 1
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int num2 = 1; num2<=10; num2++)  {
			sum2 += num2;
		}
		System.out.println(sum2);
		
		/*while(true) {
			System.out.println("무한루프");
		}*/
		/*
		for(;;) {
			System.out.println("무한루프");
		}*/
		
		int num3 = 1;
		int sum3 = 0;
		
		do { // 먼저 실행 후
			sum3 += num3;
			num3++;
		}while(num3 <= 10); // 실행 후 조건 검사 
			System.out.println(sum3);
		
		// 구구단중에서 2단만 출력 while문 do~while로 구현
			int googoo = 1;
			int gogo = 2;
			while(googoo<=9) {
				System.out.println("2*" + googoo + "=" + gogo*googoo);
				googoo++;
			}
			int googoo1 = 1;
			do {
				System.out.println("2*" + googoo1 + "=" + gogo*googoo1);
				googoo1++;
			}while (googoo1 <= 9);
			
			 for(int gob = 1; gob <=9; gob++) {
				 System.out.println("2*" + gob + "=" + 2*gob);
			 }
			int sum4 = 0;
			for(int num =0; ;num++) {
				sum4 += num;
				if(sum4>=100) {
					break;
				}
			}
			
	}
	

}
