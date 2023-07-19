package Day11;

interface Calculator2 {
	void add();
}

class MyCalc2 {
	void sub() {
		int a = 20; 
		int b = 10;
		System.out.println(a - b);
	}
}

class CalcImpl2 extends MyCalc2 implements Calculator2 {
	@Override
	public void add() {
		int a = 20; 
		int b = 10;
		System.out.println(a + b);
	}
	
	// sub() method of MyCalc2 also we can use or override here as per the concept of inheritance
}

public class ExtendImplement {
	public static void main(String[] args) {
		CalcImpl2 obj = new CalcImpl2();
		obj.sub();
	}
}
