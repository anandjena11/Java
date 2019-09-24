package OOPConcept;

public class HSBCBank implements  USBank,BrazilBank{
  // Is a relationship
	// if a class implementing any interface ,then its mandatory to define/override all methode of interface
	//Override from USBank
	@Override
	public void credit() {
		System.out.println("hsbc --credit");
		}

	@Override
	public void debit() {
		System.out.println("hsbc --debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("hsbc --transferMonday");
		
	}
	//Separate Method of USBank class
	public void educationLoan() {
		System.out.println("hsbc --educationlone");
	}
	public void carLoan() {
		System.out.println("hsbc --carlone");
		
	}
	//BrazilBank method : Override from Brazil bank
	public void MutualFund() {
		System.out.println("hsbc--mutualfund");	
		}
	

}
