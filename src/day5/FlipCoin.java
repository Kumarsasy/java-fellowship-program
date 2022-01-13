package day5;

public class FlipCoin {

	static double flipCoin;
	static int headsCount;
	static int tailsCount;
	static int headsCountPercentage;
	static int tailsCountPercentage;

	public static void flipCoinCheck() {
		for (int i = 1; i <= 5; i++) {
			flipCoin = Math.floor(Math.random() * 10) % 2;
			if (flipCoin == 0) {
				System.out.println("Heads");
				headsCount += 1;
				headsCountPercentage = (headsCount * 100) / 10;
			} else {
				System.out.println("Tails");
				tailsCount += 1;
				tailsCountPercentage = (tailsCount * 100) / 10;
			}
		}
		System.out.println("The total number of Heads is " + headsCount);
		System.out.println("The total number of Heads Percentage is " + headsCountPercentage);
		System.out.println("The total number of Tails is " + tailsCount);
		System.out.println("The total number of Tails Percentage is " + tailsCountPercentage);
	}

	public static void main(String[] args) {
		flipCoinCheck();
	}

}
