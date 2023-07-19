package Day10;

final class A {
	
}

//class B extends A {									// This will give error as A is final so cannot be inherited
//	
//}

class X {
	
	final int i = 10;
	
	public final void display() {
//		i = 20;											// This will give error as i variable is final so it is a constant, value cannot be changed
		System.out.println("Parent class method");
	}
}

class Y extends X {
	
//	@Override											// This will give error as display method has been made final so it cannot be overridden	
//	public void display() {
//		System.out.println("Parent class method");
//	}
}


public class FinalKeyword {
	public static void main(String[] args) {
		
	}
}
