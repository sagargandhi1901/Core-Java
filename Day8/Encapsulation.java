package Day8;

class Book {
	private int pageNumber;

	public void setPageNumber(int x) {
		if (x > 0) {
			pageNumber = x;
		} else {
			System.out.println("Invalid input to the property");
		}
	}

	public int getPageNumber() {
		return pageNumber;
	}
}

class Person {
	private int age;
	private String name;

	public void setAge(int x) {
		if (x > 0) {
			age = x;
		} else {
			System.out.println("Invalid input to the property");
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}
}

class Fan {
	private String brandName;
	private int cost;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return this.cost;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Book book = new Book();
//		book.pageNumber = -75;										
//		System.out.println(book.pageNumber);
		book.setPageNumber(75);
		System.out.println(book.getPageNumber());

		Person person = new Person();
		person.setAge(25);
		System.out.println(person.getAge());
		person.setName("Sagar");
		System.out.println(person.getName());

		Fan fan = new Fan();
		fan.setBrandName("Bajaj");
		fan.setCost(2000);
		System.out.println(fan.getBrandName());
		System.out.println(fan.getCost());
	}
}