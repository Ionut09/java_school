package com.threads;

import static java.lang.Thread.currentThread;

import java.util.stream.Stream;
public class ThreadsSleep {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			currentThread().setName("Bobitza cu 2");
			Stream.iterate(1, i -> i + 2).limit(100).forEach(i -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(currentThread().getName() + " : " + i);
			});

		};

		Thread t1 = new Thread(r1);
		t1.start();
	}
}
