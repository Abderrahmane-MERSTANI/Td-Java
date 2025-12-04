package td5.devices;

import java.util.ArrayList;
import java.util.List;

public class TestAppareils {
    public static void main(String[] args) {
        List<Appareil> appareils = new ArrayList<>();
        appareils.add(new Imprimante("HP", 600));
        appareils.add(new Scanner("Canon", 30));
        appareils.add(new Imprimante("Epson", 1200));
        appareils.add(new Scanner("Brother", 20));

        for (Appareil a : appareils) {
            a.allumer();
            a.afficherInfos();
        }
    }
}
