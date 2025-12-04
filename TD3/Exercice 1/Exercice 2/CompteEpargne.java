package td5.banque;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String numero, double soldeInitial, double tauxInteret) {
        super(numero, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public boolean retirer(double montant) {
        if (solde - montant >= 0) {
            solde -= montant;
            return true;
        } else {
            return false;
        }
    }
}
