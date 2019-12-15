package com.bhuvan;

public class People extends Thread {
public void run() {
	System.out.println("People thread is running..! ");
	try {
		sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
