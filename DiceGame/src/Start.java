import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Action action = new Action();
		int numberOfPlayers = action.playerInit();
		int numberOfComs = 4 - numberOfPlayers;
		int totalPoints = 0;
		int turn = 0; // luot choi
		
		Scanner sc = new Scanner(System.in);

		Players[] players = new Players[numberOfPlayers];
		System.out.println("\nReal players:");
		for (int i = 0; i < numberOfPlayers; i++) {
			Players bufPlayer = new Players();
			System.out.println("Players " + (i + 1) + " name:");
			bufPlayer.setName(sc.next());
			System.out.println("Players current point: 0");
			bufPlayer.setPoints(0);
			bufPlayer.setIndex(i + 1);

			players[i] = bufPlayer;
		}

		Computer[] computer = new Computer[numberOfComs];
		System.out.println("\nComputer players:");
		for (int i = 0; i < numberOfComs; i++) {
			Computer bufComputer = new Computer();
			System.out.println("Computer " + (i + 1) + ":");
			bufComputer.setName("Computer " + (i + 1));
			System.out.println("Computer current point: 0");
			bufComputer.setPoints(0);
			bufComputer.setIndex(numberOfPlayers + i + 1);

			computer[i] = bufComputer;
		}

		System.out.println("\nStart the game");
		while (totalPoints != 21) {
			turn++;
			if (turn % 4 == 1) {
				totalPoints = action.play(1, numberOfPlayers, numberOfComs, players, computer, totalPoints);
			} else if (turn % 4 == 2) {
				totalPoints = action.play(2, numberOfPlayers, numberOfComs, players, computer, totalPoints);
			} else if (turn % 4 == 3) {
				totalPoints = action.play(3, numberOfPlayers, numberOfComs, players, computer, totalPoints);
			} else {
				totalPoints = action.play(4, numberOfPlayers, numberOfComs, players, computer, totalPoints);
			}
		}
	}
}
