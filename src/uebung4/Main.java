package uebung4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<Displayable> liste = new ArrayList<>();
        HealthManagement hm = new HealthManagement();

        try {
            Doctor d = hm.findDoctorById(546);
            System.out.println("Gefunden: ");

        }

        Set<Patient> patienten = new HashSet<>();

        Patient p1 = new Patient("Anna", 21);
        Patient p2 = new Patient("Bob", 22);
        Patient p3 = new Patient("Carl", 21);

        patienten.add(p1);
        patienten.add(p2);
        patienten.add(p3);

        Map<Integer, Doctor> doctors = new HashMap<>();

        Doctor d1 = new Doctor("Tim", 464);
        Doctor d2 = new Doctor("Mary", 332);

        doctors.put(d1.getDoctorId(), d1);
        doctors.put(d2.getDoctorId(), d2);

        zeigeAllePatienten(patienten);
        zeigeAlleAerzte(doctors);


        // Schleife über alle Objekte und displayInfo() aufrufen
//        for (Displayable obj : liste) {
//            obj.displayInfo();
//        }
    }
    public static void zeigeAllePatienten(Set<Patient> patienten){
        System.out.println("Alle Patienten: ");
        for (Patient p : patienten) {
            p.displayInfo();
        }
    }

    public static void zeigeAlleAerzte(Map<Integer, Doctor> doktoren){
        System.out.println("Alle Aerzte: ");
        for (Doctor d : doktoren.values()) {
            d.displayInfo();
        }
    }
}
