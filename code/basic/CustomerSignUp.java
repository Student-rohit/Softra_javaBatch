
public class CustomerSignUp {
	// properties 
	int custId;
	String custName;
	String custMob;
	float custHt;
	
	// constructor 
	// default  / no-arg  /
	public CustomerSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		// overloaded constructor
	public CustomerSignUp(int custId, String custName, String custMob, float custHt) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.custHt = custHt;
	}
	
	// method- default method / zero - method / no - method
	void showCustProfile() {
	    System.out.println("Customer profile is: " + custId + " " + custName);
	}

}


