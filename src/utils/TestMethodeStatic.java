package utils;
import java.lang.Integer;
import java.lang.Math;
public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "12";
		
        try{
            int num = Integer.parseInt(chaine);
            System.out.println(num); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        int a = 15;
        int b=10;
        System.out.println(Integer.MAX_VALUE);
        int max = Math.max(a, b);
        System.out.printf("Maximum de  variables %d et %d utilisant Math.max() est %d %n", a, b, max);
        
        
	}

}
