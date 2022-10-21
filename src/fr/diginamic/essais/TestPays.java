package fr.diginamic.essais;

import java.util.HashSet;

import sets.Pays;
import sets.PaysServ;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pays usa=new Pays("Usa", 200000, 2300);
		Pays france=new Pays("France", 340000, 1500);
		Pays allemagne=new Pays("Allemagne", 560000, 2000);
		Pays uk=new Pays("Uk", 400000, 1300);
		Pays italie=new Pays("Italie", 140000, 1800);
		Pays japon=new Pays("Japon", 700000, 1600);
		Pays chine=new Pays("Chine", 340000, 200);
		Pays russie=new Pays("Russie", 170000, 2600);
		Pays inde=new Pays("Inde", 480000, 1400);
		
		
		HashSet<Pays> set = new HashSet<>();
		set.add(usa);
		set.add(france);
		set.add(allemagne);
		set.add(uk);
		set.add(italie);
		set.add(japon);
		set.add(chine);
		set.add(russie);
		set.add(inde);
		
		
		
		PaysServ paysservice=new PaysServ();
		paysservice.setList(set);
		paysservice.recherchePlusPib();
		paysservice.modifMnPib();
		paysservice.afficheList();
		
		
		
		
		
		
		
		
	}

}
