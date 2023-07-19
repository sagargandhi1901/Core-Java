package Day10;

//dependent object class
class Account2 {
	private String accountNumber;
	private String accountType;
	private String bankName;
	
	// setter injection
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setBankName(String bankName) {
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

//target object class
class Employee2 {
	private Integer empId;
	private String name;
	private String email;
	
	// Has-A variable -> employee has a account
	private Account2 account;

	// setter injection
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccount(Account2 account) {
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

public class OneToOneAssociationSetterInjection {
	public static void main(String[] args) {
		
		// creating a dependent object
		Account2 acc = new Account2();
		
		// perform setter injection to inject the values
		acc.setAccountNumber("1111");
		acc.setAccountType("Savings");
		acc.setBankName("HDFC");
		
		// creating the target object and inject the dependent object in setter method
		Employee2 emp = new Employee2();
		emp.setName("Sagar");
		emp.setEmpId(123);
		emp.setEmail("sagar@gmail.com");
		
		// performing setter injection to account
		emp.setAccount(acc);
		
		// displaying the data
		emp.displayData();
	}
}
