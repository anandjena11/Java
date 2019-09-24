package OOPConcept;

public class Testbank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USbank b =new USbank(); you can't create of object obinterface
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		
		//dynamic polymerphism -child class obj can be referenced by parent interface variable
		USBank b =new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	}
}