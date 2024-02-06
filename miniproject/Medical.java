package miniproject;

import java.util.ArrayList;
import java.util.List;

public class Medical {
    public List<Patient> patients =new ArrayList<>();
    public List<Doctor> doctors = new ArrayList<>();

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
    
    public void addPatient(String name, int age, String medicalRecord) 
    {
        patients.add(new Patient(name, age, medicalRecord));
        System.out.println("Patient added Successfully!");
    }

    public void addDoctor(String name, String specialization) {
        doctors.add(new Doctor(name, specialization));
        System.out.println("Doctor added Successfully!");
    }
    
    public void viewPatientList(List<Patient> patients) {
        System.out.println("\nPatient List:");
        System.out.printf("%-20s%-10s%-20s\n", "Name", "Age", "Medical Record");
        System.out.println("----------------------------------------------------------");
        for (Patient patient : patients) {
            System.out.printf("%-20s%-10d%-20s\n", patient.getName(), patient.getAge(), patient.getMedicalRecord());
        }
    }
    
    public void viewDoctorList(List<Doctor> doctors) {
        System.out.println("\nDoctor List:");
        System.out.printf("%-20s%-20s\n", "Name", "Specialization");
        System.out.println("----------------------------------------------------------");
        
        for (Doctor doctor : doctors) {
            System.out.printf("%-20s%-20s\n", doctor.getName(), doctor.getSpecialization());
        }
    }
    
    public void bookAppointment(String patientName, String doctorName, String appointmentTime) {
        Patient patient = findPatient(patientName);
        Doctor doctor = findDoctor(doctorName);

        if (patient != null && doctor != null) {
            String appointmentDetails = "Appointment with Dr. " + doctor.getName() +
                    " (" + doctor.getSpecialization() + ") on " + appointmentTime;
            doctor.addAppointment(appointmentDetails);
            System.out.println("Appointment booked Successfully!");
        } else {
            System.out.println("Patient or Doctor not found. Please check the names and try again.");
        }
    }

    public void viewHealthcareSuggestions(String patientName, String doctorName) {
        Doctor doctor = findDoctor(doctorName);
        if (doctor != null) {
            String healthcareSuggestions = doctor.provideHealthcareSuggestions(patientName);
            System.out.println(healthcareSuggestions);
        } else {
            System.out.println("Doctor not found. Please check the name and try again.");
        }
    }

    public void generatePrescription(String patientName, String doctorName) {
        Doctor doctor = findDoctor(doctorName);
        if (doctor != null) {
            String prescription = doctor.generatePrescription(patientName);
            System.out.println(prescription);
        } else {
            System.out.println("Doctor not found. Please check the name and try again.");
        }
    }

    

    public Patient findPatient(String patientName) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(patientName)) {
                return patient;
            }
        }
        return null;
    }

    public Doctor findDoctor(String doctorName) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(doctorName)) {
                return doctor;
            }
        }
        return null;
    }

    
}

