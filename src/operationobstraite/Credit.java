package operationobstraite;

public class Credit extends Operation {

	public Credit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println(" "+date+" "+ montant);
	}
	
	
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Credit";
	}
	
	
	
	

}
