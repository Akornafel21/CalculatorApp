package uebung2;

public class Patient implements Displayable {
    private String name;
    private int patientId;

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
}
