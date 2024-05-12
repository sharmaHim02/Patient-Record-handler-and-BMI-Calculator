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

import myHealthCareSystem.*;

/**
 * Test class for testing the EMRecord class. Uses JUnit version 5
 * 
 * @author 
 * @version 1.0.0
 */
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	private EMRecord emr = new EMRecord("BC", "67698", "PB456", "HSH456");

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

	/*
	 * Methods to test
	 * 
	 * +EMRecord(reportingFacilityProvince:String, institutionNumber:String,
	 * chartNumber:String, healthCareNumber:String) +toString():String
	 * +setName(name:Name):void +setAddress(address:Address):void +setHeight():void
	 * +getHeight():int +setWeight():void +getWeight():int +formattedName():String
	 * +formattedAddress():String +bmi():int
	 */

	@Nested
	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test
		@Order(1)
		@DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			EMRecord emr = new EMRecord(null, null, null, null);
			String result = emr.toString();
			final String EXPECTED = "EMHRecord [reportingFacilityProvince=null, institutionNumber=null, functionalCentreAccount=null, encounterSequence=0, healthCareNumber=null, chartNumber=null, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, admitViaAmbulance=null, registrationDate=0, registrationTime=0, birthDate=null, height=0, weight=0, name=null, address=null]";
			assertEquals(EXPECTED, result);
		}

		@Test
		@Order(2)
		@DisplayName("EMRecord() test with Valid arguments")
		final void testEMRecordWithValidArguments() {
			EMRecord emr = new EMRecord("BC", "67698", "PB456", "HSH456");
			assertNotNull(emr);
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
			final String EXPECTED = "EMHRecord [reportingFacilityProvince=BC, institutionNumber=67698, functionalCentreAccount=null, encounterSequence=0, healthCareNumber=HSH456, chartNumber=PB456, issuingProvince=null, residenceCode=null, gender=null, submissionYear=0, admitViaAmbulance=null, registrationDate=0, registrationTime=0, birthDate=null, height=0, weight=0, name=null, address=null]";
			String actual = emr.toString();
			assertEquals("testEMARecord() return values do not match expectations", EXPECTED, actual);
		}
	}

	@Nested
	@DisplayName("getName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetNameTest {
		@Test
		@Order(1)
		@DisplayName("getName()")
		final void testGetName() {
			Name expectedName = new Name("Mr.", "Himanshu", "Sharma");
			final String EXPECTED = expectedName.toString();
			Name actualName = emr.getName();
			String actual = actualName.toString();
			assertEquals("getName() return does not match expectations", EXPECTED, actual);
		}
	}
} /* End of test class */
