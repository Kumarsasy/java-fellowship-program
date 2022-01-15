package day4;

public class SnakeAndLadder {

	static int position = 0;
	static double dice;
	static int diceCount=0;

	public static void dice() {
		dice = Math.floor(Math.random() * 10) % 6 + 1;
	}

	public static void play() {
		dice();
		while(position<=100) {
			
		double playDice = Math.floor(Math.random() * 10) % 3;
		switch ((int) playDice) {
		case 0:
			System.out.println("No play"+ dice);
			position = position;
			System.out.println(position);
			diceCount++;
			break;
		case 1:
			System.out.println("Ladder"+ dice);
			position+=dice;
			System.out.println(position);
			diceCount++;
			break;	
		case 2:
			System.out.println("Snake"+ dice);
			position -=dice;
			System.out.println(position);
			diceCount++;
			break;	
		}
		}
	}
	

	public static void main(String[] args) {
		play();
		System.out.println(diceCount);
	}

}
