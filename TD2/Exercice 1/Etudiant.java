public class Etudiant extends Personne
{
	private String filiere;
		
		public Etudiant(String nom , String prenom , int age , String filiere){
		    super(nom , prenom , age);
		    this.filiere = filiere ;
		}
		
		public void sePresenter(){
		    super.sePresenter();
		    System.out.out.println("ma filiere est "+ this.filiere);
		}
}