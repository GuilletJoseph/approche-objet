package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//List<String> liste1 = Arrays.asList(new String[] {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"});
List<String> liste1 = new ArrayList<String>();
Collections.addAll(liste1, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes" );
String s=liste1.get(0);	
	
for ( int i=0; i<liste1.size(); i++) {

	if (s.length()< liste1.get(i).length()) {
		s=liste1.get(i);
}
		
	}

System.out.println(s);

for ( int i=0; i<liste1.size(); i++) {

	String st=liste1.get(i).toUpperCase();
	liste1.set(i, st);
		System.out.println(liste1.get(i));
}


for ( int i=0; i<liste1.size(); i++) {
String st1="N";
	if (liste1.get(i).substring(0,1).equals(st1)) {
		liste1.remove(liste1.get(i)); 
	}
}


System.out.println("Affichage apres supprimer");

for ( int i=0; i<liste1.size(); i++) {
	System.out.println(liste1.get(i));
}



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}