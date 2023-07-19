package Day12;

@FunctionalInterface										// this annotation will not allow to write any more abstract method
interface Demo {
	
	void display();
	
	default void show() {
		
	}
}

// Implementation of interface in traditional way
/*
class DemoImpl implements Demo {
	@Override
	public void display() {
		System.out.println("DemoImpl.display()");
	}
}
*/

@FunctionalInterface										// this annotation will not allow to write any more abstract method
interface Demo2 {
	
	int addition(int a, int b);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
//		for first approach -> traditional way 
//		DemoImpl impl = new DemoImpl();
//		impl.display();
		
		// Implementation of interface Demo using anonymous inner class (can be used for non-functional interfaces as well)
		/*
		Demo demo = new Demo() {
			@Override
			public void display() {
				System.out.println("FunctionalInterfaceDemo.main(...).new Demo() {...}.display()");
			}
		};
		demo.display();
		*/
		
		// Implementation of interface Demo2 using anonymous inner class
		Demo2 demo2 = new Demo2() {
			
			@Override
			public int addition(int a, int b) {
				return (a + b);
			}
		};
		System.out.println(demo2.addition(10, 20));
		
		
	}
}
