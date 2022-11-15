package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps",1),
    ETE("Ete",2),
    AUTOMNE("Automne",3),
    HIVER("Hiver",4);
    
  
    public String libelle;
    public int numOrdre;
   
   
   private Saison(String libelle, int numOrdre) {
    this.libelle = libelle;
    this.numOrdre = numOrdre;
}




   
   
public String getLibelle() {
    return libelle;
}
public void setLibellé(String libelle) {
    this.libelle = libelle;
}
public int getNumOrdre() {
    return numOrdre;
}
public void setNumOrdre(int numOrdre) {
    this.numOrdre = numOrdre;
}
public static Saison trouveLib(String libelle) {
    Saison[] saisons = Saison.values();
    for (Saison saison : saisons) {
        if (saison.getLibelle().equalsIgnoreCase(libelle)) {
            return saison;
        }   
    }
    return null;
    
}   
    
    
   }
