package Day4;

class Laptop {
	
	String cpu;
	int ram;
	int hdd;
	
	public void doSomething() {
		System.out.println("Doing something...");
		System.out.println(ram);
	}
}

public class DemoObject {
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.ram = 8;
		obj.doSomething();
	}
}