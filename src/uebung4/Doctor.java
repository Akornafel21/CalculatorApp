package uebung4;

// Doctor.java (doctorId als int für Map<Integer, Doctor>)
public class Doctor implements Displayable {
    private String name;
    private int doctorId;

    public Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Arztname: " + name + ", Arzt-ID: " + doctorId);
    }
}