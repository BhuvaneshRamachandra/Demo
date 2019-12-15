package com.bhuvan;

public class ThreadMain {

	public static void main(String[] args) {
Producer p1=new Producer();
p1.start();
Consumer C1=new Consumer();
C1.start();
	}
}
