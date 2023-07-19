package Day5;

class Calculator {
	
	public int addition(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int addition(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	public double addition(double num1, double num2) {
		return (num1 + num2);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int resultOfTwoNumbers = calculator.addition(10, 20);
		System.out.println("Result of addition of two numbers : " + resultOfTwoNumbers);
		
		int resultOfThreeNumbers = calculator.addition(10, 20, 30);
		System.out.println("Result of addition of three numbers : " + resultOfThreeNumbers);
		
		double resultOfTwoDoubleNumbers = calculator.addition(10.45, 20.87);
		System.out.println("Result of addition of two double numbers : " + resultOfTwoDoubleNumbers);
	}
}
