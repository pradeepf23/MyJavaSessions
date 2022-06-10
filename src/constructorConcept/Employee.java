package constructorConcept;

public class Employee {

	
	
	String name;
	int age;
	String phone;
	boolean isActive;
	String city;
	
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Employee(String name, String phone, boolean isActive) {
		this.name = name;
		this.phone = phone;
		this.isActive = isActive;
	}

	public Employee(String name, int age, String phone, boolean isActive, String city) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.isActive = isActive;
		this.city = city;
	}
	
	
}
