package td5.banque;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[4];
        comptes[0] = new CompteCourant("CC01", 500, 200);
        comptes[1] = new CompteEpargne("CE01", 1000, 0.03);
        comptes[2] = new CompteCourant("CC02", 300, 100);
        comptes[3] = new CompteEpargne("CE02", 200, 0.02);

        comptes[0].deposer(200);
        comptes[0].retirer(800);
        comptes[0].afficherSolde();

        comptes[1].retirer(1100);
        comptes[1].deposer(500);
        comptes[1].afficherSolde();

        comptes[2].retirer(350);
        comptes[2].afficherSolde();

        comptes[3].deposer(100);
        comptes[3].retirer(250);
        comptes[3].afficherSolde();
    }
}
