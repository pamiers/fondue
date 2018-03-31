package com.ilsan.robot.filter;

import com.ilsan.robot.understand.Runner;
import com.ilsan.robot.understand.pipe.Pipe;

public abstract class Filter<I, O> extends Runner {
	protected Pipe<I> input;
	protected Pipe<O> output;

	public Filter(Pipe<I> input, Pipe<O> output) {
		this.input = input;
		this.output = output;
	}

	@Override
	public void run() {
		while (true) {
			dietWord(input, output);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected abstract void dietWord(Pipe<I> input, Pipe<O> output);
}
