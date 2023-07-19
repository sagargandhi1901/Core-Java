package Day3.patterns;

public class Task1 {
	public static void main(String[] args) {
		
		int n = 5;
		
		int numberOfStars = n;
		int row = 1;
		while (row <= n) {
			
			int countOfStars = 1;
			while (countOfStars <= numberOfStars) {
				System.out.print("* ");
				countOfStars++;
			}
			
			row++;
			System.out.println();
		}
	}
}
