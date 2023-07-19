package Day3.patterns;

public class Task4 {
	public static void main(String[] args) {
		
		int n = 7;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				if (row == (n / 2) + 1 || countOfStars == 1 || countOfStars == numberOfStars) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				countOfStars++;
			}
			
			row++;
			System.out.println();
		}
	}
}
