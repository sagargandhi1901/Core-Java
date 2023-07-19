package Day10;

// dependent object class
class Account {
	private String accountNumber;
	private String accountType;
	private String bankName;

	// constructor injection
	public Account(String accountNumber, String accountType, String bankName) {
		System.out.println("Account :: constructor");
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getBankName() {
		return bankName;
	}
}

// target object class
class Employee {
	private Integer empId;
	private String name;
	private String email;
	
	// Has-A variable -> employee has a account
	private Account account;

	// constructor injection
	public Employee(Integer empId, String name, String email, Account account) {
		System.out.println("Employee :: constructor");
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.account = account;
	}
	
	// displaying the data of employee
	public void displayData() {
		System.out.println("Employee :: display() method");
		System.out.println("***********EMPLOYEE DETAILS*************");
		System.out.println("Id : " + empId);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("***********ACCOUNT DETAILS*************");
		System.out.println("Account number : " + account.getAccountNumber());
		System.out.println("Account type : " + account.getAccountType());
		System.out.println("Bank name : " + account.getBankName());
	}
}

public class OneToOneAssociationConstructorInjection {
	public static void main(String[] args) {
		
		// creating a dependent object using constructor	
		Account account = new Account("1111", "Salary account", "HDFC");
		
		// creating the target object and inject the dependent object in the constructor only
		Employee employee = new Employee(10, "Sagar", "sagar.gandhi@capgemini.com", account);
		
		// displaying the data
		employee.displayData();
	}
}
