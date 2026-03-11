
public class DemoCustMain {
	public static void main(String[] args) {
		// ToDo 
		
		CustomerSignUp  cust;   // reference variable
		cust = new CustomerSignUp(); 
		cust.custId=111;
		cust.custName= " java";
		cust.custHt= 5.9f;
		cust.custMob = " 12345";
		// invoking the method 
		cust.showCustProfile();
		CustomerSignUp cust2 = new CustomerSignUp(222, "spring", null, 0);
		cust.showCustProfile();
		CustomerSignUp cust3 =cust2;
		cust3.showCustProfile();
		
		System.out.println("hashcode of cust" + cust.hashCode());
		System.out.println("hashcode of cust" + cust2.hashCode());

		System.out.println("hashcode of cust" + cust3.hashCode());
//		cust2 =null;
//		cust.showCustProfile();
//		cust3=cust2;
//		cust2.showCustProfile();
//		
				

	}
	

}
