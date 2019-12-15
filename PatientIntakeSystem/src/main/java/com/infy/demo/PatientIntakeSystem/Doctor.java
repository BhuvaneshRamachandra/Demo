package com.infy.demo.PatientIntakeSystem;

public enum Doctor {
avery("Avery Johnsen"),
beth("Beth Simson"),
Murphy("Murphy John");
	
	private String name;
	Doctor(String name){this.name=name;}
	public String getName() {
		return name;
	}

}
