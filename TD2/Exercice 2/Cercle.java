public class Cercle extends Forme{
    protected rayon;
    
    public Cercle(double rayon){
        this.rayon = rayon ;
    }
    
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}