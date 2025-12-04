package td6.affichage;

import java.util.ArrayList;
import java.util.List;

public class Afficheur {
    public static void main(String[] args) {
        List<Affichable> liste = new ArrayList<>();
        liste.add(new Personne("Alice", 25));
        liste.add(new Produit("Stylo", 1.5));
        liste.add(new Cours("Mathématiques", 40));
        liste.add(new Personne("Bob", 30));
        liste.add(new Produit("Cahier", 3.0));

        for (Affichable a : liste) {
            a.afficher();
        }
    }
}
