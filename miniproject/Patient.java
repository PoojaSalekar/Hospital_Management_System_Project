package miniproject;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    public String name;
    public int age;
    public String medicalRecord;

    public Patient(String name, int age, String medicalRecord) {
        this.name = name;
        this.age = age;
        this.medicalRecord = medicalRecord;
        
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    
}
