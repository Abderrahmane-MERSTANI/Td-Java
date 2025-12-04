public TestPersonnes {
    public static void main(String [] args){
        list<Personne> personne = new Arraylist<> ();
        
        personne.add(new Personne("Akram","Lemtabti",20));
        personne.add(new Etudiant("Abde","Merstani",19));
        personne.add(new Enseignant("Aziz","Merstani",39));
        
        for(personne p : personne){
            p.personne();
        }
    }
}