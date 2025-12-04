public class Enseignant extends Personne{
    private String specialite;
        
        public Enseignant(String nom , String prenom , int age , String specialite){
            super(nom,prenom,age);
            this.specialite = specialite ;
        }
        
        public void sePresenter(){
            super.sePresenter();
            System.out.println("Ma specialite est " +this.specialite);
        }
}