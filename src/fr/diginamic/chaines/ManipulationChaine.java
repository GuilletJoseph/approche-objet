package fr.diginamic.chaines;
import entites.Salarie;
public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longeur de chaine String "+chaine.length());
		System.out.println("L'index de premier ; "+ chaine.indexOf(';'));
		System.out.println("Affichage de nom "+ chaine.substring(0,6));
		System.out.println("trouver le nom, prenom... ");
		System.out.println("Affichage de nom Uppercase "+ chaine.toUpperCase().substring(0,6));
		System.out.println("Affichage de nom lowerrcase "+ chaine.toLowerCase().substring(0,6));
		chaine = chaine.replaceAll("\\s", "");
		 String[] splitString = chaine.split(";"); 
		 
		 for (String s : splitString) { 
		 System.out.println(s); 
		 }
		 
		 String nom=splitString[0];
		 String prenom=splitString[1];
		 Double sal=Double.parseDouble(splitString[2]);
		 
		 Salarie salarie=new Salarie (nom, prenom, sal);
		 
		 salarie.affiche();
		 
		 
	
	}
	
	

}
