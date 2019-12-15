package com.infy.demo.PatientIntakeSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClinicCalander {

	private List<Appointment> listofAppointments;

	public ClinicCalander() {
		this.listofAppointments=new ArrayList<Appointment>();
	}
	
	public void addAppontments(String patientFirstname,String patientLastname, String doctorKey,String dateTime) {
		Doctor doc=Doctor.valueOf(doctorKey.toLowerCase());
		LocalDateTime localdatetime;
		
		localdatetime=LocalDateTime.parse(dateTime,DateTimeFormatter.ofPattern("M/d/yyyy h:mm a",Locale.US));
		Appointment n1=new Appointment(patientFirstname,patientLastname,localdatetime,doc);
		listofAppointments.add(n1);
	}

	public List<Appointment> getListofAppointments() {
		return listofAppointments;
	}
}
