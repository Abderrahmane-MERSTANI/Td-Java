public class Rectangle extends Forme{
    private largeur;
    private hauteur;
    
    public Cercle(double largeur,double hauteur){
        this.largeur = largeur ;
        this.hauteur = hauteur ;
    }
    
    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}