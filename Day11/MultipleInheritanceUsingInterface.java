package Day11;

interface Calc1 {
	
	void add(int a, int b);	
}

interface Calc2 {
	int sub(int a, int b);
}

class CalcImplementation implements Calc1, Calc2 {

	@Override
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition : " + c);
	}
	
	@Override
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}
}

public class MultipleInheritanceUsingInterface {
	public static void main(String[] args) {
		CalcImplementation calcimpl = new CalcImplementation();
		calcimpl.add(10, 20);
		System.out.println("Subtraction is : " + calcimpl.sub(20, 10));
	}
}
