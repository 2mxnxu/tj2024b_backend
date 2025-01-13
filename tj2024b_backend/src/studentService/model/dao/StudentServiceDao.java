package studentService.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import studentService.model.dto.StudentServiceDto;

public class StudentServiceDao {
    
    private static StudentServiceDao instance;

    private Connection conn;
    private String dburl = "jdbc:mysql://localhost:3306/studentservice";
    private String dbuser = "root";
    private String dbpwd = "1234";

    private StudentServiceDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static StudentServiceDao getInstance() {
        if (instance == null) {
            instance = new StudentServiceDao();
        }
        return instance;
    }

    public boolean resister(StudentServiceDto studentServiceDto) {
        try {
            String sql = "INSERT INTO student(sname, sko, smt, sen) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, studentServiceDto.getSname());
            ps.setInt(2, studentServiceDto.getSko());
            ps.setInt(3, studentServiceDto.getSmt());
            ps.setInt(4, studentServiceDto.getSen());
            int count = ps.executeUpdate();
            return count == 1; 
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

	public ArrayList<StudentServiceDto> show() {
		ArrayList<StudentServiceDto> list = new ArrayList<StudentServiceDto>();
		
		try {
			String sql = "SELECT * FROM student";
			PreparedStatement ps;
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String sname = rs.getString("sname");
				int sko = rs.getInt("sko");
				int smt = rs.getInt("smt");
				int sen = rs.getInt("sen");
				StudentServiceDto studentServiceDto = new StudentServiceDto(sname, sko, smt, sen);
				list.add(studentServiceDto);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	
	}
	public boolean deleteByName(String name) {
        try {
            String sql = "DELETE FROM student WHERE sname = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            int result = ps.executeUpdate();
            return result > 0; 
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
	public boolean updateScoresByName(String name, int sko, int smt, int sen) {
        String sql = "UPDATE student SET sko = ?, smt = ?, sen = ? WHERE sname = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, sko);
            ps.setInt(2, smt);
            ps.setInt(3, sen);
            ps.setString(4, name);
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}


