package uebung4;

import java.util.*;

public class HealthManagement {
    private Map<Integer, Doctor> doctors = new HashMap<>();
    private Set<Patient> patienten = new HashSet<>();

    public Doctor findDoctorById(int doctorId){
        Doctor d = doctors.get(doctorId);
        if (d == null) {
            throw new NoSuchElementException("Kein Arzt mit der ID: " + doctorId + "gefunden.");
        }
        return d;
    }
}
