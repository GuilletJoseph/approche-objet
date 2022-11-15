package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
 
        for (Saison st : Saison.values()) {
        System.out.println(st.getLibelle());
        }
        
        
        
        String nom = "ETE";
        Saison ete = Saison.valueOf(nom);
        System.out.println(ete.getLibelle()+" "+ete.getNumOrdre());
        
        
        String libelle= "Hiver"; // si pas equals
        Saison saison1 = null;
        try {
            saison1 = Saison.trouveLib(libelle);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(saison1.getLibelle());
        
        
    }

}
