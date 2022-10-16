package fr.diginamic.banque.entites;

public class Compte {
 private int numeroCompte;
 private int soldeCompte;
 private Compte cmtp;
public Compte() {
	super();
	// TODO Auto-generated constructor stub
}



public Compte(int numeroCompte, int soldeCompte) {
	super();
	this.numeroCompte = numeroCompte;
	this.soldeCompte = soldeCompte;
}
 



public void Affiche() {
	 System.out.println(numeroCompte +" "+soldeCompte);	 
}



public Compte getCmtp() {
	return cmtp;
}



public void setCmtp(Compte cmtp) {
	this.cmtp = cmtp;
}



public String stringAffiche() {
	 return cmtp.toString();	 
}
 
}
