package Day3.patterns;

public class Task6 {
	public static void main(String[] args) {
		
		int n = 7;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				if ((row == 1 && countOfStars != 1 && countOfStars != numberOfStars) || row == (n / 2) + 1 || (countOfStars == 1 && row != 1) || (countOfStars == numberOfStars && row != 1)) {
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
