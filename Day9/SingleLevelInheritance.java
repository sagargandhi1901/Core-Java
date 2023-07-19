package Day9;

class SagarCalc {			// Super / Parent / base class
	
	int var1 = 5;
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
}

class NewCalc extends SagarCalc {			// Sub / Child class
	
	int var1 = 15;
	int var2 = 20;
	
	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		NewCalc calc = new NewCalc();
		int result = calc.addition(10, 20);
		int result2 = calc.subtraction(20, 10);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(calc.var1);
		calc.var1 = 10;
		System.out.println(calc.var1);
		System.out.println(calc.var2);
	}
}
