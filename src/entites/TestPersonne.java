package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new AdressePostale(13,"rue Bla Bla", "44300", "Nantes");
Personne p1=new Personne("guillet", "Joseph");
Personne p2=new Personne("guillet", "Elnur",ap1);
System.out.println("Nom et prenom avant de changement");
//appel methode Affiche
p1.Affiche();
p2.Affiche2();




p1.setNom("MADIER");
p1.setPrenom("Adam");

p1.getNom();
p1.getPrenom();
System.out.println("Nom et prenom apres de changement");
p1.Affiche();
	}

}
