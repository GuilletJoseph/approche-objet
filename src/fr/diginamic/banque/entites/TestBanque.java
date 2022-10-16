package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Compte comp=new Compte(24024,  235 );
    
    //System.out.println(comp.numeroCompte+comp.soldeCompte);
    //respecte pas l'incapsulation
    
    comp.Affiche();//avec incapsulation
	}

}
