package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder=new StringBuilder();
		
		
		
		
		long debut = System.currentTimeMillis();
		
for (int i=1;i<=100000; i++) {
			
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Test STringBUilder. Temps écoulé en millisecondes :" + (fin - debut));
		
		
		
		String st=new String();
		
		debut = System.currentTimeMillis();
		
		for (int i=1;i<=100000; i++) {
					st=st+i;
				}
				
				fin = System.currentTimeMillis();
				
				System.out.println("Test String. Temps écoulé en millisecondes :" + (fin - debut));
		
				
				
				
				
				
				
				System.out.println("StrinBuilder plus de vitesse qui String");
		
	}

}
