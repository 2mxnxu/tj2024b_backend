package studentService.controller;

import java.util.ArrayList;
import studentService.model.dao.StudentServiceDao;
import studentService.model.dto.StudentServiceDto;

public class StudentServiceController {

	private static StudentServiceController instance = new StudentServiceController();
	private StudentServiceController() {};
	public static StudentServiceController getInstance() {
		return instance;
	}
	public ArrayList<StudentServiceDto> show(){
		ArrayList<StudentServiceDto> result = StudentServiceDao.getInstance().show();
		return result;
			}
	public boolean deleteByName(String name) {
		return false;
	}


	public boolean deleteStudentByName(String name) {
		return StudentServiceDao.getInstance().deleteByName(name);
	}
	public boolean updateStudentScores(String name, int sko, int smt, int sen) {
        return StudentServiceDao.getInstance().updateScoresByName(name, sko, smt, sen);
    }
}


