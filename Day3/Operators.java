package Day3;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 / 2);
		System.out.println(5 % 2);
		
		System.out.println();
		// Relational operators
		System.out.println(10 == 20);
		System.out.println(10 == 10);
		System.out.println(10 > 20);
		System.out.println(10 < 20);
		System.out.println(10 >= 20);
		System.out.println(10 >= 10);
		System.out.println(10 <= 20);
		System.out.println(20 <= 20);
		
		System.out.println();
		// Logical operators
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(true && true);
		System.out.println(true && true && false);
		System.out.println(true && true && true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(true || true);
		System.out.println(true || false || false);
		System.out.println(false || false || true);
		System.out.println(!true);
		System.out.println(!false);
	}
}
