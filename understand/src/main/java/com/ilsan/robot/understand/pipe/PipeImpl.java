package com.ilsan.robot.understand.pipe;

import java.util.LinkedList;
import java.util.Queue;

public class PipeImpl<T> implements Pipe<T>{
	private Queue<T> buffer = new LinkedList<T>();
	
	public synchronized boolean put(T obj) {
		if (obj == null) {
			return false;
		}
		System.out.println("Insert data into pipe");
		buffer.add(obj);
		notify();
		return true;
	}

	public synchronized T next() {
		return buffer.poll();
	}

	public synchronized void close() {
		buffer.clear();
		notify();
	}

}
