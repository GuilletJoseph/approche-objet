package sets;

import java.util.HashSet;

public class TestSetString {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			
			HashSet<String> set = new HashSet<>();
			set.add("USA");
			set.add("France");
			set.add("Allemagne");
			set.add("UK");
			set.add("Italie");
			set.add("Japon");
			set.add("Chine");
			set.add("Russie");
			set.add("Inde");
			
			System.out.println("Recherchez le pays dans cette liste qui a le plus grand nombre de lettres");
			String st="";
			for (String  myUser : set) {

				if(st.length()<myUser.length()) {
					
					st=myUser;
					
				}
				
				}	
			System.out.println(st);
			set.remove(st);
			
			System.out.println(" ");
			
			
			for (String  ms : set) {

				System.out.println(ms);
					
				}
			
			
			
			
	}

}
