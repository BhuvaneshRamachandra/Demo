package com.infy.demo.PatientIntakeSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ClinicCalanderTest {

	

	@Test
	void testAddAppontments() {
		ClinicCalander cal=new ClinicCalander();
		cal.addAppontments("Bhuvan", "Ramachandra", "Avery", "09/01/2019 2:00 PM");
		List<Appointment> list=cal.getListofAppointments();
		assertNotNull(list);
		assertEquals(1, list.size());
	}

	

}
