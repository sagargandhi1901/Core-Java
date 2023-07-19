package Day10;

// Dependent Object
class Branch {
	private String branchId;
	private String branchLocation;
	
	public Branch(String branchId, String branchLocation) {
		this.branchId = branchId;
		this.branchLocation = branchLocation;
	}

	// getters to get the values
	public String getBranchId() {
		return branchId;
	}

	public String getBranchLocation() {
		return branchLocation;
	}
}

// target object
class Studnt {
	private Integer studentId;
	private String name;
	private Integer age;
	
	// Has-A variable
	private Branch branch;

	// constructor onjection
	public Studnt(Integer studentId, String name, Integer age, Branch branch) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	
	public void getStudetDetils() {
		System.out.println("*******************Student Details*******************");
		System.out.println("Id : " + studentId);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("-----------------------");
		System.out.println("Branch details :: ");
		System.out.println("branch id : " + branch.getBranchId());
		System.out.println("branch location : " + branch.getBranchLocation());
	}
}

public class ManyToOneAssociation {
	public static void main(String[] args) {
		
		// creating a dependent object
		Branch branch = new Branch("PUN12", "Hinjewadi, Pune");
		
		// creating target objects
		Studnt student1 = new Studnt(101, "Sagar", 25, branch);
		Studnt student2 = new Studnt(102, "Sparsh", 22, branch);
		Studnt student3 = new Studnt(103, "Diksha", 27, branch);
		
		student1.getStudetDetils();
		System.out.println();
		student2.getStudetDetils();
		System.out.println();
		student3.getStudetDetils();
	}
}
