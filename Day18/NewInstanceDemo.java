package Day18;

class Test {
	static {
		System.out.println("Student class loading");
	} 
	
	public Test() {
		System.out.println("Student object got created");
	}
}

public class NewInstanceDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// if in runtime the classname will come then create its object (pass this as arguments -> Day18.Test)
		// Class.forName will load the class
		Test t = (Test) (Class.forName(args[0]).newInstance());
	}
}