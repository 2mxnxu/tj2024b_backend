package studentService.model.dto;

public class StudentServiceDto {
	
	public String sname;
	public int sko;
	public int smt;
	public int sen;
	
	
	public StudentServiceDto() {}
	public StudentServiceDto(String sname, int sko, int smt, int sen) {
		super();
		this.sname = sname;
		this.sko = sko;
		this.smt = smt;
		this.sen = sen;
	}
	@Override
	public String toString() {
		return "StudentServiceDto [sname=" + getSname() + ", sko=" + sko + ", smt=" + smt + ", sen=" + sen + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSko() {
		return sko;
	}
	public void setSko(int sko) {
		this.sko = sko;
	}
	public int getSmt() {
		return smt;
	}
	public void setSmt(int smt) {
		this.smt = smt;
	}
	public int getSen() {
		return sen;
	}
	public void setSen(int sen) {
		this.sen = sen;
	}

	
}
