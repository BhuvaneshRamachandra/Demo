package com.bhuvan;

public class Consumer extends Thread {

	public void run() {
		DataContainer D1=new DataContainer();
		D1.get();
		System.out.println("Consumeed"+D1.get());
	}
}
