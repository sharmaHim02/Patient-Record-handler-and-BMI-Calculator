package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * TODO: You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 *
		 * Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */
		
//			sample test of BirthDate class

			EMRecord emR = new EMRecord("ON", "12345", "CH123", "HCN123");
			emR.setHeight(69);
	        emR.setWeight(154);
	        emR.setEncounterSequence(001);
	        emR.setGender("M");
	        emR.setSubmissionYear(2024);
	        emR.setAdmitViaAmbulance("A");
	        emR.setRegistrationDate(20230307);
	        emR.setRegistrationTime(2307);

			BirthDate bd = new BirthDate(1970,12,1);
			emR.setBirthdate(bd);
			
			String salutation = "Mr.";
	        Name name = new Name("John","Micheal","Doe");
	        name.setSalutation(salutation);
	        emR.setName(name);
	
	        Address address = new Address("123 Main St", "Cityville", "ON", "Canada", "A1B 2C3");
	        emR.setAddress(address);

	        System.out.println("Health Data:");
	        
	        System.out.printf("Height: %d in%n", emR.getHeight());
	        System.out.printf("Weight: %d lbs%n", emR.getWeight());
	        System.out.printf("Name: %s%n", emR.formattedName());
	        System.out.printf("Address: %s%n", emR.formattedAddress());
	        System.out.printf("Encounter Sequence: %d%n", emR.getEncounterSequence());
	        System.out.printf("Gender: %s%n", emR.getGender());
	        System.out.printf("Submission Year: %d%n", emR.getSubmissionYear());
	        System.out.printf("Admin Via Ambulance: %s%n", emR.getAdmitViaAmbulance());
	        System.out.printf("Registration Date: %d%n", emR.getRegistrationDate());
	        System.out.printf("Registration Time: %d%n", emR.getRegistrationTime());
	        System.out.printf("Birthdate: %s%n", emR.getBirthdate());
	        System.out.println("Programmed by Himanshu Sharma Student Number:- 041076929");

		/*	TODO: Calculate the BMI for your patient record here.
		 * 		use the static method in the MedicalCalculator class along with instance variables from the
		 * 		EMRecord class.
		 */
	        double bmi = MedicalCalculator.calculateBMI(emR.getWeight(), emR.getHeight());
	        System.out.printf("BMI of %s is: %s",emR.getName(),bmi);
	        

		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\n\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
