package Day3.patterns;

public class Task3 {
	public static void main(String[] args) {
		
		int n = 6;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				if (row == 1 || row == n || countOfStars == 1 || countOfStars == numberOfStars) {
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
