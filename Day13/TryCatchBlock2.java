package Day13;

import java.util.Scanner;

class DivisionCalc {
	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for division : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int result = num1 / num2;
		System.out.println("Division result : " + result);
	}
}

class DivisionCalc2 {
	public void display() {
		DivisionCalc calc = new DivisionCalc();
		calc.division();
	}
}

public class TryCatchBlock2 {
	public static void main(String[] args) {
		try {
			DivisionCalc2 calc2 = new DivisionCalc2();
			calc2.display();
		} catch (Exception exception) {
			System.out.println("handling in main()");
		}
	}
}
