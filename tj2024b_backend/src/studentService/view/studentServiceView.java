package studentService.view;

import java.util.ArrayList;
import java.util.Scanner;

import studentService.controller.StudentServiceController;
import studentService.model.dao.StudentServiceDao;
import studentService.model.dto.StudentServiceDto;

public class studentServiceView {
	private static studentServiceView instance = new studentServiceView();
	private studentServiceView() {}
	public static studentServiceView getInstance() {return instance;}
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(true) {
		System.out.println("1. 점수등록 2. 전체학생 점수 조회 3. 점수삭제 4. 점수수정");
		int choose = sc.nextInt();
		if(choose == 1) {				
			resister();
		}else if(choose == 2) {
			show();
		}else if(choose == 3) {
			delete();
		}else if(choose == 4) {
			update();
		}
		}
	}
	
	public void resister() {
		while(true) {
			System.out.println("이름 :");
			String sname = sc.next();
			System.out.println("국어 점수 :");
			int sko = sc.nextInt();
			System.out.println("수학 점수 :");
			int smt = sc.nextInt();
			System.out.println("영어 점수 :");
			int sen = sc.nextInt();
			StudentServiceDto studentServiceDto = new StudentServiceDto(sname, sko, smt, sen);
			 boolean result = StudentServiceDao.getInstance().resister(studentServiceDto);
			if(result) {
				System.out.println("등록성공");
				break;
			}else {
				System.out.println("등록실패");
			}
		}
		
	}
	public void show() {
		ArrayList<StudentServiceDto> result = StudentServiceController.getInstance().show();
		System.out.println("이름\t국어\t수학\t영어");
		for(int index = 0; index <=result.size()-1; index++) {
			StudentServiceDto studentServiceDto = result.get(index);
			System.out.print(studentServiceDto.getSname() + "\t");
			System.out.print(studentServiceDto.getSko()+ "\t");
			System.out.print(studentServiceDto.getSmt() + "\t");
			System.out.print(studentServiceDto.getSen()+ "\n");
			
		}
	}
	public void delete() {
        System.out.println("삭제할 학생 이름 :");
        String name = sc.next();
        boolean result = StudentServiceController.getInstance().deleteStudentByName(name);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }
	public void update() {
        System.out.println("이름:");
        String name = sc.next();

        System.out.println("새로운 국어 점수 :");
        int sko = sc.nextInt();

        System.out.println("새로운 수학 점수 :");
        int smt = sc.nextInt();

        System.out.println("새로운 영어 점수 :");
        int sen = sc.nextInt();

        boolean result = StudentServiceController.getInstance().updateStudentScores(name, sko, smt, sen);
        if (result) {
            System.out.println("점수 수정 완료");
        } else {
            System.out.println("점수 수정 실패");
        }
    }


}

