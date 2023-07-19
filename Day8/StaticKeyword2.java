package Day8;

public class StaticKeyword2 {

	static int a, b, c;

	static {
		System.out.println("Inside first static block");
		a = 10;
		b = 20;
		c = 30;
	}

	static void displayStatic() {
		System.out.println("Inside static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	int d, e, f;

	{
		System.out.println("Inside non-static block");
		d = 100;
		e = 200;
		f = 300;
		
		a = 40;
		b = 50; 
		c = 60;
	}

	void displayNonStatic() {
		System.out.println("Inside non-static method");
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public StaticKeyword2() {
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		displayStatic();
		StaticKeyword2 keyword2 = new StaticKeyword2();
		keyword2.displayNonStatic();
	}
}
