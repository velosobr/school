package Aula03e04prog;


public class Employee {

	private String firstName;
	private String surname;
	private double salary;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String sname) {
		surname = sname;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double sal) {
		if (sal >= 0.0)
			salary = sal;
	}

}