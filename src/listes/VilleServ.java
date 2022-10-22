package listes;

import java.util.List;
import listes.Ville;

public class VilleServ {
	
	
	private  List<Ville> liste1;
	
	public void setList(List<Ville> liste1) {
		
		this.liste1 = liste1;
			
		}



		public void recherchePlus() {
			int m=liste1.get(0).getNbHabit();
			int  f=0;
			for (int i=0; i<liste1.size(); i++) {
				if (m<liste1.get(i).getNbHabit()) {
					f=liste1.indexOf(liste1.get(i));
				}		
			}
			
			System.out.println(liste1.get(f).getNom() +" "+ liste1.get(f).getNbHabit());	
		}

		public void supprimeM() {
			int m=0;
			int  f=liste1.get(0).getNbHabit();
			
			for (int i=0; i<liste1.size(); i++) {
				if (f>liste1.get(i).getNbHabit()) {
				f=liste1.get(i).getNbHabit();
				m=i;
				}		
			}			
			liste1.remove(m); 	
		}


		public void modifierPlus100() {
			int  f=100000;
			
			for (int i=0; i<liste1.size(); i++) {
				if (f>liste1.get(i).getNbHabit()) {
					liste1.get(i).setNom(liste1.get(i).getNom().toUpperCase());
			   
				}		
			}			
			
		}



		public void afficheList() {
			
			for (int i=0; i<liste1.size(); i++) {
				System.out.println(liste1.get(i).getNom() +" "+ liste1.get(i).getNbHabit());	
				}				
		}

}
