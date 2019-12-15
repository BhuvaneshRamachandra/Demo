package com.bhuvan;

public class Producer extends Thread {
	
	public void pro(DataContainer DC){
		DC.put(1);
	}
	public void run() {
	pro()
	System.out.println("Produced"+D1.get());
	}
}
