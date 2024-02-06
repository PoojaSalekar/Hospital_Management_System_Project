package miniproject;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public String name;
    public String specialization;
    public List<String> appointments;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public void addAppointment(String appointment) {
        appointments.add(appointment);
    }

    public String provideHealthcareSuggestions(String patientName) {
        // Simulating healthcare suggestions based on patient's condition
        return "Healthcare suggestions for Patient " + patientName + ": Rest and take Prescribed medication.";
    }

    public String generatePrescription(String patientName) {
        // Simulating e-prescription generation
        return "Prescription for Patient " + patientName + ": Take medicine X, Y, Z as Prescribed.";
    }

   
}

