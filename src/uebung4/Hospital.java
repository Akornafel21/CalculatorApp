package uebung4;

// HealthManagement.java (erweitert für Aufgabe 5)
import java.util.*;

public class Hospital {

    // Methode zur Anzeige aller Patienten aus dem Set
    public static void displayAllPatients(Set<Patient> patients) {
        System.out.println("Liste der Patienten:");
        for (Patient patient : patients) {
            patient.displayInfo();
        }
    }

    // Methode zur Anzeige aller Ärzte aus der Map
    public static void displayAllDoctors(Map<Integer, Doctor> doctors) {
        System.out.println("\nListe der Ärzte:");
        for (Doctor doctor : doctors.values()) {
            doctor.displayInfo();
        }
    }

    public static void main(String[] args) {
        // Mehrere Patienten erstellen
        Patient patient1 = new Patient("Sarah", "001");
        Patient patient2 = new Patient("Anna", "002");
        Patient patient3 = new Patient("Sarah", "001"); // Duplikat!

//        // HashSet für Patienten (verhindert Duplikate)
//        Set<Patient> patientSet = new HashSet<>();
//        patientSet.add(patient1);
//        patientSet.add(patient2);
//        patientSet.add(patient3); // Wird nicht hinzugefügt (Duplikat)

        // Mehrere Ärzte erstellen
        Doctor doctor1 = new Doctor("Dr. Müller", 221);
        Doctor doctor2 = new Doctor("Dr. Schmidt", 222);
        Doctor doctor3 = new Doctor("Dr. blabla", 222);

        // HashMap für Ärzte (Doctor-ID als Schlüssel)
        Map<Integer, Doctor> doctorMap = new HashMap<>();
        doctorMap.put(doctor1.getDoctorId(), doctor1);
        doctorMap.put(doctor2.getDoctorId(), doctor2);
        doctorMap.put(doctor3.getDoctorId(), doctor3);


        // Methoden aufrufen zur Anzeige
//        displayAllPatients(patientSet);
        displayAllDoctors(doctorMap);
    }
}

