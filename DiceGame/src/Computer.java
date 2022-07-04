
public class Computer extends Players {

	public void expression(int i) {
		switch (i) {    //dung computer la abstract class 
		case 1:
			System.out.println("Oh no! I lost!");
			break;
		case 2:
			System.out.println("Maybe next time");
			break;
		case 3:
			System.out.println("I was so close");
			break;
		case 4:
			System.out.println("Game over!");
			break;
		}
	}
}
