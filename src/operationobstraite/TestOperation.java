package operationobstraite;

import fr.diginamic.banque.entites.CompteTaux;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operation[] arrOper=new Operation[5];

arrOper[0] = new Credit("24.22.24", 100);
arrOper[1] = new Credit("25.22.25", 100);
arrOper[2] = new Debit("26.22.26", 50);
arrOper[3] = new Credit("25.22.27", 100);
arrOper[4] = new Debit("26.22.28", 50);

int k=0;
for (int i=0; i<arrOper.length; i++) {
	System.out.println(arrOper[i].getType());
	if (arrOper[i].getType().equals("Credit")) {
		k=k+arrOper[i].getMontant();
	}else {
		k=k-arrOper[i].getMontant();
	}	
		arrOper[i].credit();
	arrOper[i].debit();	
}
		
System.out.println("Montant reste "+k);	
	}

}
