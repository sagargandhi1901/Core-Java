package Day9;

class ParentCalc {			// Super / Parent / base class
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
}

class ChildCalc extends ParentCalc {			// Sub / Child class
	
	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}
}

class GrandChildCalc extends ChildCalc {			// Sub / Child class of its Parent
	
	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		GrandChildCalc calc = new GrandChildCalc();
		int result = calc.addition(10, 20);
		int result2 = calc.subtraction(20, 10);
		int result3 = calc.multiplication(10, 5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
}
