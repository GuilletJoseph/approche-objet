package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
  private int tauxRem;
public CompteTaux( int numeroCompte, int soldeCompte, int tauxRem ) {
	super.numeroCompte=numeroCompte;
    super.soldeCompte=soldeCompte;
	this.tauxRem = tauxRem;
}

public CompteTaux( int numeroCompte, int soldeCompte) {
	super.numeroCompte=numeroCompte;
    super.soldeCompte=soldeCompte;
}

public void Affiche() {
	 System.out.println(numeroCompte +" "+soldeCompte+" "+tauxRem);	 
}


}
