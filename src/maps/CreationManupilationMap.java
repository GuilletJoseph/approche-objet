package maps;

import java.util.HashMap;

public class CreationManupilationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(25, "Lille");
		mapVilles.put(34, "Lyon");
		mapVilles.put(13, "Bordeaux");
		for (String cle: mapVilles.values()) {
			System.out.println(cle);
			
		}
		for (Integer val: mapVilles.keySet()) {
			System.out.println(val);
			
		}
		System.out.println(mapVilles.size());
		
		
	}

}
