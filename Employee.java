package practice;

public class Employee {
 private String name;
 private int salary;
 private String gender;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
}
public Employee(String name, int salary, String gender) {
	super();
	this.name = name;
	this.salary = salary;
	this.gender = gender;
}

}
