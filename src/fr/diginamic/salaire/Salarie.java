package fr.diginamic.salaire;

public class Salarie extends Intervenant
{
	private int montant;
	private int salaireMen;
	private String fonc;
	
	public Salarie(String nom, String prenom, String fonc) {
		super(nom, prenom);
		this.fonc=fonc;
		this.salaireMen=2500;
		
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void getSalaire() {
		// TODO Auto-generated method stub
		System.out.println(nom+" "+prenom+" "+montant+" "+salaireMen+" "+fonc);
	}


}
