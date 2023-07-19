package Day9;

class X {
	public X() {
		super();						// default super() call for every constructor
		System.out.println("in X");
	}
	
	public X(int i) {
		super();						// default super() call for every constructor
		System.out.println("in X int");
	}
}

class Y extends X{
	public Y() {
		super();						// default super() call for every constructor
		System.out.println("in Y");
	}
	
	public Y(int i) {
		super();						// default super() call for every constructor
//		super(i);						// super(int i) call to parameterized constructor of parent class
		System.out.println("in Y int");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Y y = new Y();						// without inheritance it will call Y constructor
											// but with inheritance it will make a call to constructor of super class
	}
}
