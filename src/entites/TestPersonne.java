package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new AdressePostale();
Personne p1=new Personne("GUILLET","Joseph");
Personne p2=new Personne("Guillet","Elnur", ap1);

	}

}
