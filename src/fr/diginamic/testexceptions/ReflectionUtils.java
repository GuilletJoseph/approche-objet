package fr.diginamic.testexceptions;

import java.lang.reflect.*;

import javax.management.ReflectionException;



public class ReflectionUtils {
    

    public static void afficherAttributs(Object obj) throws RefException, IllegalArgumentException, IllegalAccessException {
    
    Class<?> classe = obj.getClass();
 
    Field[] fields = classe.getDeclaredFields();
  
    for (Field field : fields) {
  
    field.setAccessible(true);
    if (field.get(obj)== null) {
        throw new RefException("L'objet doit etre not null"); 
    }
    System.out.println("La valeur de l'attribut " + field.getName() + " est " +
    field.get(obj).toString());
    
    
    
    
    
    }
    }
}

