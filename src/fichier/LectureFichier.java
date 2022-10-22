package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		List<Ville> listeVille = new ArrayList<Ville>();//liste de objet
		
    	
		List<String> lines = new ArrayList<String>();	//1 mier list
    	
		
		Path pathFile = Paths.get("C:/recensement.csv");
		Path path2 = Paths.get("C:\\Temp\\test.txt");
		
		
		
			try {
				lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);			
			} catch (IOException e) {
		        throw new RuntimeException(e);
		    }
			
			

			for ( int i=1; i<lines.size();i++) {
				String[] tokens = lines.get(i).split(";");
				listeVille.add(new Ville(tokens[0],tokens[1], tokens[6], tokens[9]));				
				
			}	
			
			//for ( Ville villes: listeVille) {
				
				//System.out.println(villes.getNom()+" "+villes.getCode()+" "+villes.getNomReg()+""+villes.getPopup());
								
			//}	
						
	try {
				List<String> lines2 = new ArrayList<String>();	
				
				for ( Ville villes: listeVille) {	
					
					
					String st= villes.getPopup().replaceAll(" ", "");
					  
					int number = Integer.parseInt(st);
					if (number>=25000) {
						System.out.println(st);
						System.out.println(number);
						lines2.add(villes.getNom()+";"+villes.getCode()+";"+villes.getNomReg()+";"+villes.getPopup()+";");
						Files.write(path2, lines2, StandardCharsets.UTF_8);					
					}							
			}						
			} catch (IOException e) {
		       throw new RuntimeException(e);
		 }
			
			
			
		}	
	}

