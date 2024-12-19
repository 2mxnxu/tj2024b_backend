package day09;

import java.util.Scanner;

public class WaitProgram {
	void waitAdd(Scanner sc, Wait[] waitArr) {
		System.out.println("전화번호 입력");
		String phone = sc.next();
		System.out.println("인원수 입력");
		int count = sc.nextInt();

		Wait wait = new Wait();
		wait.phone = phone;
		wait.count = count;
		
		boolean saveState = false;
		for(int i = 0; i <= waitArr.length-1; i++) {
			if(waitArr[i] == null) {
				waitArr[i] = wait;
				saveState = true;
				break;
			}
		}
		if(saveState) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록 실패");
		}
}
		void waitPrint(Wait[] waitArr) {
			for(int i = 0; i <= waitArr.length-1; i++) {
				Wait wait = waitArr[i];
				if(wait != null) {
					System.out.println("순번 : "+ i+1 +  "전화번호 : " + wait.phone + "인원수 :" +wait.count);
				}
			}
		}
	}

