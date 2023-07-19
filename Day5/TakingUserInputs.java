package Day5;

import java.util.Scanner;

public class TakingUserInputs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int var1 = sc.nextInt();
		System.out.println("Entered value : " + var1);
		
		double var2 = sc.nextDouble();
		System.out.println("Entered value : " + var2);
		
		// closing scanner as it was giving warning for resource leak
		sc.close();  
	}
}
