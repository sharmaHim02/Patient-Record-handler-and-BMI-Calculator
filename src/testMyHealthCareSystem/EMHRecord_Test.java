package testMyHealthCareSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.EMHRecord;

/**
 * Test class for testing the EMHRecord class. Uses JUnit version 5
 * 
 * @author 
 * @version 1.0.0
 */
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	private EMHRecord emh = new EMHRecord("Ontario", "3", "6", "10");

	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 * TODO: Undo what was set up for each test before the test was run
		 */
	}

	/* Methods to test
	 * 
	 * +EMHRecord(reportingFacilityProvince:String, institutionNumber:String,
	 * chartNumber:String,healthCareNumber:String) +toString():String
	 */

	@Nested
	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test
		@Order(1)
		@DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			EMHRecord emh = new EMHRecord(null, null, null, null);
			String result = emh.toString();
			final String EXPECTED = "EMARecord [reportingFacilityProvince=null, institutionNumber=null, functionalCentreAccount=null, encounterSequence=0, healthCareNumber=null, chartNumber=null, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, admitViaAmbulance=null, registrationDate=0, registrationTime=0, birthDate=null]";
			assertEquals(EXPECTED, result);
		}

		@Test
		@Order(2)
		@DisplayName("EMHRecord() test with Valid arguments")
		final void testEMHRecordWithValidArguments() {
			EMHRecord test_emh = new EMHRecord("ON", "67890", "PB123", "HSH123");
			assertNotNull(test_emh);
		}
	}

	@Nested
	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test
		@Order(1)
		@DisplayName("toString()")
		final void testToString() {
			final String EXPECTED = "EMARecord [reportingFacilityProvince=ON, institutionNumber=67890, functionalCentreAccount=null, encounterSequence=0, healthCareNumber=HSH123, chartNumber=PB123, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, admitViaAmbulance=null, registrationDate=0, registrationTime=0, birthDate=null]";
			EMHRecord actual = new EMHRecord("ON", "67890", "PB123", "HSH123");
			assertEquals("testToString() return values does not match expectations", EXPECTED, actual.toString());
		}
	}

	@Test
	final void testGetGender() {
		final String EXPECTED = "M";
		emh.setGender("M");
		String actual = emh.getGender();
		assertEquals("getGender() return values does not match expectations", EXPECTED, actual);
	}

	@Test
	final void testSetGender() {
		emh.setGender("Female");
		String actual = emh.getGender();
		assertNull(actual, "setGender() return values does not match expectations");

		final String EXPECTED = "F";
		emh.setGender("F");
		actual = emh.getGender();
		assertEquals("setGender() return values does not match expectations", EXPECTED, actual);
	}
}
