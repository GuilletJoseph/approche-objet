package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import sets.Pays;

public class PaysServ {

private  HashSet<Pays> set;
	



	public void setList(HashSet<Pays> set) {
		
		this.set = set;
			
		}



		public void recherchePlusPib() {
			int m=0;
			String st;
			for (Pays  myUser : set) {
if(m<myUser.getPibHb()) {
	
	m=myUser.getPibHb();
	st=myUser.getNom();
}
					
				}
			System.out.println(m);
			
		};


		
		public void modifMnPib() {
			int m=0;
			String st = "";
			for (Pays  myUser : set) {
						
			if (m<myUser.getPibHb()) {
				st=myUser.getNom();	
			}
			}
         System.out.println(st);


         for (Pays  myUser : set) {
        	 if (myUser.getNom().equals("Chine")) {	
        		 String st1=st.toUpperCase();
        		 myUser.setNom(st1);
 			}
 			}
		}
		
		
		public void afficheList() {
			
			
			for (Pays myUser : set) {
				System.out.println(myUser.getNom()+myUser.getNbHb()+" "+myUser.getPibHb());
				}
			
		}
	
	

}
