package uebung4;

// Patient.java (erweitert mit equals und hashCode für HashSet)
import java.util.Objects;

public class Patient implements Displayable {
    private String name;
    private String patientId;

    public Patient(String name, String patientId) {
        this.name = name;
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patientenname: " + name + ", Patient-ID: " + patientId);
    }

    // Für HashSet: equals und hashCode überschreiben
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientId, patient.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }
}