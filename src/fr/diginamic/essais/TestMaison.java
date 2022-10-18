package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Maison;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chambre chambre=new Chambre(2, 15.6, 0 );
		Chambre chambre2=new Chambre(2, 12.3, 0 );
		Chambre chambre3=new Chambre(2, 9.3, 0 );
		
		
		Cuisine cuisine=new Cuisine(1, 9.8, 1);
		Salon salon=new Salon(1, 20.2, 2);
		
		SalleDeBain sdb=new SalleDeBain(0, 12.5 , 3);
		SalleDeBain sdb2=new SalleDeBain(0, 6.5 , 3);
		
		WC wc=new WC(0, 6.5, 4);
		
		Maison maison=new Maison();
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(sdb);
		maison.ajouterPiece(sdb2);
		maison.ajouterPiece(wc);
		
		System.out.println("superficie totale de la maison "+maison.getSuperficieTotale());
		System.out.println(" ");
		System.out.println("superficie par etage ");
		System.out.println(" ");
		for (int i=0; i<=maison.getNbEtage(); i++)
		System.out.println("etage "+ i+": " +maison.getSuperficieParEtage(i)+" m carre");
		
		System.out.println("superficie par type ");
		System.out.println(" ");
		for (int i=0; i<=maison.getNbType(); i++)
		System.out.println("type "+ i+": " +maison.getSuperficieParTypePiece(i)+" m carre");
		
		System.out.println("nombre pieces par type ");
		System.out.println(" ");
		for (int i=0; i<=maison.getNbType(); i++)
		System.out.println("type "+ i+": "+maison.getNbPiecesParTypePiece(i));
		
	}
	

}
