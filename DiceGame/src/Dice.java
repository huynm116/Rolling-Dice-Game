import java.util.Random;

public class Dice {

	public int randomDice() { // random to pick 1 of 4 dices
		int min = 1;
		int max = 4;
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	public int rollTheDice(int i) { // dice i has 20% of getting i dots
		int min = 1;
		int max = 25;
		Random random = new Random();
		int dot = random.nextInt(max - min) + min;
		int dice = 0;
		// i can be from 1 to 4
		switch (i) {
		case 1:									//dung interface  de tao ra 4 con xuc xac
			if (1 <= dot && dot <= 5)
				dice = 1;
			else if (6 <= dot && dot <= 9)
				dice = 2;
			else if (10 <= dot && dot <= 13)
				dice = 3;
			else if (14 <= dot && dot <= 17)
				dice = 4;
			else if (18 <= dot && dot <= 21)
				dice = 5;
			else if (22 <= dot && dot <= 25)
				dice = 6;
			break;
		case 2:
			if (1 <= dot && dot <= 5)
				dice = 2;
			else if (6 <= dot && dot <= 9)
				dice = 1;
			else if (10 <= dot && dot <= 13)
				dice = 3;
			else if (14 <= dot && dot <= 17)
				dice = 4;
			else if (18 <= dot && dot <= 21)
				dice = 5;
			else if (22 <= dot && dot <= 25)
				dice = 6;
			break;
		case 3:
			if (1 <= dot && dot <= 5)
				dice = 3;
			else if (6 <= dot && dot <= 9)
				dice = 2;
			else if (10 <= dot && dot <= 13)
				dice = 1;
			else if (14 <= dot && dot <= 17)
				dice = 4;
			else if (18 <= dot && dot <= 21)
				dice = 5;
			else if (22 <= dot && dot <= 25)
				dice = 6;
			break;
		case 4:
			if (1 <= dot && dot <= 5)
				dice = 4;
			else if (6 <= dot && dot <= 9)
				dice = 2;
			else if (10 <= dot && dot <= 13)
				dice = 3;
			else if (14 <= dot && dot <= 17)
				dice = 1;
			else if (18 <= dot && dot <= 21)
				dice = 5;
			else if (22 <= dot && dot <= 25)
				dice = 6;
			break;
		}
		return dice;
	}
}
