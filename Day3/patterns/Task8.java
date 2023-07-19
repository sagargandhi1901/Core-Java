package Day3.patterns;

public class Task8 {
	public static void main(String[] args) {
		
		int n = 5;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				if (row == countOfStars || row + countOfStars == n + 1) {
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
