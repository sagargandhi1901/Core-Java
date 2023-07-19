package Day11;

interface Demo1 {
	void display();
	
	default void show() {
		System.out.println("Show method implementation");
	}
}

class DemoImpl implements Demo1 {

	@Override
	public void display() {
		System.out.println("Display method implementation");
	}
	
	@Override
	public void show() {
		System.out.println("Show method overridden implementation");
	}
}

public class DefaultMethodInInterface {
	public static void main(String[] args) {
		DemoImpl impl = new DemoImpl();
		impl.display();
		impl.show();
	}
}
