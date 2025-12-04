package td6.affichage;

public class Personne implements Affichable {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public void afficher() {
        System.out.println("Personne : " + nom + ", âge : " + age);
    }
}
