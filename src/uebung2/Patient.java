package uebung2;

import java.util.Objects;

public class Patient implements Displayable {
    private String name;
    private int patientId;

    // ein Konstruktor initialisiert die Attribute
    // die Werte werden übernommen und oben gespeichert
    public Patient(String name, int patientId) {
        // Überprüfung, ob der Name gültig ist:
        // 1. name == null → kein Wert übergeben
        // 2. name.trim().isEmpty() → der Name besteht nur aus Leerzeichen
        // trim() entfernt alle Leerzeichen am Anfang und Ende des Strings.
        // Wenn der Name also z. B. "   " ist, wird er nach trim() zu "",
        // und isEmpty() gibt true zurück → Exception wird geworfen.
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ungültiger Name: Name darf nicht leer oder nur aus Leerzeichen bestehen.");
        }
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
