package fichier;

public class Ville {
private String nom;
private String code;
private String nomReg;
private String popup;
public Ville(String nom, String code, String nomReg, String popup) {
	super();
	this.nom = nom;
	this.code = code;
	this.nomReg = nomReg;
	this.popup = popup;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getNomReg() {
	return nomReg;
}
public void setNomReg(String nomReg) {
	this.nomReg = nomReg;
}
public String getPopup() {
	return popup;
}
public void setPopup(String popup) {
	this.popup = popup;
}
@Override
public String toString() {
	return "Ville [nom=" + nom + ", code=" + code + ", nomReg=" + nomReg + ", popup=" + popup + "]";
}
	



	
	
	
}
