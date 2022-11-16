package annotations;




public class Pays {
    @ToString(separator="_", upperCase=true)
private String nom;
private int nbHb;
private int pibHb;



public Pays(String nom, int nbHb, int pibHb) {
	super();
	this.nom = nom;
	this.nbHb = nbHb;
	this.pibHb = pibHb;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNbHb() {
	return nbHb;
}
public void setNbHb(int nbHb) {
	this.nbHb = nbHb;
}
public int getPibHb() {
	return pibHb;
}
public void setPibHb(int pibHb) {
	this.pibHb = pibHb;
}
@Override




public String toString() {
    return "Pays [nom=" + nom + ", nbHb=" + nbHb + ", pibHb=" + pibHb + "]";
}
	
	
}
