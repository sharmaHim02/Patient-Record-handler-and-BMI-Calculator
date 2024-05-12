package testMyHealthCareSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.Name;

/**
 * Test class for testing the Name class. Uses JUnit version 5
 * 
 * @author 
 * @version 1.0.0
 */
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {

	private Name name = new Name("Himanshu", "Sharma");

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
	 * +Name(...) +toString():String +formattedName():String +setFirst(first:String):void
	 * +setLast(last:String):void +setMiddle(middle:String):void
	 * +setSalutation(salutation:String):void +first():String +last():String
	 */

	@Nested
	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test
		@Order(1)
		@DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name name = new Name();
			String result = name.toString();
			String expected = "myHealthCareSystem.Name [first=null, last=null, middle=null, saluation=null]";
			assertEquals(expected, result);
		}

		final void testNameWithValidArguments() {
			Name name = new Name("Himanshu", "Sharma");
			assertNotNull(name);
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
			String EXPECTED = "myHealthCareSystem.Name [first=James, last=Mcgill, middle=Morgan, saluation=null]";
			Name actual = new Name("James", "Mcgill", "Morgan");
			assertEquals("testToString() return values do not match expectations", EXPECTED, actual.toString());
		}
	}

	@Nested
	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test
		@Order(1)
		@DisplayName("formattedName()")
		final void testFormattedName() {
			name.setFirst("Bruce");
			name.setMiddle("Thomas");
			name.setLast("Wayne");
			name.setSalutation("Mr.");
			final String EXPECTED = "Mr. Bruce Thomas Wayne";
			String actual = name.formattedName();
			assertEquals("formattedName() return values do not match expectations", EXPECTED, actual);
		}

	}

	@Nested
	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test
		@Order(1)
		@DisplayName("setFirst()")
		final void testSetFirst() {
			final String EXPECTED = "Steve";
			name.setFirst("Steve");
			String actual = name.first();
			assertEquals("setFirst() mutation does not match expectations", EXPECTED, actual);
		}
	}

	@Nested
	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test
		@Order(1)
		@DisplayName("setLast()")
		final void testSetLast() {
			final String EXPECTED = "Rogers";
			name.setLast("Rogers");
			String actual = name.last();
			assertEquals("setLast() mutation does not match expectations", EXPECTED, actual);
		}
	}

	@Nested
	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test
		@Order(1)
		@DisplayName("setMiddle()")
		final void testMiddle() {
			final String EXPECTED = "Himanshu Grant Sharma";
			name.setMiddle("Grant");
			String actual = name.formattedName();
			assertEquals("middle() return values do not match expectations", EXPECTED, actual);
		}
	}

	@Nested
	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test
		@Order(1)
		@DisplayName("setSalutation()")
		final void testSetSalutation() {
			final String EXPECTED = "Mr. Himanshu Sharma";
			name.setSalutation("Mr.");
			String actual = name.formattedName();
			assertEquals("setSaluation() mutation values do not match expectations", EXPECTED, actual);
		}
	}

	@Nested
	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test
		@Order(1)
		@DisplayName("first()")
		final void testFirst() {
			final String EXPECTED = "Tony";
			name.setFirst("Tony");
			String actual = name.first();
			assertEquals("first() return values do not match expectations", EXPECTED, actual);

		}
	}

	@Nested
	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test
		@Order(1)
		@DisplayName("last()")
		final void testlast() {
			final String EXPECTED = "Stark";
			name.setLast("Stark");
			String actual = name.last();
			assertEquals("last() return values do not match expectations", EXPECTED, actual);
		}
	}

}
