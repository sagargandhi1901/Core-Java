package Day11;

abstract class Calculator {
	
	abstract int add(int a, int b);
	
	abstract void sub(int a, int b);
}

class Calc extends Calculator {

	@Override
	int add(int a, int b) {
		return (a + b);
	}

	@Override
	void sub(int a, int b) {
		System.out.println(a - b);
	}
	
}

public class AbstractKeyword {
	public static void main(String[] args) {

	}
}
