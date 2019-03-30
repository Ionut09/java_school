package com.threads;

import static java.lang.Thread.currentThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class CountingThreads {

	public static void main(String[] args) {
		// void run()
		Runnable r1 = () -> {
			currentThread().setName("Bobitza cu 2");
			Stream.iterate(1, i -> i + 2).limit(100000)
					.forEach(i -> System.out.println(currentThread().getName() + " : " + i));

		};

		Runnable r2 = () -> {
			currentThread().setName("Bobitza cu 3");
			Stream.iterate(1, i -> i + 3).limit(100000)
					.forEach(i -> System.out.println(currentThread().getName() + " : " + i));

		};

		Runnable r3 = () -> {
			currentThread().setName("Bobitza cu 5");
			Stream.iterate(1, i -> i + 5).limit(100000)
					.forEach(i -> System.out.println(currentThread().getName() + " : " + i));

		};

//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		Thread t3 = new Thread(r3);
//
//		t1.start();
//		t2.start();
//		t3.start();

		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(r1);
		es.submit(r2);
		es.submit(r3);
		es.shutdown();
	}

}
