package uebung2;

import java.util.Objects;

public class Patient implements Displayable {
    private String name;
    private int patientId;

    // ein Konstruktor initialisiert die Attribute
    // die Werte werden übernommen und oben gespeichert
    public Patient(String name, int patientId) {
        this.name = name;
        this.patientId = patientId;
    }

    public int getPatientId(){
        return patientId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patientname: " + name + ", Patient-ID: " + patientId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient p)) return false;
        return patientId == p.patientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }
}
