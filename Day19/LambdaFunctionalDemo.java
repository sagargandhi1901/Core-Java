package Day19;

@FunctionalInterface
interface Calculator {
	void switchOn();
}

@FunctionalInterface
interface Calculator2 {
	void addition(int num1, int num2);
}

@FunctionalInterface
interface Calculator3 {
	int subtract(int num1, int num2);
}

public class LambdaFunctionalDemo {
	public static void main(String[] args) {

		Calculator calc = () -> {
			System.out.println("Switched ON...");
		};
		calc.switchOn();

		Calculator2 calc2 = (num1, num2) -> {
			System.out.println("Sum :: " + (num1 + num2));
		};
		calc2.addition(10, 20);

		Calculator3 calc3 = (num1, num2) -> (num1 - num2);
		System.out.println("Subtraction :: " + calc3.subtract(20, 10));;
	}
}