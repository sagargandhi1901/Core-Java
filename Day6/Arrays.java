package Day6;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// One dimensional array
		int[] marks = new int[5];
//		marks[0] = 10;
//		marks[1] = 20;
//		marks[2] = 30;
//		marks[3] = 40;
//		marks[4] = 50;
		
		// Taking array input from user
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter marks of student " + i);
			marks[i] = scanner.nextInt();
		}
		
		System.out.println("Marks of all the students : ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		
		// Two dimensional array
		int[][] marks2 = new int[3][4];
		
		// Taking user input for 2D array
		for (int i = 0; i < marks2.length; i++) {											// marks.length will give 3 -> number of total rows
			for (int j = 0; j < marks2[i].length; j++) {									// marks2[i].length will give the length of that particular row -> 4
				System.out.println("Enter the marks of class " + i + " ,student " + j);
				marks2[i][j] = scanner.nextInt();
			}
		}
		
		// Printing the 2D array
		System.out.println("Marks of all the students : ");
		for (int i = 0; i < marks2.length; i++) {											
			for (int j = 0; j < marks2[i].length; j++) {									
				System.out.print(marks2[i][j] + " ");
			}
			System.out.println();
		}
		
		// Jagged array
		int[][] marks3 = new int[3][];
		marks3[0] = new int[3];
		marks3[1] = new int[4];
		marks3[2] = new int[2];
		
		for (int i = 0; i < marks3.length; i++) {											
			for (int j = 0; j < marks3[i].length; j++) {									
				System.out.println("Enter the marks of class " + i + " ,student " + j);
				marks3[i][j] = scanner.nextInt();
			}
		}
		
		// Printing the 2D array
		System.out.println("Marks of all the students : ");
		for (int i = 0; i < marks3.length; i++) {											
			for (int j = 0; j < marks3[i].length; j++) {									
				System.out.print(marks3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
