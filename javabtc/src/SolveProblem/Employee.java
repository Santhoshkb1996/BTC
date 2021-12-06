package SolveProblem;

class Employee extends Department
{
    int id;
     
    String firstname;
    String lastename;
    String email;
     long phonenum;
     int hiredate;
     String designtion;
     double salary;
     
    int age;
     
    String gender;
     
    //String department;
     
    int managerid;

	public Employee(int depid, String depname, int managerid) {
		super(depid, depname, managerid);
	}

	public Employee(int depid, String depname, int managerid, int id, String firstname, String lastename, String email,
			long phonenum, int hiredate, String designtion, double salary, int age, String gender, int managerid2) {
		super(depid, depname, managerid);
		this.id = id;
		this.firstname = firstname;
		this.lastename = lastename;
		this.email = email;
		this.phonenum = phonenum;
		this.hiredate = hiredate;
		this.designtion = designtion;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		managerid = managerid2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastename() {
		return lastename;
	}

	public void setLastename(String lastename) {
		this.lastename = lastename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public int getHiredate() {
		return hiredate;
	}

	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
	}

	public String getDesigntion() {
		return designtion;
	}

	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
     
    //double salary;
     
    
}