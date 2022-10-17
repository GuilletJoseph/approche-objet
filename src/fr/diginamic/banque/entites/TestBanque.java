package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
	CompteTaux [] arrCompte=new CompteTaux[2];
	arrCompte[0] = new CompteTaux(2422024, 560);
	arrCompte[1] = new CompteTaux(25025, 565, 34);

	for (int i=0; i<arrCompte.length; i++) {
		
		arrCompte[i].Affiche();
		
	}
	
	
	
    CompteTaux comp=new CompteTaux(24024,  235, 25);
    
    //System.out.println(comp.numeroCompte+comp.soldeCompte);
    //respecte pas l'incapsulation   
    comp.Affiche();//avec incapsulation
    comp.setCmtp(comp);
    System.out.println(comp.stringAffiche());   
    System.out.println();
    
    
    
    
	}


}
