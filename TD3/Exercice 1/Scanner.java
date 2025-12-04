package td5.devices;

public class Scanner extends Appareil {
    private int vitesse;

    public Scanner(String marque, int vitesse) {
        super(marque);
        this.vitesse = vitesse;
    }

    @Override
    public void allumer() {
        System.out.println("Scanner " + marque + " allumé avec vitesse " + vitesse);
    }
}
