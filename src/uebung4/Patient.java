package uebung4;

public class Patient implements Displayable {
    private String name;
    private int patientId;

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
}
