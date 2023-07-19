package Day10;

// dependent class
class Teacher {
	private Integer tId;
	private String tName;
	
	// Constructor
	public Teacher(Integer tId, String tName) {
		this.tId = tId;
		this.tName = tName;
	}

	public Integer gettId() {
		return tId;
	}

	public String gettName() {
		return tName;
	}
}

// target class
class Department {
	private Integer deptNumber;
	private String deptName;
	private String deptLocation;
	
	// Has-A variable -> one department has many teachers
	private Teacher[] teachers;

	// Constructor Injection
	public Department(Integer deptNumber, String deptName, String deptLocation, Teacher[] teachers) {
		this.deptNumber = deptNumber;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
		this.teachers = teachers;
	}
	
	// displaying the data of employee
	public void displayData() {
		System.out.println("***************Department details***************");
		System.out.println("Department number : " + deptNumber);
		System.out.println("Department name : " + deptName);
		System.out.println("Department location : " + deptLocation);
		
		System.out.println("***************Teachers details***************");
		for (Teacher teacher : teachers) {
			System.out.println("teacher name is : " + teacher.gettName());
			System.out.println("teacher id is : " + teacher.gettId());
			System.out.println();
		}
	}
}

public class OneToManyAssociation {
	public static void main(String[] args) {
		
		// creating a dependent object using constructor injection
		Teacher teacher1 = new Teacher(123, "Sagar");
		Teacher teacher2 = new Teacher(111, "Diksha");
		Teacher teacher3 = new Teacher(145, "Sparsh");
		
		// creating an array to perform one to many association
		Teacher[] teachers = new Teacher[3];
		teachers[0] = teacher1;
		teachers[1] = teacher2;
		teachers[2] = teacher3;
		
		// creating target object using constructor injection
		Department department = new Department(1234567, "ECE", "Thapar, Patiala", teachers);
		
		department.displayData();
	}
}