package Day10;

class Address {
	int houseNo;
	String City;
	String state;
	int pin;
}

class Student {
	String name;
	int age;
	
	// Has-A variable (one to one) means one student can have one address
	Address address;
	
	// Has-A variable (one to many) means one student can have many address
	Address[] addresses;
}

public class HasARelationship {
	public static void main(String[] args) {

	}
}
