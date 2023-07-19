package Day13;

import java.util.Scanner;

class Division {
	public void division() throws ArithmeticException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers for division : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("Division result : " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Exception handled in division method");
			throw exception;
		} finally {
			System.out.println("This will always gets executed");
		}
	}
}

class Division2 {
	public void display() {
		try {
		Division calc = new Division();
		calc.division();
		} catch (Exception e) {
			System.out.println("Exception handled in display method");
		}
	}
}

public class TryCatchFinally {
	public static void main(String[] args) {
		Division2 division2 = new Division2();
		division2.display();
	}
}