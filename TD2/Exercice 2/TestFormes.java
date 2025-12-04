public class TestFormes {
    public static void main ( String [] args ){
        Forme[] Formes = new Forme[3];
        
        Formes[0] = new Cercle(3);
        Formes[1] = new Rectangle(2,4);
        Formes[2] = new Carre(3);
        
        for(Forme f : Formes){
            System.out.println("l'aire est " + f.aire());
            System.out.println("le perimetre est " + f.perimetre());
        }
    }
}