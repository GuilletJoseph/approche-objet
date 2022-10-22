package fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		
		
		
		Path path = Paths.get("C:/recensement.csv");
		Path path2 = Paths.get("C:\\Temp\\test.txt");
            if (!Files.exists(path2)) {
                
                Files.createFile(path2);
                System.out.println("Fiche ete cree!");
            } else {
                System.out.println("Fiche deja existe");
            }
                       
            try {
            	
            	List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            	
            	
            	int f= lines.size()-(lines.size()-5);
            			
            	List<String> lines2 = new ArrayList<String>();	
            	for (int i=1; i<=f;i++) {
            		lines2.add(lines.get(i));
    				System.out.println(lines.get(i));
    			}
            	Files.write(path2, lines2);
    			} catch (IOException e) {
    		        throw new RuntimeException(e);
    		    }	

 
    }

	}

