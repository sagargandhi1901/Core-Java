package Day13;

import java.util.Scanner;

class Demo1 {
//	public void display() {											
//		display();													
//	}

}

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {

//		System.out.println("Hello")									// Compile time error -> because of syntax -> semicolon missing

			Demo1 demo1 = new Demo1();
//		demo1.display();											// Runtime error -> StackOverFlowError -> because of faulty logic (infinite recursion)

			System.out.println("Trying to create an array");
//		int[] arr = new int[999999999];								// Runtime error -> OutOfMemoryError -> as that much of continuous memory is not available
			System.out.println("Array is created");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator : ");
			int num1 = sc.nextInt();
			System.out.println("Enter the denominator : ");
			int num2 = sc.nextInt();

			int result = num1 / num2; // If we give the denominator value as zero, it will result in
										// ArithmeticException as divide by zero is not possible
			System.out.println("Division result " + result);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}
}