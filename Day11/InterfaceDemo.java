package Day11;

import java.util.Scanner;

interface Calculatorr {
	
	void add();
	
	void sub();
	
	int a = 10;				// by default this is public static final
}

class MyCalculator implements Calculatorr {

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition : " + (a + b));
	}
	
	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Subtraction : " + (a - b));
	}
}

class MyOtherCalculator implements Calculatorr {

	@Override
	public void add() {
		int a = 20;
		int b = 40;
		System.out.println("Addition : " + (a + b));
	}

	@Override
	public void sub() {
		int a = 20;
		int b = 40;
		System.out.println("Subtraction : " + (b - a));
	}
	
}

class CalUtility {
	public void doOperations(Calculatorr calculator) {
		calculator.add();
		calculator.sub();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		MyCalculator calc1 = new MyCalculator();
		MyOtherCalculator calc2 = new MyOtherCalculator();
		
		CalUtility utility = new CalUtility();
		utility.doOperations(calc1);
		utility.doOperations(calc2);
		
//		Calculatorr.a = 20;				// will give error as a is final
	}
}
