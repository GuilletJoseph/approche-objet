package fr.diginamic.banque.entites;

public class Compte {
 protected int numeroCompte;
 protected int soldeCompte;
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
 

public int getNumeroCompte() {
	return numeroCompte;
}

public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}

public int getSoldeCompte() {
	return soldeCompte;
}

public void setSoldeCompte(int soldeCompte) {
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
