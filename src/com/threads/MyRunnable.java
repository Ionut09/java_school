package com.threads;

import java.util.Random;

import lombok.Data;

@Data
public class MyRunnable implements Runnable {

	private int number;

	@Override
	public void run() {
		syncronizedMethod();
	}

	private synchronized void syncronizedMethod() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.number = new Random().nextInt(10);
		System.out.println(number);

	}


}
