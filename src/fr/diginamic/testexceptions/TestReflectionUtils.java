package fr.diginamic.testexceptions;

import javax.management.ReflectionException;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestReflectionUtils {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException  {
        // TODO Auto-generated method stub
//Ville ville= new Ville("New York",8_804_190,Continent.AMERIQUE);
Ville ville =new Ville();

        try {
            ReflectionUtils.afficherAttributs(ville);
        } catch (RefException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

}
}