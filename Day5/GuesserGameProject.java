package Day5;

import java.util.Scanner;

class Guesser {

	int guessNum;

	public int guessNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guesser kindly guess a number : ");

		guessNum = scanner.nextInt();

		return guessNum;
	}
}

class Player {

	int guessNum;

	public int guessNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player kindly guess a number : ");

		guessNum = scanner.nextInt();

		return guessNum;
	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumberFromGuesser() {
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessNumber();
	}

	public void collectNumberFromPlayers() {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();

		numFromPlayer1 = player1.guessNumber();
		numFromPlayer2 = player2.guessNumber();
		numFromPlayer3 = player3.guessNumber();
	}

	public void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied !! all players guessed correctly");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and player 2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and player 3 won the game");
			} else {
				System.out.println("Player 1 is the winner");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and player 3 won the game");
			} else {
				System.out.println("Player 2 is the winner");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 is the winner");
		} else {
			System.out.println("Nobody could guess correctly, game lost...");
		}
	}
}

public class GuesserGameProject {
	public static void main(String[] args) {
		Umpire umpire = new Umpire();
		umpire.collectNumberFromGuesser();
		umpire.collectNumberFromPlayers();
		umpire.compare();
	}
}
