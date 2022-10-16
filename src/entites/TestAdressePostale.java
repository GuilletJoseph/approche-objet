package entites;

public class TestAdressePostale {

	
	public static void main (String[] args) {
		
		AdressePostale ap1=new AdressePostale(17,"Rue des Sables d'Olonne","44100","Nantes");
		AdressePostale ap2=new AdressePostale(16, "Rue Bla,bla, bla","44000","Nantes");
		
		ap1.getAdressePostale();
		ap2.getAdressePostale();
		ap1.setAdressePostale(14, "bbb", "ddd", "ccc");
		System.out.println("variable ap1 apres cahngement");
		ap1.getAdressePostale();
	}
}
