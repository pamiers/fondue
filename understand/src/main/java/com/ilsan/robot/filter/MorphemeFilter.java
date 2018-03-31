package com.ilsan.robot.filter;

import com.ilsan.robot.understand.pipe.Pipe;

public class MorphemeFilter<T, O> extends Filter{

	public MorphemeFilter(Pipe input, Pipe output) {
		super(input, output);
	}

	@Override
	protected void dietWord(Pipe input, Pipe output) {
		String word = (String) input.next();
		// TODO: 형태소 분석기 넣기!
		word += "diet";
		System.out.println("diet word:" + word);
		output.put(word);
	}
	

}
