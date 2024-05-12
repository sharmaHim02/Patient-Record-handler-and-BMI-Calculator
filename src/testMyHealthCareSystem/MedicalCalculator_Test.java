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

import myHealthCareSystem.MedicalCalculator;

/**
 * Test class for testing the MedicalCalculator class. Uses JUnit version 5
 * 
 * @author 
 * @version 1.0.0
 */
@DisplayName("Test My HealthCare Application Domain")
@TestMethodOrder(OrderAnnotation.class)
public class MedicalCalculator_Test {

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

	@Nested
	@DisplayName("calculateBMI() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class CalculateBMITest {

		@Test
		@Order(1)
		@DisplayName("calculateBMI() test with Null arguments")
		final void testCalculateBMIWithNullArguments() {
			double result = MedicalCalculator.calculateBMI(0.0, 0.0);
			System.out.println("calculateBMI() ->BMI:" + result);
			assertEquals(result, 0);
		}

		@Test
		@Order(2)
		@DisplayName("calculateBMI() test with height = 0")
		final void testCalculateBMIWithHeightZero() {
			double result = MedicalCalculator.calculateBMI(165, 0);
			System.out.println("calculateBMI(165,0) ->BMI:" + result);
			assertEquals(result, 0);
		}

		@Test
		@Order(2)
		@DisplayName("calculateBMI() test with weight = 0")
		final void testCalculateBMIWithWeightZero() {
			double result = MedicalCalculator.calculateBMI(0, 69);
			System.out.println("calculateBMI(0,69) ->BMI:" + result);
			assertEquals(result, 0);
		}

		@Test
		@Order(2)
		@DisplayName("calculateBMI() test with valid arguments")
		final void testCalculateBMIWithValidArguments() {
			double result = MedicalCalculator.calculateBMI(165, 69);
			System.out.println("calculateBMI(165,69) ->BMI:" + result);
			assertEquals(result, 24.4);
		}

		@Test
		@Order(2)
		@DisplayName("calculateBMI() test with invalid arguments")
		final void testCalculateBMIWithInvalidArguments() {
			double result = MedicalCalculator.calculateBMI(175, 64);
			System.out.println("calculateBMI(175,64) ->BMI:" + result);
			assertEquals(result, 24.4);
		}

	}

} /* End of test class */
