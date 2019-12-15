package com.bhuvan;

public class Employee implements Runnable{

	@Override
	public void run() {
		System.out.println("Employee thread is running..! ");
		
	}
	
	public void check() {
	People p2=new People();

	for (int i=0; i<5; i++) {
		p2.start();
	}
	
	
	
	}
}
