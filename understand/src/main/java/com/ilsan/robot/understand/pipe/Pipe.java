package com.ilsan.robot.understand.pipe;

public interface Pipe<T> {
	public boolean put(T obj);
	public T next();
	public void close();

}
