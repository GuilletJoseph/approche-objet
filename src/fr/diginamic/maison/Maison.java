package fr.diginamic.maison;

public class Maison {

	private Piece [] arrPiece=new Piece[0];
	
	public void ajouterPiece(Piece piece) {		
		
		Piece [] arr2 = new Piece[arrPiece.length+1];    //creer deuxieme table    
        System.arraycopy(arrPiece, 0, arr2, 0, arrPiece.length); //copier au table arr2
        arrPiece=arr2;  //ajouter au table arr
        arrPiece[arrPiece.length-1]=piece;		
	}
	
	
	public int getNbEtage() {
		int k=0;
		for (int i=0; i<arrPiece.length; i++) {
			if (k<arrPiece[i].getEtage())
		    k=arrPiece[i].getEtage();
		}
		return k;
	}
	
	
	public int getNbType() {
		int k=0;
		for (int i=0; i<arrPiece.length; i++) {
			if (k<arrPiece[i].getType())
		    k=arrPiece[i].getType();
		}
		return k;
	}
	
	public double getSuperficieTotale() {
		double k=0;
		for (int i=0; i<arrPiece.length; i++) {
		k=arrPiece[i].getSuperficie()+k;
		}
		return k;
	}
	
	public double getSuperficieParEtage(int etage) {
		double k=0;
		int f=etage;
		for (int i=0; i<arrPiece.length; i++) {
			if (f==arrPiece[i].getEtage())
		k=arrPiece[i].getSuperficie()+k;
		}
		return k;
	}
	
	
	public double getSuperficieParTypePiece(int type) {
		double k=0;
		int f=type;
		for (int i=0; i<arrPiece.length; i++) {
			if (f==arrPiece[i].getType())
		k=arrPiece[i].getSuperficie()+k;
		}
		return k;
	}
	
	public int getNbPiecesParTypePiece(int type) {
		int k=0;
		int f=type;
		for (int i=0; i<arrPiece.length; i++) {
			if (f==arrPiece[i].getType())
		k++;
		}
		return k;
	}
	
	
	
	
	
}
