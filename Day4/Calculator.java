package Day4;

class Calc {
	int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	int subtraction() {
		int num1 = 10;
		int num2 = 5;
		int result = num1 - num2;
		return result;
	}
	
	void multiplication(int num1, int num2) {
		System.out.println("multiplication : " + num1 * num2);;
	}
	
	void division() {
		int num1 = 10;
		int num2 = 5;
		System.out.println("division : " + num1 / num2);
	}
}
public class Calculator {
	public static void main(String[] args) {
		int result;
		Calc calc = new Calc();
		result = calc.addition(10, 20);
		System.out.println("addition : " + result);
		
		result = calc.subtraction();
		System.out.println("subtraction : " + result);
		
		calc.multiplication(15, 4);
		calc.division();
	}
}
