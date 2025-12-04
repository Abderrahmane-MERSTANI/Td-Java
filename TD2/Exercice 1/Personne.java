public class Personne
{
	public static void main(String[] args) {
		protected String nom ;
		protected String prenom ;
		protected int age ;
		
		public Personne(String nom , String prenom , int age){
		    this.nom = nom;
		    this.prenom = prenom;
		    this.age = age;
		}
		
		public void sePresenter(){
		    System.out.println("Je m'appelle "+this.nom+" "+this.prenom+"j'ai "+this.age+"ans");
		}
	}
}