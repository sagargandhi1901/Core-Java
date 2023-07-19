package Day13;

import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers for division : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Division result : " + result);
			
			System.out.println("Enter the array size : ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the array element to be stored and at what position : ");
			int element = sc.nextInt();
			int position = sc.nextInt();
			arr[position] = element;
		} catch (ArithmeticException ex) {
			System.out.println("Cannot be divided by zero");
		} catch (NegativeArraySizeException ex) {
			System.out.println("Please enter positive size for array");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please enter position within index range");
		} catch (Exception ex) {															// generic catch block in case if some other exception may occur
			System.out.println("Some error occured");
		}
	}
}