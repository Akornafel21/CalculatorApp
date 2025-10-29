package uebung4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<Displayable> liste = new ArrayList<>();
        Set<Patient> patienten = new HashSet<>();

        Patient p1 = new Patient("Anna", 21);
        Patient p2 = new Patient("Bob", 22);
        Patient p3 = new Patient("Carl", 21);

        patienten.add(p1);
        patienten.add(p2);
        patienten.add(p3);

        Map<Integer, Doktor> doktoren = new HashMap<>();

        Doktor d1 = new Doktor("Tim", 464);
        Doktor d2 = new Doktor("Mary", 332);

        doktoren.put(d1.getDoktorId(), d1);
        doktoren.put(d2.getDoktorId(), d2);

        zeigeAllePatienten(patienten);
        zeigeAlleAerzte(doktoren);


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

    public static void zeigeAlleAerzte(Map<Integer, Doktor> doktoren){
        System.out.println("Alle Aerzte: ");
        for (Doktor d : doktoren.values()) {
            d.displayInfo();
        }
    }
}
