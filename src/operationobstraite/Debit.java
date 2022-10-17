package operationobstraite;

public class Debit  extends Operation{

	public Debit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			System.out.println(" "+date+" "+ montant);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Debit";
	}
	
	
	

}
