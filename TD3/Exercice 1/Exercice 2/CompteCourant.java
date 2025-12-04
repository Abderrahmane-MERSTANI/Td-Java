package td5.banque;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numero, double soldeInitial, double decouvertAutorise) {
        super(numero, soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public boolean retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
            return true;
        } else {
            return false;
        }
    }
}
