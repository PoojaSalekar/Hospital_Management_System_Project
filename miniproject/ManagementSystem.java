package miniproject;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ManagementSystem {
	public static void main(String[] args) {
		Medical medicalSystem = new Medical();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================================================");
		System.out.println("\t Welcome To Hospital Management System\t");
		System.out.println("========================================================");
		while (true) 
		{
			System.out.println("\n1. Add Patient");
			System.out.println("2. Add Doctor");
			System.out.println("3. Book Appointment");
			System.out.println("4. View Healthcare Suggestions");
			System.out.println("5. Generate Prescription");
			System.out.println("6. View Patient List");
			System.out.println("7. View Doctor List");
			System.out.println("8. Exit\n");
			System.out.print("Enter your choice: ");

			try {
					int choice = sc.nextInt();
					sc.nextLine(); 
	
					switch (choice) 
					{
						case 1:	System.out.print("Enter Patient Name: ");
								String patientName = sc.nextLine();
								System.out.print("Enter Patient Age: ");
								int patientAge = sc.nextInt();
								sc.nextLine(); // Consume the newline character
								System.out.print("Enter Medical Record: ");
								String medicalRecord = sc.nextLine();
								medicalSystem.addPatient(patientName, patientAge, medicalRecord);
								break;
						
						case 2:	System.out.print("Enter Doctor Name: ");
								String doctorName = sc.nextLine();
								System.out.print("Enter Doctor Specialization: ");
								String specialization = sc.nextLine();
								medicalSystem.addDoctor(doctorName, specialization);
								break;
						
						case 3:	System.out.print("Enter Patient Name: ");
								patientName = sc.nextLine();
								System.out.print("Enter Doctor Name: ");
								doctorName = sc.nextLine();
								System.out.print("Enter Appointment Time: ");
								String appointmentTime = sc.nextLine();
								medicalSystem.bookAppointment(patientName, doctorName, appointmentTime);
								break;
					
						case 4:	System.out.print("Enter Patient name: ");
								patientName = sc.nextLine();
								System.out.print("Enter Doctor name: ");
								doctorName = sc.nextLine();
								medicalSystem.viewHealthcareSuggestions(patientName, doctorName);
								break;
					
						case 5:	System.out.print("Enter Patient Name: ");
								patientName = sc.nextLine();
								System.out.print("Enter Doctor Name: ");
								doctorName = sc.nextLine();
								medicalSystem.generatePrescription(patientName, doctorName);
								break;
					
						case 6:	medicalSystem.viewPatientList(medicalSystem.getPatients());
								break;
					
						case 7:	medicalSystem.viewDoctorList(medicalSystem.getDoctors());
								break;
					
						case 8: System.out.println("Exiting the program. Goodbye!");
								System.exit(0);
	
						default:System.out.println("Invalid choice. \n Please Enter a number between 1 and 9.");
					}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				sc.nextLine(); // Clear the input buffer
			}
		}
		
	}
	
}
