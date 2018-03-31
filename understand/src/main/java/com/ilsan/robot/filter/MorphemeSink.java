package com.ilsan.robot.filter;

import com.ilsan.robot.understand.pipe.Pipe;

public class MorphemeSink<T> extends Sink{

	public MorphemeSink(Pipe input) {
		super(input);
	}

	@Override
	public void takeFrom(Pipe pipe) {
		System.out.println("last data: " + pipe.next());
	}

}
