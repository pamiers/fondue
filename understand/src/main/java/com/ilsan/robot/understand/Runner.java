package com.ilsan.robot.understand;

public abstract class Runner implements Runnable {
	private boolean isStarted = false;

	abstract public void run();

	public void start() {
		if (!isStarted) {
			isStarted = true;
			Thread thread = new Thread(this);
			thread.start();
		}
	}

	public void stop() {
		isStarted = false;
	}
}
