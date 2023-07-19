package Day13;

import java.util.Scanner;

class VoterVerification {
	public void verifyAge(int age) throws AgeNotValidException {
		if (age >= 18 && age <= 110) {
			System.out.println("User valid for voting");
		} else {
			throw new AgeNotValidException("Please enter Valid age");
		}
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		VoterVerification verification = new VoterVerification();
		try {
			verification.verifyAge(age);
		} catch (AgeNotValidException ex) {
			System.out.println(ex.getMessage());
		} finally {
			sc.close();
		}
	}
}