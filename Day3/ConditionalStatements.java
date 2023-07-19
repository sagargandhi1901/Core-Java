package Day3;

public class ConditionalStatements {
	public static void main(String[] args) {

		// if-else
		int n1 = 8;
		int n2 = 7;

		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}

		// ternary operators
		boolean result = n1 > n2 ? true : false;
		System.out.println(result);
		System.out.println(n1 > n2 ? n1 : n2);

		// if-else-if
		int n3 = 9;
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else if (n2 > n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}

		// switch case
		int n4 = 3;
		switch (n4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("nothing");
			break;
		}
		
		
	}
}
