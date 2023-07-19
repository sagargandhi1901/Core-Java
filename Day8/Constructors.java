package Day8;

class Employee {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	// Parameterized constructor
	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// non Parameterized constructor
	public Employee() {
		this.age = 18;
		this.name = "some name";
	}
}

class Teacher {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

class College {
	String name;
	int pinCode;
	
	public String getName() {
		return name;
	}
	public int getPinCode() {
		return pinCode;
	}
	
	public College() {
		// constructor chaining
		this("default-name", 123);				// sending default values in case when no value is provided by user
	}
	
	public College(String name, int pinCode) {
		this.name = name;
		this.pinCode = pinCode;
	}
}

public class Constructors {
	public static void main(String[] args) {
		Employee employee = new Employee(25, "Sagar");			// Parameterized constructor will be called 
		System.out.println(employee.getAge());
		System.out.println(employee.getName());
		
		Employee employee2 = new Employee();					// Non Parameterized constructor will be called
		System.out.println(employee2.getAge());
		System.out.println(employee2.getName());
		
		Teacher teacher = new Teacher();						// default constructor will be called
		System.out.println(teacher.getAge());
		System.out.println(teacher.getName());
		
		College college1 = new College("Thapar", 411057);
		System.out.println(college1.getName());
		System.out.println(college1.pinCode);
		
		College college2 = new College();
		System.out.println(college2.getName());
		System.out.println(college2.pinCode);
	}
}
