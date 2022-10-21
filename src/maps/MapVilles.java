package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> mapVille = new HashMap<>();
		mapVille.put("Nice", 343000);
		mapVille.put("Carcassonne", 47800);
		mapVille.put("Narbonne", 53400 );
		mapVille.put("Lyon", 484000);
		mapVille.put("Foix", 9700);
		mapVille.put("Pau", 77200);
		mapVille.put("Marceille", 850700);
		mapVille.put("Tarbes", 40600);
		int m=mapVille.get("Nice");
		for (String key:mapVille.keySet()) {
			
			if ( m > mapVille.get(key)) {
				m=mapVille.get(key);
			}
				
		}
for (String key:mapVille.keySet()) {
			
			if ( mapVille.get(key).equals(m)) {
				mapVille.remove(key);
			}
				
		}
		System.out.println(mapVille);
		
	}

}
