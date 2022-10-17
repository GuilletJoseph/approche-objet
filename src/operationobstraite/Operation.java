package operationobstraite;

public abstract class Operation {
	
	protected String date;
	protected int montant;
	
	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
	
public abstract void credit();
public abstract void debit();
public abstract String getType();

}
