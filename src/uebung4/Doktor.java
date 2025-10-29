package uebung4;

public class Doktor implements Displayable {
    private String name;
    private int doctorId;

    public Doktor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
    }

    public int getDoktorId() {
        return doctorId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Arztname: " + name + ", Arzt-ID: " + doctorId);
    }
}
