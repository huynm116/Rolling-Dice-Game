import java.util.Scanner;

public class Action {
	public int playerInit() {
		int numberOfPlayers = 0;
		System.out.println("Enter the number of real player(s): ");
		Scanner sc = new Scanner(System.in);

		numberOfPlayers = sc.nextInt();
		while (numberOfPlayers > 4 || numberOfPlayers < 0) {
			System.out.println("Invalid number");
			System.out.println("Number of players needs to be from 0 to 4");
			System.out.println("Enter again:");
			numberOfPlayers = sc.nextInt();
		}
		return numberOfPlayers;
	}

	public static int check(int currentSum, int playerDice) { // kiem tra dieu kien chien thang game
		if (currentSum + playerDice == 21)
			return 0;
		else if (currentSum + playerDice < 21)
			return -1;
		else
			return 1;
	}

	public static Players checkTurn(int turn, int numberOfPlayers, int numberOfComs, Players[] players,
			Computer[] computer) { // kiem tra xem den luot cua ai
		for (int i = 0; i < numberOfPlayers; i++) {
			if (players[i].getIndex() == turn)
				return players[i];
		}
		for (int i = 0; i < numberOfComs; i++) {
			if (computer[i].getIndex() == turn)
				return computer[i];
		}
		return null;
	}

	public int play(int i, int numberOfPlayers, int numberOfComs, Players[] players, Computer[] computer,
			int totalPoints) {
		Players pl = new Players();
		pl = checkTurn(i, numberOfPlayers, numberOfComs, players, computer);
		Dice dice = new Dice();
		int dot = dice.rollTheDice(dice.randomDice());
		System.out.println("\n" + pl.getName() + " turn:");
		System.out.println(dot);
		pl.setPoints(dot);
		switch (check(totalPoints, dot)) {
		case 0:
			System.out.println("Total points: " + (totalPoints + dot));
			System.out.println("Congratulation! The winner is: " + pl.getName());
			for (int j = 0; j < numberOfComs; j++) {
				if (computer[j].getName() != pl.getName()) {
					System.out.print(computer[j].getName() + ": ");
					computer[j].expression(computer[j].getIndex());
				}
			}
			break;
		case -1:
			System.out.println("Total points: " + (totalPoints + dot));
			break;
		case 1:
			System.out.println("Bigger than 21");
			System.out.println("Set to 0");
			System.out.println("Total points: " + totalPoints);
			pl.setPoints(0);
			dot = 0;
			break;
		}
		totalPoints += dot;
		return totalPoints;
	}
}
