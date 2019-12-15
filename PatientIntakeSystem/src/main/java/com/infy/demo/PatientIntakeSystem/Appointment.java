package com.infy.demo.PatientIntakeSystem;

import java.time.LocalDateTime;

public class Appointment {
	
	private String patineFirstName;
	private String patineLastName;
	private LocalDateTime appointmentdate;
	private Doctor docotr;



	public Appointment(String patineFirstName, String patineLastName, LocalDateTime appointmentdate, Doctor docotr) {
		super();
		this.patineFirstName = patineFirstName;
		this.patineLastName = patineLastName;
		this.appointmentdate = appointmentdate;
		this.docotr = docotr;
	}



	public String getPatineFirstName() {
		return patineFirstName;
	}



	public void setPatineFirstName(String patineFirstName) {
		this.patineFirstName = patineFirstName;
	}



	public String getPatineLastName() {
		return patineLastName;
	}



	public void setPatineLastName(String patineLastName) {
		this.patineLastName = patineLastName;
	}



	public LocalDateTime getAppointmentdate() {
		return appointmentdate;
	}



	public void setAppointmentdate(LocalDateTime appointmentdate) {
		this.appointmentdate = appointmentdate;
	}



	public Doctor getDocotr() {
		return docotr;
	}



	public void setDocotr(Doctor docotr) {
		this.docotr = docotr;
	}
	
	
	

}
