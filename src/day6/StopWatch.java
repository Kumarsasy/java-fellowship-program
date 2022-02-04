package day6;

import java.util.Scanner;

public class StopWatch {

	long startTime, stopTime, timeElapsed;

	public long start() {
		startTime = System.currentTimeMillis();
		return startTime;
	}

	public long stop() {
		stopTime = System.currentTimeMillis();
		return stopTime;
	}

	public void timeElapsed() {
		timeElapsed = stopTime - startTime;
	}

	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();

		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to start...");
		input.nextInt();
		stopWatch.start();

		System.out.println("Press 2 to stop...");
		input.nextInt();
		stopWatch.stop();

		stopWatch.timeElapsed();

		System.out.println("StartTime : " + stopWatch.startTime);
		System.out.println("StopTime : " + stopWatch.stopTime);
		System.out.println("TimeElapsed : " + stopWatch.timeElapsed);

	}

}
