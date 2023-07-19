package Day12;

interface Computer {

	void showDetails();
}

interface Computer2 {

	void showDetails(int ram);
}

interface Computer3 {

	void showDetails(int ram, int diskMemory);
}

interface Calculator {
	
	int addidion(int num1, int num2);
}
//class Laptop implements Computer {
//	@Override
//	public void showDetails() {
//		System.out.println("Laptop.showDetails()");
//	}
//}

public class LambdaExpressionDemo {
	public static void main(String[] args) {

		Computer computer = () -> {
			System.out.println("LambdaExpressionDemo.main()");
		};
		computer.showDetails();

		Computer2 computer2 = num -> {
			System.out.println("LambdaExpressionDemo.main() " + num);
		};
		computer2.showDetails(8);
		
		Computer3 computer3 = (x, y) -> {
			System.out.println("LambdaExpressionDemo.main() 3");
		};
		computer3.showDetails(8, 512);

		Calculator calculator = (num1, num2) -> {
			return (num1 + num2);
		};
		System.out.println(calculator.addidion(10, 20));;
	}
}
