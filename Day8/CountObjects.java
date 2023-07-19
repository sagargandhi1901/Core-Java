package Day8;

class Person2 {
	private int age;
	private String name;
	static int count;
	
	Person2() {
//		count++;
	}
	
	Person2(int age) {
		this.age = age;
//		count++;
	}
	
	Person2(int age, String name) {
		this.age = age;
		this.name = name;
//		count++;
	}
	
	{
		count++;
	}
}

public class CountObjects {
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		Person2 p2 = new Person2(25);
		Person2 p3 = new Person2(25, "Sagar");
		
		System.out.println(Person2.count);
	}
}