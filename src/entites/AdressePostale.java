package entites;

public class AdressePostale {
private int numeroRue;
private String adress;
private String codePostal;
private String ville;

public AdressePostale() {
	super();
	// TODO Auto-generated constructor stub
}

public AdressePostale(int numeroRue, String adress, String codePostal, String ville) {
	super();
	this.numeroRue = numeroRue;
	this.adress = adress;
	this.codePostal = codePostal;
	this.ville = ville;
}

public int getNumeroRue() {
	return numeroRue;
}

public void setNumeroRue(int numeroRue) {
	this.numeroRue = numeroRue;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getCodePostal() {
	return codePostal;
}

public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}


public void setAdressePostale(int i, String string, String string2, String string3) {
	// TODO Auto-generated method stub
	this.numeroRue = i;
	this.adress = string;
	this.codePostal = string2;
	this.ville = string3;
}

public void getAdressePostale() {
	// TODO Auto-generated method stub
	System.out.println(numeroRue + " "+ adress + " " + codePostal+ " " + ville );
}


	
	
}
