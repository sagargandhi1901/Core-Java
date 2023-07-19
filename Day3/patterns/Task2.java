package Day3.patterns;

public class Task2 {
	public static void main(String[] args) {
		
		int n = 6;
		
		int numberOfStars = 1;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				System.out.print("* ");
				countOfStars++;
			}
			
			System.out.println();
			row++;
			numberOfStars++;
		}
	}
}
