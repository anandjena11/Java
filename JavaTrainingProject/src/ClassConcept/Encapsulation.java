package ClassConcept;

// How to implete encapsulation
// private data variable :So that these vars can can't accessed directly from outside the class
// Advantage of encapsulation are maintaince ,flexibility  re-usability 
// Encapsulation is also called as data hidding 
public class Encapsulation {

	private int ssn;
	private String eName;
	private int eage;

	public static void main(String[] args) {

		Encapsulation obj = new Encapsulation();
		obj.seteName("Tom");
		obj.setEage(25);
		obj.setSsn(123456);

		System.out.println("Employee name is " + obj.geteName());
		System.out.println("Employee SSN is " + obj.getSsn());
		System.out.println("Employee age is " + obj.getEage());

	}
// Getter and setter methods: to set and get the values of the fields .
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

}
