package com.threads;

public class ThreadsJoin {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		t.join();
		Thread t1 = new Thread(r1);
		t1.start();
		t1.join();
		Thread t2 = new Thread(r2);
		t2.start();
		t2.join();
		System.out.println("Sum: " + (r.getNumber() + r1.getNumber() + r2.getNumber()));
	}
}
