package td5.banque;

public abstract class Compte {
    protected String numero;
    protected double solde;

    public Compte(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public abstract boolean retirer(double montant);

    public void afficherSolde() {
        System.out.println("Compte " + numero + " : solde = " + solde);
    }
}
