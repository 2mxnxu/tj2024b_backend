package day11;

public class JoinInfo {
	private String id;
	private String pw;
	private String name;
	
	public String getId() {
        return id;  
    }
	
	public String getPw() {
        return pw;
    }
	
	public String getName() {
        return name;
    }
	
	public void setId(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
