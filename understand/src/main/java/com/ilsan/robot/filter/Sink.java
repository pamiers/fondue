package com.ilsan.robot.filter;

import com.ilsan.robot.understand.Runner;
import com.ilsan.robot.understand.pipe.Pipe;

public abstract class Sink<T> extends Runner {
	protected Pipe<T> input;
	
	public Sink(Pipe<T> input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		while(true) {
			takeFrom(input);
			System.out.println("Sink!!!!!!!!!!!!!!!!");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public abstract void takeFrom(Pipe<T> pipe);

}
