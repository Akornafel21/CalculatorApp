package uebung2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Displayable> liste = new ArrayList<>();

        Patient p1 = new Patient("Anna", 21);
        Patient p2 = new Patient("Bob", 22);
        Doktor d1 = new Doktor("Tim", 46);
        Doktor d2 = new Doktor("Mary", 33);

        liste.add(p1);
        liste.add(p2);
        liste.add(d1);
        liste.add(d2);

        // Schleife über alle Objekte und displayInfo() aufrufen
        for (Displayable obj : liste) {
            obj.displayInfo();
        }
    }
}
