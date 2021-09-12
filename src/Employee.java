
public class Employee {
	
	String name;
	String sex;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String sex, int salary) {
		super();
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}
	

}
