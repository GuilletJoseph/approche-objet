package sets;

import java.util.HashSet;

public class TestSetDouble {
	
	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		
		System.out.println("Afficher tous les elements");
		
		for (Double  myUser : set) {
			System.out.println(myUser);
			}	
		
		
		System.out.println(" ");
		
		
System.out.println("Recherchez le plus grand élément de la collection");
		
double m=0;


for (Double  myUser : set) {
	
	if (m<myUser) {
		m=myUser;
	}		
	
	}			
System.out.println(m);			
		System.out.println(" ");
	
		
		System.out.println("Recherchez le plus petit élément de la collection et supprimer");		
		double f=0;


		for (Double  myUser : set) {
			
			if (f>myUser) {
				f=myUser;
				
			}		
			
			}			
		System.out.println(f);	
		set.remove(f);
		
		
		
		
				System.out.println(" ");	
		
		
				System.out.println("Afficher tous les elements apres modification");
		
				for (Double  myUser : set) {
					System.out.println(myUser);
					}	
		
		
		
		
	}

}
