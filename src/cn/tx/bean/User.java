package cn.tx.bean;

public class User {
	private String usrname;
	private String password;
	private String salary;
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [usrname=" + usrname + ", password=" + password + ", salary=" + salary + "]";
	}
	
	
	
}
