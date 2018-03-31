package com.ilsan.robot.starter;

import com.ilsan.robot.filter.MorphemeFilter;
import com.ilsan.robot.filter.MorphemeSink;
import com.ilsan.robot.filter.Sink;
import com.ilsan.robot.understand.pipe.Pipe;
import com.ilsan.robot.understand.pipe.PipeImpl;

public class PipeAndFilterStarter {
	public static void main(String[] args) {
		Pipe firstPipe = new PipeImpl();
		Pipe secPipe = new PipeImpl();
		Sink<Pipe> sink = new MorphemeSink<Pipe>(secPipe);
		
		MorphemeFilter<Pipe, Pipe> morFilter = new MorphemeFilter<Pipe, Pipe>(firstPipe, secPipe);
		
		morFilter.start();
		sink.start();
		
		for (int i=0; i<100; i++) {
			firstPipe.put(Integer.toString(i));
		}
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
