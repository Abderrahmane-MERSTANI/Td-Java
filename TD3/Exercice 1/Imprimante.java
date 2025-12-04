package td5.devices;

public class Imprimante extends Appareil {
    private int resolution;

    public Imprimante(String marque, int resolution) {
        super(marque);
        this.resolution = resolution;
    }

    @Override
    public void allumer() {
        System.out.println("Imprimante " + marque + " allumée avec résolution " + resolution);
    }
}
