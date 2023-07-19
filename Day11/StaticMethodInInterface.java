package Day11;

interface Demo2 {
	void display();
	
	static void show() {
		System.out.println("Show method implementation");
	}
}

class DemoImpl2 implements Demo2 {

	@Override
	public void display() {
		System.out.println("Display method implementation");
	}
}

public class StaticMethodInInterface {
	public static void main(String[] args) {
		Demo2.show();
	}
}
