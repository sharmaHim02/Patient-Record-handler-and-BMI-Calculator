package testMyHealthCareSystem;


import static org.junit.Assert.assertEquals;

/*		@(#)Address_Test.java	Jan. 31, 2024
*
*/


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
* Test class for testing the Address class
* Uses JUnit version 5
* @author 
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	private Address addrss = new Address("Baseline Road", "1375", "Ottawa", "Canada", "K2C3G1");
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * TODO: Enter any requirements here that are needed before each test is run
		 */
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	TODO: Undo what was setup for each test before the test was run
		 */
	}

	/*		Methods to test
	 * 
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address("Embro Street", "1165", "Beachville", "Canada", "N0J1A0");
			assertNotNull(result);
		}
		
		public final void testGetStreet() {
			final String EXPECTED = "Baseline Road";
			String actual = addrss.getStreet();
			assertEquals("getStreet() return values does not match expectations", EXPECTED, actual);
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			String EXPECTED = "myHealthCareSystem.Address [street=Baseline Road, number=1375, city=Ottawa, country=Canada, postalCode=K2C3G1]";
			String actual = addrss.toString();
			assertEquals("testToString() return values does not match expectations", EXPECTED, actual);

		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {

			final String EXPECTED = "1375 Baseline Road Ottawa Canada K2C3G1";
			String actual = addrss.formattedAddress();
			assertEquals("formattedAddress() return does not match expectations", EXPECTED, actual);
		}
		
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			final String EXPECTED = "K2C3G1";
			String actual = addrss.getPostalCode();
			assertEquals("getPostalCode() return values does not match expectations", EXPECTED, actual);
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			final String EXPECTED = "Ottawa";
			String actual = addrss.getCity();
			assertEquals("getCity() return values does not match expectations", EXPECTED, actual);
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			final String EXPECTED = "Citigate Drive";
			addrss.setStreet("Citigate Drive");
			String actual = addrss.getStreet();
			assertEquals("setStreet() mutation does not match expectations", EXPECTED, actual);
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			final String EXPECTED = "55";
			addrss.setNumber("55");
			String actual = addrss.getNumber();
			assertEquals("setNumber() mutation does not match expectations", EXPECTED, actual);
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			final String EXPECTED = "Toronto";
			addrss.setCity("Toronto");
			String actual = addrss.getCity();
			assertEquals("setCity() mutation does not match expectations", EXPECTED, actual);
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			final String EXPECTED = "Russia";
			addrss.setCountry("Russia");
			String actual = addrss.getCountry();
			assertEquals("setCountry() mutation does not match expectations", EXPECTED, actual);
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetPostalcode() {
			final String EXPECTED = "P6G2G0";
			addrss.setPostalCode("P6G2G0");
			String actual = addrss.getPostalCode();
			assertEquals("setPostalCode() mutation does not match expectations", EXPECTED, actual);
		}
	}




}
