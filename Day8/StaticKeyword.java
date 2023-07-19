package Day8;

public class StaticKeyword {
	
	// static variable
	static int a, b, c;
	
	// static block
	static {
		System.out.println("Inside static block");
		a = 10;
		b = 20;
		c = 30;
	}
	
	// static method
	static void display() {
		System.out.println("Inside static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		display();
	}
}