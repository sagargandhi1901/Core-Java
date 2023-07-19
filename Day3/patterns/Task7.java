package Day3.patterns;

public class Task7 {
	public static void main(String[] args) {
		
		int n = 7;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				if (countOfStars == 1 || (row == 1 && countOfStars != n) || (row == n && countOfStars != n) || (countOfStars == n && row != 1 && row != n)) {
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
