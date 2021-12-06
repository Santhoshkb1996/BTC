package SolveProblem;

public class Department {
	public int depid;
	public String depname;
	public int managerid;
	public Department(int depid, String depname, int managerid) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.managerid = managerid;
	}
	public Department() {
		super();
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	
}
