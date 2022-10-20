package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Employee, String> empmap = new HashMap<>();
		
		Employee emp1 = new Employee("Mahesh", 101l);
		Employee emp2 = new Employee("Rajesh", 102l);
		
		empmap.put(emp1, "HYD");
		empmap.put(emp2, "MUM");
		
		
		emp1.setName("Rajesh");
		
		System.out.println(empmap.get(emp1));

	}

}

class Employee {
	
	private String name;
	private long mobile;
	
	public Employee(String string, long i) {
		this.name = string;
		this.mobile = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mobile, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return mobile == other.mobile && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}